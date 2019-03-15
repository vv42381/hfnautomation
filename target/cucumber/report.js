$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/Features/Demo.feature");
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
  "name": "Signin and subcribe",
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
  "name": "text displayed should be \u003ctitle text\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on profile image",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks on subscription",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on upgrade",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on proceed",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on credit card",
  "keyword": "And "
});
formatter.step({
  "name": "user submits credit card details",
  "keyword": "And "
});
formatter.step({
  "name": "user submits credit card password",
  "keyword": "And "
});
formatter.step({
  "name": "payment confirmation text displayed should be \u003cconfirmation text\u003e",
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
        "title text",
        "confirmation text"
      ]
    },
    {
      "cells": [
        "abhyasi.2@mailinator.com",
        "abhyasi",
        "Meditate",
        "Payment Successful!!"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Signin and subcribe",
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
  "location": "MeditateHomePageSteps.text_displayed_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on profile image",
  "keyword": "When "
});
formatter.match({
  "location": "MeditateHomePageSteps.user_clicks_on_profile_image()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on subscription",
  "keyword": "And "
});
formatter.match({
  "location": "ProfilePageSteps.user_clicks_on_subscription()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on upgrade",
  "keyword": "And "
});
formatter.match({
  "location": "SubscriptionPageSteps.user_clicks_on_upgrade()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on proceed",
  "keyword": "And "
});
formatter.match({
  "location": "SubscriptionPageSteps.user_clicks_on_proceed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on credit card",
  "keyword": "And "
});
formatter.match({
  "location": "SubscriptionPageSteps.user_clicks_on_credi_card()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user submits credit card details",
  "keyword": "And "
});
formatter.match({
  "location": "SubscriptionPageSteps.user_submits_credi_card_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user submits credit card password",
  "keyword": "And "
});
formatter.match({
  "location": "SubscriptionPageSteps.user_submits_credi_card_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "payment confirmation text displayed should be Payment Successful!!",
  "keyword": "Then "
});
formatter.match({
  "location": "SubscriptionPageSteps.payment_confirmation_text_displayed_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});