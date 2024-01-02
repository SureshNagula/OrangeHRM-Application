$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("RediffMail.feature");
formatter.feature({
  "line": 1,
  "name": "RediffMail LogIn Functionality",
  "description": "",
  "id": "rediffmail-login-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "RediffMail LogIn Testing",
  "description": "",
  "id": "rediffmail-login-functionality;rediffmail-login-testing",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User Should Open Chrome browser in the System",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User Enters RediffMail application URL Address",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User Should be Navigated To RediffMail application Login Page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User should Enter Username and Password and Click on SignIn button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User Should Close the \tRediffMail application along with the Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "UserDefinedMethods.user_Should_Open_Chrome_browser_in_the_System()"
});
formatter.result({
  "duration": 22583555100,
  "status": "passed"
});
formatter.match({
  "location": "UserDefinedMethods.user_Enters_RediffMail_application_URL_Address()"
});
formatter.result({
  "duration": 4911566300,
  "status": "passed"
});
formatter.match({
  "location": "UserDefinedMethods.user_Should_be_Navigated_To_RediffMail_application_Login_Page()"
});
formatter.result({
  "duration": 338593400,
  "status": "passed"
});
formatter.match({
  "location": "UserDefinedMethods.user_should_Enter_Username_and_Password_and_Click_on_SignIn_button()"
});
formatter.result({
  "duration": 23858337100,
  "status": "passed"
});
formatter.match({
  "location": "UserDefinedMethods.user_Should_Close_the_RediffMail_application_along_with_the_Browser()"
});
formatter.result({
  "duration": 2390741400,
  "status": "passed"
});
});