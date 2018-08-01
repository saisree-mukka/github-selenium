Feature: Github Login

Scenario: Accessing Registration Page
Given user wants to access the login Page 'www.github.com'
When user will open google chrome
And enters the url 'www.github.com'
Then display the github page 'www.github.com'

Scenario: Login using valid credentials
Given user wants to logged in 'www.github.com'
When user enters valid Username
And user Enters valid password
Then user must me redirecyted to 'www.github.com' and message

Scenario: Login using Invalid credentials
Given user wants to logged in 'www.github.com'
When user enters Invalid Username
And user Enters Invalid password
Then user must display error message
