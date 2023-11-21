Feature: PIM create, Update and Delete

Scenario: User should be able to Crate PIM
Given user is already loggen in 
When user click on PIM link 
And click on the AddEmployee button
And FirstName "Rohit" and LastName "Sharma" 
And EmployeeId "4545"
Then Click on save button
And click on PIM link 

Scenario: User Should be able to Update PIM
When User Search FirstName "Rohit" and EmployeeId "4545"
And click on the search button
And click on required Searched EmployeeId
Then Add Liscence Number "3285"
And click on save button
And click on the PIM link

Scenario: User Should be able to Delete PIM
When User Search FirstName "Rohit" and EmployeeId "4545"
And click on the search button
Then Select EmployeeId and click on the Delete icon
And click on the DeleteConfirmation button 

