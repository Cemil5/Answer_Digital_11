$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/FormAuthentication.feature");
formatter.feature({
  "name": "Login page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Menu page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.answer.step_definitions.FormAuthenStepDefs.the_user_is_on_the_Menu_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on \"form authentication\" link",
  "keyword": "And "
});
formatter.match({
  "location": "com.answer.step_definitions.FormAuthenStepDefs.the_user_clicks_on_link(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "the user can login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user enters valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "com.answer.step_definitions.FormAuthenStepDefs.the_user_enters_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.answer.step_definitions.FormAuthenStepDefs.the_user_should_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user logs out",
  "keyword": "When "
});
formatter.match({
  "location": "com.answer.step_definitions.FormAuthenStepDefs.the_user_logs_out()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to see Login Page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.answer.step_definitions.FormAuthenStepDefs.the_user_should_be_able_to_see_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});