$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/Features/Abhyasi.feature");
formatter.feature({
  "name": "Heartsapp E2E test",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Check all screens",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user open heartsapp",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks on signin",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks on accept policy",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on Email",
  "keyword": "And "
});
formatter.step({
  "name": "user enters email \u003cemail\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user enters password \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks submit",
  "keyword": "And "
});
formatter.step({
  "name": "text displayed should be \u003cMeditation text\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "user swipes \u003cdirection\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "text displayed should be \u003cIntrospect text\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on make note",
  "keyword": "When "
});
formatter.step({
  "name": "text displayed in toolbar should be \u003cJournal text\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks back",
  "keyword": "When "
});
formatter.step({
  "name": "user swipes \u003cdirection\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "text displayed should be \u003cInspire text\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on be inspired",
  "keyword": "When "
});
formatter.step({
  "name": "text displayed in toolbar should be \u003cInspire text\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks back",
  "keyword": "When "
});
formatter.step({
  "name": "user swipes \u003cdirection\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "text displayed should be \u003cDiscover text\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on know more",
  "keyword": "When "
});
formatter.step({
  "name": "text displayed in toolbar should be \u003cDiscover text\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks back",
  "keyword": "When "
});
formatter.step({
  "name": "user swipes \u003cdirection\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "text displayed should be \u003cExplore text\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on view more",
  "keyword": "When "
});
formatter.step({
  "name": "text displayed in toolbar should be \u003cExplore text\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "Meditation text",
        "Introspect text",
        "direction",
        "Inspire text",
        "Discover text",
        "Explore text",
        "Journal text"
      ]
    },
    {
      "cells": [
        "abhyasi.2@mailinator.com",
        "abhyasi",
        "Meditate",
        "Introspect",
        "right",
        "Read \u0026 Reflect",
        "Explore",
        "Engage",
        "Journal"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Check all screens",
  "description": "",
  "keyword": "Scenario Outline",
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
  "location": "SigninPageSteps.userOpensCalc()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on signin",
  "keyword": "When "
});
formatter.match({
  "location": "SigninPageSteps.user_clicks_on_signin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on accept policy",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.user_clicks_on_accept_policy()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Email",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.user_clicks_on_Email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters email abhyasi.2@mailinator.com",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.user_enters_abhyasi_mailinator_com(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password abhyasi",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.user_enters_abhyasi(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks submit",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.user_clicks_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "text displayed should be Meditate",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonPageSteps.text_displayed_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user swipes right",
  "keyword": "When "
});
formatter.match({
  "location": "UtilSteps.user_swipes(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "text displayed should be Introspect",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonPageSteps.text_displayed_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on make note",
  "keyword": "When "
});
formatter.match({
  "location": "IntrospectPageSteps.user_clicks_on_make_note()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "text displayed in toolbar should be Journal",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonPageSteps.text_displayed_in_toolbar_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks back",
  "keyword": "When "
});
formatter.match({
  "location": "UtilSteps.user_clicks_back()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user swipes right",
  "keyword": "When "
});
formatter.match({
  "location": "UtilSteps.user_swipes(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "text displayed should be Read \u0026 Reflect",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonPageSteps.text_displayed_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on be inspired",
  "keyword": "When "
});
formatter.match({
  "location": "InspirePageSteps.user_clicks_on_be_inspired()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "text displayed in toolbar should be Read \u0026 Reflect",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonPageSteps.text_displayed_in_toolbar_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks back",
  "keyword": "When "
});
formatter.match({
  "location": "UtilSteps.user_clicks_back()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user swipes right",
  "keyword": "When "
});
formatter.match({
  "location": "UtilSteps.user_swipes(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "text displayed should be Explore",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonPageSteps.text_displayed_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on know more",
  "keyword": "When "
});
formatter.match({
  "location": "DiscoverPageSteps.user_clicks_on_know_more()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "text displayed in toolbar should be Explore",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonPageSteps.text_displayed_in_toolbar_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks back",
  "keyword": "When "
});
formatter.match({
  "location": "UtilSteps.user_clicks_back()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user swipes right",
  "keyword": "When "
});
formatter.match({
  "location": "UtilSteps.user_swipes(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "text displayed should be Engage",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonPageSteps.text_displayed_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on view more",
  "keyword": "When "
});
formatter.match({
  "location": "ExplorePageSteps.user_clicks_on_view_more()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "text displayed in toolbar should be Engage",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonPageSteps.text_displayed_in_toolbar_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});