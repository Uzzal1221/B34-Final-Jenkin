@Smoke @Regression 
Feature: Login function test
Description: 
@Positive @TC_LP_18
Scenario: Check Login with valid credintals

Given user can open go the url
When user can enter valid username 
Then user can enter valid password
When user can click login button 
Then check logout button exist for validations 

@Negative @TC_LP_19
Scenario: Check Login with Invalid credintals

Given user can open go the url
When user can enter Invali username 
Then user can enter Invalid password
When user can click login button 
Then alert textbox should pop 

@Negative @TC_LP_20
Scenario: Check Login with null credintals

Given user can open go the url
When user can enter null username 
Then user can enter null password
When user can click login button 
Then alert textbox should pop 

