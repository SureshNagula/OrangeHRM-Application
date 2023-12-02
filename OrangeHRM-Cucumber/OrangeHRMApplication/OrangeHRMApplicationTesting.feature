Feature: OrangeHRM Application Functiional Testing

Scenario: OrangeHRM Application Login Page Valiudation

Given User Should Open Chrome Browser in The System

When User Enters OrangeHRM Application URL Address

Then User Should be Navigated To OrangeHRM Application Login WebPage

Then User Should Close the OrangeHRM Application along with the Browser




Scenario: OrangeHRM Login Functionality Test

Given User Should Open Chrome Browser in The System

When User Enters OrangeHRM Application URL Address

Then User Should be Navigated To OrangeHRM Application Login WebPage

Then User Should Enter UserName and Password and Click on Login button

Then User Should be Navigating to orangeHRM Home Page Application

Then User should click on welcome admin and click on logout

Then user should close the OrangeHRM Application along with browser





Scenario Outline: OrangeHRM Application LoginFunctionality with Valid and Invalid Test data

Given User Should Open Chrome Browser in The System

When User Enters OrangeHRM Application URL Address

Then User Should be Navigated To OrangeHRM Application Login WebPage

Then User Should Enter "<UserName>" and "<Password>" and click on Login button

Then User Should be Navigating to orangeHRM Home Page Application

Then User should click on welcome admin and click on logout

Then user should close the OrangeHRM Application along with browser


Examples:

| UserName  |  Password    |
| Suresh    | Suresh#1234  |
| Surya     | Suresh#1234  |
| Sure      | Suresh  |
| Suresh    | Suresh#1234  |




@ReTesting

Scenario Outline: OrangeHRM AddEmployee Test with Single Data

Given User Should Open Chrome Browser in The System

When User Enters OrangeHRM Application URL Address

Then User Should be Navigated To OrangeHRM Application Login WebPage

Then User Should Enter UserName and Password and Click on Login button

Then User Should be Navigating to orangeHRM Home Page Validation Test

Then User should navigate PIM and Should Click on AddEmployee Functionality

Then User Should Pass the Test Data Into "<firstName>" "<middleName>" and "<lastName>" and Get Employee Id 

Then Save The New Employee Details

Then User Should be Navigating to orangeHRM Home Page Application

Then User should click on welcome admin and click on logout

Then user should close the OrangeHRM Application along with browser

Examples:

|  firstName  | middleName   |   lastName   |
|  suresh     |  suri        |   soorya     |





