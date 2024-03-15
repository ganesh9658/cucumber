Feature: Login Verification
@regression
Scenario: Check Login is successfull with valid credentials
Given user is on a Login Page
When user enter "<username>" and "<password>"
And user click on Login button
Then user is navigate to HomePage
And browser is closed

Examples:
|username|password|
|standard_user|secret_sauce|
|locked_out_user|secret_sauce|
|problem_user|secret_sauce|
|performance_glitch_user|secret_sauce|
|error_user|secret_sauce|
|visual_user|secret_sauce|