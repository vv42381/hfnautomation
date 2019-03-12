$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/Features/Demo.feature");
formatter.feature({
  "name": "Calculations",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "name": "Open",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user open heartsapp",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.userOpensCalc()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on signin",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_clicks_on_signin()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});