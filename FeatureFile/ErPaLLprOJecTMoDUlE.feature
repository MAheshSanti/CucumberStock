@tag
Feature:
validate all the module present in this project
@tag1
Scenario Outline:
As admin user i  want to add multipole supplier
Given i launch the browser
When i launch the url "http://webapp.qedgetech.com/"
When i wait for username textbox with "name" and "username"
When enter username with "name" and "username" value "admin"
When i enter password with "xpath" and "//input[@id='password']" data "master"
When i click on the login button with "id" and "btnsubmit"
When i wait for supplier link with "xpath" and "(//a[contains(text(),'Suppliers')])[2]"
When i click on the supplier  link with "xpath" and "(//a[contains(text(),'Suppliers')])[2]"
When i wait for add icon button with "xpath" and"(//a[contains(@data-caption,'Add')])[1]"
When i click on add icon button with "xpath" and"(//a[contains(@data-caption,'Add')])[1]"
When i wait for supplier number with "name" and "x_Supplier_Number"
When i capture the Supplier number with "name" and "x_Supplier_Number"
When i enter the supplier name "xpath" , "//input[@id='x_Supplier_Name']" & "<sname>"
And i enter the supplier Address "xpath" , "//textarea[@id='x_Address']" & "<Saddress>"
And i enter the supplier city "xpath" , "//input[@id='x_City']" & "<scity>"
And i enter the supplier country "xpath" , "//input[@id='x_Country']" & "<scountry>"
And i enter the supplier contact person "xpath" , "//input[@id='x_Contact_Person']" & "<SCPerson>"
And i enter the supplier phone number "xpath" , "//input[@id='x_Phone_Number']" & "<SphoneNU>"
And i enter the supplier email "xpath" , "//input[@id='x__Email']" & "<Semail>"
And i enter the supplier mobile number "xpath" , "//input[@id='x_Mobile_Number']" & "<SMNUMber>"
And i enter the supplier notes "xpath" , "//textarea[@id='x_Notes']" & "<Snotes>"
And i click on the ADD  button "id" with"btnAction"
Then i wait for the confirm ok button "xpath" with "//button[normalize-space()='OK!']"
Then i click  for the confirm ok button "xpath" with "//button[normalize-space()='OK!']"
Then i wait for the alert ok button "xpath" with "//button[@class='ajs-button btn btn-primary']"
Then i click for the alert ok button "xpath" with "//button[@class='ajs-button btn btn-primary']"
Then i verify the supplier table
When i close the browser
Examples:
|sname|Saddress|scity|scountry|SCPerson|SphoneNU|Semail|SMNUMber|Snotes|
|Mahesh santi|Rasulgarha|BBSr|India|TApan|9935452923|qedge@gmailcom|8258796354|add suppliers|
|baina santi|patia|ctc|India|priti|9935486923|qedge1@gmailcom|9258796354|add suppliers|
|rintu santi|VSS nagara|rkl|India|baina|9935456923|qedge2@gmailcom|7258796354|add suppliers|

