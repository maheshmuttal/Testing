Feature: Login Validation
User should be able to login to the Web Application using the Username and password.

Scenario: Using Valid Username and Password
Given Users Existing valid Username "testuser" and password "testuser" to login.
When User enters the Username and password in the respective fields and click on Login Button.
Then Application successfully logs in the User and displays the Users dashboard.

Scenario: Using Blank Username and Password
Given Users does not enter any Username "" and password "" to login.
When User does not enter the Username and password in the respective fields and click on Login Button.
Then Application Displays a Message "Please enter valid Username and Password"

Scenario: Using Invalid Username and Vaild Password
Given Users enter Invalid Username "Wrong" and Vaild Password "TestUser" to login.
When User enters Invalid Username and Valid password in the respective fields and click on Login Button.
Then Application Displays a Message "Please enter valid Username"

Scenario: Using Valid Username and Invalid Password
Given Users enter Valid Username "TestUser" and Invalid Password "Wrong" to login.
When User enters Valid Username and an Invalid password in the respective fields and click on Login Button.
Then Application Displays a Message "Please enter Valid Password"