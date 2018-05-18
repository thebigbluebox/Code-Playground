# import libraries
import urllib.request
import csv
from bs4 import BeautifulSoup

data_science_links = ['https://www.glassdoor.ca/Job/toronto-data-scientist-jobs-SRCH_IL.0,7_IC2281069_KO8,22.htm',
                      'https://www.glassdoor.ca/Job/toronto-data-scientist-jobs-SRCH_IL.0,7_IC2281069_KO8,22_IP2.htm',
                      'https://www.glassdoor.ca/Job/toronto-data-scientist-jobs-SRCH_IL.0,7_IC2281069_KO8,22_IP3.htm',
                      'https://www.glassdoor.ca/Job/toronto-data-scientist-jobs-SRCH_IL.0,7_IC2281069_KO8,22_IP4.htm',
                      'https://www.glassdoor.ca/Job/toronto-data-scientist-jobs-SRCH_IL.0,7_IC2281069_KO8,22_IP5.htm',
                      'https://www.glassdoor.ca/Job/toronto-data-scientist-jobs-SRCH_IL.0,7_IC2281069_KO8,22_IP6.htm']

java = ['https://www.glassdoor.ca/Job/toronto-java-developer-jobs-SRCH_IL.0,7_IC2281069_KO8,22.htm',
        'https://www.glassdoor.ca/Job/toronto-java-developer-jobs-SRCH_IL.0,7_IC2281069_KO8,22_IP2.htm',
        'https://www.glassdoor.ca/Job/toronto-java-developer-jobs-SRCH_IL.0,7_IC2281069_KO8,22_IP3.htm']

data_science_technology = ['java', 'c#', 'r', 'hadoop']

company_information = {}


def glassdoor_extraction(glassdoorpages):
    parsed_companies = []
    headers = {'User-Agent': "Mozilla/5.0 (X11; Ubuntu; Linux i686; rv:48.0) Gecko/20100101 Firefox/48.0"}

    for glassdoorpage in glassdoorpages:
        req = urllib.request.Request(glassdoorpage, headers=headers)
        html = urllib.request.urlopen(req).read()

        soup = BeautifulSoup(html, "html.parser")

        companies = soup.findAll("li", {"class", "jl"})

        for company in companies:
            company_obj = {}

            employer = company.find("div", {"class", "empLoc"})
            employer = employer.find("div")
            employer_title = str(employer.text.strip())
            company_obj['employer'] = employer_title
            compact_star = company.find("span", {"class", "compactStars"})
            if compact_star != None:
                compact_star_rating = compact_star.text.strip()
                company_obj['rating'] = compact_star_rating

            job_title = company.find("div", {"class", "flexbox"})
            job_title = job_title.find("a", {"class", "jobLink"})
            company_info = {}
            if job_title != None:
                job_title_text = job_title.text.strip()
                company_obj['title'] = job_title_text
                job_link = job_title['href']
                company_obj['link'] = 'https://www.glassdoor.ca' + job_link
                company_info = extract_company_info(company_obj['link'], data_science_technology)

            if company_info != None:
                company_obj = {**company_obj, **company_info}
            parsed_companies.append(company_obj)

    with open('java.csv', 'w') as csvfile:
        fieldnames = ['employer', 'rating', 'title', 'link', 'employerId', 'Industry', 'Competitors', 'Founded','Type','Size', 'Headquarters', 'Revenue', 'Part_of_']
        writer = csv.DictWriter(csvfile, fieldnames=fieldnames)

        writer.writeheader()
        for companies in parsed_companies:
            writer.writerow(companies)


def extract_company_info(link, tech_stack):
    headers = {'User-Agent': "Mozilla/5.0 (X11; Ubuntu; Linux i686; rv:48.0) Gecko/20100101 Firefox/48.0"}
    req = urllib.request.Request(link, headers=headers)
    html = urllib.request.urlopen(req).read()

    soup = BeautifulSoup(html, "html.parser")
    infoEntities = soup.findAll("div", {"class", "infoEntity"})
    job_description_panel = soup.find("div", {"class": "jobDescriptionContent"})
    if job_description_panel != None:
        job_information = job_description_panel.text

        employer_id = soup.find("div", {"class", "empBasicInfo"})
        if employer_id != None:
            employer_id = employer_id.attrs['data-emp-id']
        if employer_id == None:
            return
        if employer_id not in company_information:
            ajax_employer_information = "https://www.glassdoor.ca/Job/overview/companyOverviewBasicInfoAjax.htm?employerId=" + employer_id + "&title=+Overview&linkCompetitors=true"
            req = urllib.request.Request(ajax_employer_information, headers=headers)
            html = urllib.request.urlopen(req).read()

            soup = BeautifulSoup(html, "html.parser")
            entity_list = soup.findAll("div", {"class", "infoEntity"})
            # label span
            employer_obj = {}
            employer_obj['employerId'] = employer_id
            for entity in entity_list:
                label = entity.find("label").text
                label = label.replace(" ","_")
                value = entity.find("span").text
                employer_obj[label] = value
            company_information[employer_id] = employer_obj
            return employer_obj
        else:
            return company_information[employer_id]

        # company_information = company_information_panel.text
        # print(company_information)


# https://www.glassdoor.ca/Job/overview/companyOverviewBasicInfoAjax.htm?employerId=9373&title=+Overview&linkCompetitors=true

glassdoor_extraction(data_science_links)
print("done")
