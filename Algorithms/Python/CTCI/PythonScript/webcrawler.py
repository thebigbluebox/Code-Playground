# import libraries
import urllib.request
import csv
from bs4 import BeautifulSoup

headers = {'User-Agent': "Mozilla/5.0 (X11; Ubuntu; Linux i686; rv:48.0) Gecko/20100101 Firefox/48.0"}
data_science_links = ['https://www.glassdoor.ca/Job/toronto-data-scientist-jobs-SRCH_IL.0,7_IC2281069_KO8,22.htm']

data_science_links = ['https://www.glassdoor.ca/Job/toronto-data-scientist-jobs-SRCH_IL.0,7_IC2281069_KO8,22.htm',
'https://www.glassdoor.ca/Job/toronto-data-scientist-jobs-SRCH_IL.0,7_IC2281069_KO8,22_IP2.htm',
'https://www.glassdoor.ca/Job/toronto-data-scientist-jobs-SRCH_IL.0,7_IC2281069_KO8,22_IP3.htm',
'https://www.glassdoor.ca/Job/toronto-data-scientist-jobs-SRCH_IL.0,7_IC2281069_KO8,22_IP4.htm',
'https://www.glassdoor.ca/Job/toronto-data-scientist-jobs-SRCH_IL.0,7_IC2281069_KO8,22_IP5.htm',
'https://www.glassdoor.ca/Job/toronto-data-scientist-jobs-SRCH_IL.0,7_IC2281069_KO8,22_IP6.htm',
'https://www.glassdoor.ca/Job/toronto-data-scientist-jobs-SRCH_IL.0,7_IC2281069_KO8,22_IP7.htm',
'https://www.glassdoor.ca/Job/toronto-data-scientist-jobs-SRCH_IL.0,7_IC2281069_KO8,22_IP8.htm',
'https://www.glassdoor.ca/Job/toronto-data-scientist-jobs-SRCH_IL.0,7_IC2281069_KO8,22_IP9.htm',
'https://www.glassdoor.ca/Job/toronto-data-scientist-jobs-SRCH_IL.0,7_IC2281069_KO8,22_IP10.htm',
'https://www.glassdoor.ca/Job/toronto-data-scientist-jobs-SRCH_IL.0,7_IC2281069_KO8,22_IP11.htm',
'https://www.glassdoor.ca/Job/toronto-data-scientist-jobs-SRCH_IL.0,7_IC2281069_KO8,22_IP12.htm']


java = ['https://www.glassdoor.ca/Job/toronto-java-developer-jobs-SRCH_IL.0,7_IC2281069_KO8,22.htm',
        'https://www.glassdoor.ca/Job/toronto-java-developer-jobs-SRCH_IL.0,7_IC2281069_KO8,22_IP2.htm',
        'https://www.glassdoor.ca/Job/toronto-java-developer-jobs-SRCH_IL.0,7_IC2281069_KO8,22_IP3.htm']

data_science_technology = ['java', 'c#', 'r', 'hadoop']
company_information = {}


def glassdoor_extraction(glassdoorpages, name):
    # glassdoorpages = [glassdoorpage_base_url]
    parsed_companies = []
    for glassdoorpage in glassdoorpages:
        print("Currently on " + glassdoorpage)
        req = urllib.request.Request(glassdoorpage, headers=headers)
        html = urllib.request.urlopen(req).read()
        soup = BeautifulSoup(html.decode('utf-8'), "html.parser")
        # generate_page_links(soup, glassdoorpage_base_url, glassdoorpages)
        # All of the job listing elements
        companies = soup.findAll("li", {"class", "jl"})
        for company in companies:
            # the company representation
            company_obj = {'employer': str(company.find("div", {"class", "empLoc"}).find("div").text.strip())}
            # Employer Title
            # Star Rating not required on the site
            compact_star = company.find("span", {"class", "compactStars"})
            if compact_star is not None:
                company_obj['rating'] = compact_star.text.strip()

            job_title = company.find("div", {"class", "flexbox"}).find("a", {"class", "jobLink"})
            if job_title is not None:
                # Job Title
                company_obj['title'] = job_title.text.strip()
                job_link = job_title['href']
                company_obj['link'] = 'https://www.glassdoor.ca' + job_link

            company_info = extract_company_info(company_obj['link'], data_science_technology)
            print(company_info is not None)
            if company_info is not None:
                company_obj = {**company_obj, **company_info}
            parsed_companies.append(company_obj)

    with open(name + '.csv', 'w', encoding="utf-8") as csvfile:
        fieldnames = ['employer', 'rating', 'title', 'jDescription', 'link', 'employerId', 'Industry', 'Competitors',
                      'Founded', 'Type',
                      'Size', 'Headquarters', 'Revenue', 'Part_of']
        writer = csv.DictWriter(csvfile, fieldnames=fieldnames)
        writer.writeheader()
        for companies in parsed_companies:
            writer.writerow(companies)


def extract_company_info(link, tech_stack):
    req = urllib.request.Request(link, headers=headers)
    html = urllib.request.urlopen(req).read()

    soup = BeautifulSoup(html.decode('utf-8'), "html.parser")
    job_description_panel = soup.find("div", {"class": "jobDescriptionContent"})
    if job_description_panel is not None:
        employer_id = soup.find("div", {"class", "empBasicInfo"})
        if employer_id is None:
            return
        if employer_id is not None:
            employer_id = str(employer_id.attrs['data-emp-id']).strip()
        if employer_id not in company_information:
            ajax_employer_information = "https://www.glassdoor.ca/Job/overview/companyOverviewBasicInfoAjax.htm?employerId=" + employer_id + "&title=+Overview&linkCompetitors=true"
            req = urllib.request.Request(ajax_employer_information, headers=headers)
            html = urllib.request.urlopen(req).read()
            soup = BeautifulSoup(html.decode('utf-8'), "html.parser")
            entity_list = soup.findAll("div", {"class", "infoEntity"})
            # Company Information
            employer_obj = {'jDescription': job_description_panel.text, 'employerId': employer_id}
            # Job Description
            for entity in entity_list:
                label = entity.find("label").text
                label = label.strip().replace(" ", "_")
                value = str(entity.find("span").text).strip()
                employer_obj[label] = value
            company_information[employer_id] = employer_obj
            return employer_obj
        else:
            return company_information[employer_id]


def generate_page_links(soup, base_url, url_array):
    pages = soup.findAll("li",{"class","page"})
    for page in pages:
        page_text = page.text.trim()
        page_link = base_url[:base_url(".htm")] + "_IP" + page_text + ".htm"
        if page_link not in url_array:
            url_array.append(page_link)

glassdoor_extraction('https://www.glassdoor.ca/Job/toronto-data-scientist-jobs-SRCH_IL.0,7_IC2281069_KO8,22.htm', 'dataScience')
print("done")
