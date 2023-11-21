Feature: Fill Information for Vehicle Insurance

Scenario: User should be able to enter Vehicle Data
Given user is already loggedIn
When user select Make and Model Opt
And select cylindercapacity "500" and engineperformance "60" and select dateofmanufacture
And numberofseats 
Then user select fueltype and Payload "50"
And select totalweight "100" and listprice "100000"
And select annualmileage "2000" and click on the NextButton

Scenario: User should be able to enter Insurant Data
When user fill FirstName "Ravindra" and LastName "Somvanshi"
And select Date Of Birth "05/19/2002" and Gender
And select Street address "AT.POST BAMBRUD BK"
Then user select country and zipcode "424201"  
And city "Jalgaon" and occupation 
And hobbies and click on the NextButton

Scenario: User should be able to enter Product Data
When user select StartDate "01/08/2024"
And select Insurance Sum [$] and Merit Rating
Then user select Damage Insurance and Optional Products
And select Courtesy Car and NextButton

Scenario: User should be able to select Price Option
When user select Price option
Then select NextButton

Scenario: User should be able to Send Quotes
When user fill Email "abc@gmail.com" 
And fill Username "ravindra" and Password "Ravi@22"
Then user fill Confirm Password "Ravi@22"
And click on the SendButton 