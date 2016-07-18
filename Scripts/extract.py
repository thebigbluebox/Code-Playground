# Have your data saved onto your desktop, keep the first row of your
# csv file as the header of the google docs so that it remains consistant
# the csv file must be named data.csv
# 
# The resulting file will be a prettyfile.txt in the same directory as where you saved
# the python script

import csv
import os.path

userhome = os.path.expanduser('~')
csvfile = os.path.join(userhome, 'Desktop', 'teamx.csv')
outputfile = open('teamx.txt', 'w')

headers = []
with open(csvfile, 'r') as file:
    reader = csv.reader(file)
    row_count = 0
    for row in reader:
        if row_count == 0:
            headers = row
        else:
            header_count = 0;
            for header in headers:
                outputfile.write(header)
                outputfile.write("\n")
                outputfile.write(row[header_count])
                outputfile.write("\n")
                header_count += 1
        outputfile.write("\n\n\n")
        row_count += 1
outputfile.close()
file.close()