@tag2
Scenario Outline:
As admin user i  want to add multiple customer
Given i launch the browser
When i launch the url "http://webapp.qedgetech.com/"
When i wait for username textbox with "name" and "username"
When enter username with "name" and "username" value "admin"
When i enter password with "xpath" and "//input[@id='password']" data "master"
When i click on the login button with "id" and "btnsubmit"
When i wait for customer link with "xpath" and "(//a[contains(.,'Customers')])[2]"
When i click on the customer  link with "xpath" and "(//a[contains(.,'Customers')])[2]"
When i wait for add icon button with "xpath" and"(//a[contains(@data-caption,'Add')])[1]"
When i click on add icon button with "xpath" and"(//a[contains(@data-caption,'Add')])[1]"
When i wait for customer number with "xpath" and "//input[@id='x_Customer_Number']"
When i capture the customer number with "xpath" and "//input[@id='x_Customer_Number']"
When i enter the customer name "xpath" , "//input[@id='x_Customer_Name']" & "<cname>"
And i enter the customer Address "xpath" , "//textarea[@id='x_Address']" & "<caddress>"
And i enter the customer city "xpath" , "//input[@id='x_City']" & "<ccity>"
And i enter the customer country "xpath" , "//input[@id='x_Country']" & "<ccountry>"
And i enter the customer contact person "xpath" , "//input[@id='x_Contact_Person']" & "<cCPerson>"
And i enter the customer phone number "xpath" , "//input[@id='x_Phone_Number']" & "<cphoneNU>"
And i enter the customer email "xpath" , "//input[@id='x__Email']" & "<cemail>"
And i enter the customer mobile number "xpath" , "//input[@id='x_Mobile_Number']" & "<cMNUMber>"
And i enter the customer notes "xpath" , "//input[@id='x_Notes']" & "<cnotes>"
And i click on the ADD  button "id" with"btnAction"
Then i wait for the confirm ok button "xpath" with "//button[normalize-space()='OK!']"
Then i click  for the confirm ok button "xpath" with "//button[normalize-space()='OK!']"
Then i wait for the alert ok button "xpath" with "//button[@class='ajs-button btn btn-primary']"
Then i click for the alert ok button "xpath" with "//button[@class='ajs-button btn btn-primary']"
Then i verify the customer table
When i close the browser
Examples:
|cname|caddress|ccity|ccountry|cCPerson|cphoneNU|cemail|cMNUMber|cnotes|
|Mahesh santi|Rasulgarha|BBSr|India|TApan|99354782923|qedgme@gmailcom|8258796354|add customer|
|baina santi|patia|ctc|India|priti|9935486723|qednge1@gmailcom|9258796354|add customr|
|rintu santi|VSS nagara|rkl|India|baina|9936456923|qehdge2@gmailcom|7258796354|add cus|

@tag3
Scenario Outline:
As admin user i  want to add multiple stock item
Given i launch the browser
When i launch the url "http://webapp.qedgetech.com/"
When i wait for username textbox with "name" and "username"
When enter username with "name" and "username" value "admin"
When i enter password with "xpath" and "//input[@id='password']" data "master"
When i click on the login button with "id" and "btnsubmit"
When i wait for stock item link with "xpath" and "//a[text()='Stock Items ']"
When i click on the stock item  link with "xpath" and "//a[text()='Stock Items ']"
When i wait for add icon button with "xpath" and"(//a[contains(@data-caption,'Add')])[1]"
When i click on add icon button with "xpath" and"(//a[contains(@data-caption,'Add')])[1]"
When i wait for the stock number  with "name" its value "x_Supplier_Number"
When i select the category with "name" its value "x_Category" data"<Scat>"
When i select the supplier with "name" its value "x_Supplier_Number" data"<SuNum>"
When i capture the stock number with "name" its value "x_Stock_Number"
When i enter the stock name with "name" its value "x_Stock_Name" data"<Sname>"
When i select the unit of mesurement with "name" its value "x_Unit_Of_Measurement" data"<Sunit>"
When i enter the purchasing price with "id" its value "x_Purchasing_Price" data"<PPrice>"
When i enter the selling price with "id" its value "x_Selling_Price" data"<SPrice>"
When i enter the notes with "id" its value "x_Notes" data"<Snotes>"
And i click on the ADD  button "id" with"btnAction"
Then i wait for the confirm ok button "xpath" with "//button[normalize-space()='OK!']"
Then i click  for the confirm ok button "xpath" with "//button[normalize-space()='OK!']"
Then i wait for the alert ok button "xpath" with "//button[@class='ajs-button btn btn-primary']"
Then i click for the alert ok button "xpath" with "//button[@class='ajs-button btn btn-primary']"
Then i verify the stock item table
When i close the browser

Examples:
|Scat|SuNum|Sname|Sunit|PPrice|SPrice|Snotes|
|1|1|electronics|1|100|200|Buy|
|1|1|rice|1|1500|2040|Bbbb|
|1|1|sweety|1|1600|2020|Buy55|
