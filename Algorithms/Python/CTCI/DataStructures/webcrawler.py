# import libraries
import urllib.request
from bs4 import BeautifulSoup

glassdoorpage = 'https://www.glassdoor.ca/Job/toronto-data-scientist-jobs-SRCH_IL.0,7_IC2281069_KO8,22.htm'

headers = {}
headers['User-Agent'] = "Mozilla/5.0 (X11; Ubuntu; Linux i686; rv:48.0) Gecko/20100101 Firefox/48.0"
req = urllib.request.Request(glassdoorpage, headers = headers)
html = urllib.request.urlopen(req).read()

soup = BeautifulSoup(html)

panel = soup.find(".jlGrid")
companies = soup.findAll("li",{"class","jl"})
for company in companies:
    company_obj = {}

    employer = company.find("div",{"class","empLoc"})
    employer = employer.find("div")
    employer_title = employer.text.strip().split(" - ")
    company_obj['company'] = employer_title[0]
    company_obj['location'] = employer_title[1]

    compact_star = company.find("span",{"class","compactStars"})
    compact_star_rating = compact_star.text.strip()
    company_obj['rating'] = compact_star_rating

    job_title = company.find("a", {"class","jobLink"})
    job_title_text = job_title.text.strip()

    company_obj['title'] = job_title_text

print("done")