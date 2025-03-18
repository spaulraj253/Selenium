Feature: User Authentication for Leaftaps Application

Scenario: Successful Login using Valid Credentials

Given the user is on the login page
When the user enters the username as demosalesmanager
And the user enters the password as crmsfa
And the user clicks the login button
Then the user should be redirected to welcome page
And the user should view the welcome message
And close the browser

Scenario: Failed Login using Valid Credentials

Given the user is on the login page
When the user enters the username as testuser
And the user enters the password as testpass
And the user clicks the login button
Then the user should not be redirected to welcome page

