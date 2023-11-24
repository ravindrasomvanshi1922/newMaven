Feature: This Fuctionality cover Contact Create, Udate and Delete

Background: 
		Given user is already logged in
		And click on AppNavigation Btn
		And go on marketing select Contacts
		
Scenario: Verify Contact Creation
When user click on AddContact Btn
And select required prefix
And enter FirstName and LastName
And click on contactPage SaveBtn
And click on contactLink
Then user is able to search Create Contact
And close browser

Scenario: Verify Contact Updation
When user search FirstName from FirstName Field
And click on the Search Btn
And Select searched Contact 
And enter Title 
And click on MassEditingPage SaveBtn
And click on contactLink
Then user shlould be able to verify updated contact
And close browser

Scenario: Verify Contact Deletion
When user search FirstName 
And click the Search Btn
And select contact and click on Delete
And click on Delete Confirmation Yes Btn
Then user should be able to verify Delete Contact
And close browser