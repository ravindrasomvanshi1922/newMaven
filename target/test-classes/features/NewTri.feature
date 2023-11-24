Feature: This Feature Cover All Tricentis Pages Fuctionality

Scenario: Verify user able to enter Data and send Mail
Given User is already in vehicle data page
When user click on AutoMobile link
And user select Make option and enter EnginePerformance [kW]
And user select DateOfManufacture and NumberOfSeats
And user select Fuel Type and enter List Price [$]
And user enter Annual Mileage [mi]
And click on VehicleDataPage Next button
Then Verify user is on InsurantDataPage
When user enter FirstName and LastName 
And select DateofBirth 
And enter StreetAddress and select Country
And enter Zipcode and City
And select Occupation and Hobbies
And click on InsurantData Next button
Then Verify user is on ProductDataPage
When user select StartDate and InsuranceSum [$]
And select MeritRating and DamageInsurance
And select Optional Products and CourtesyCar
And click on ProductData Next button
Then Verify user is on PriceOptionPage
When user select required option
And click on PriceOption Next button
Then Verify user is on SendQuotesPage
When user enter Email and UserName
And enter Password and ConfirmPassword
And click on the Send button
Then verify Email is Send or not
And click on ok button