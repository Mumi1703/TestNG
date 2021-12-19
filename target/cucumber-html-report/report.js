$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/feature/LoginPage.feature");
formatter.feature({
  "name": "Adactin Login Page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Given Launch the Chrome with Adactin Url",
  "description": "",
  "keyword": "Background"
});
formatter.scenario({
  "name": "Validate the exception for the Valid Username and Empty password field",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Enter the Username",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Validate the Password Exception",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "name": "Given Launch the Chrome with Adactin Url",
  "description": "",
  "keyword": "Background"
});
formatter.scenario({
  "name": "Validate the exception for the Valid password and Empty username field",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Enter the Password",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Validate the Username Exception",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "name": "Given Launch the Chrome with Adactin Url",
  "description": "",
  "keyword": "Background"
});
formatter.scenario({
  "name": "Validate the exception for the Invalid Credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Enter the Username \u0026 Password",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Validate the Incorrect Credentials Exception",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "name": "Given Launch the Chrome with Adactin Url",
  "description": "",
  "keyword": "Background"
});
formatter.scenario({
  "name": "User Login with Valid Credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Enter the Username \u0026 Password \"Muthu173\" and \"Viji1703\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User Logged In Successfully.",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});