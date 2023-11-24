Feature: OrangeHRM PIM Create,Update and Delete
Background:
	Given User is already login with valid credentials 
	And click on the PIM Link
	
Scenario: Verify PIM Creation
When user click on the addButton
And enter firstName,lastName and empId and click on save button
And Search created EmpId in EmpIdField
Then user able to search create EmployeeId
And close the browser

Scenario: Verify PIM Updation
When user enter created EmpId in EmpId field
And click on search button
And click on the FirstCheckBox of created EmpId
And click on the EditIcon
And enter MiddleName in MiddleNameField and click on save button
And search Updated EmpId in EmpId Field
Then verify MiddleName is Updated 


Scenario: Verify PIM Deletion
When user search created EmpId In EmpId Field
And click on search button
And click on the firstcheckBox 
And click on the Delete and click on yes button on Delete Popup
And search EmpId In EmpId Field
Then user should not be able to search delete EmpId
