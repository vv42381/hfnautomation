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
  "name": "iOS",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user open heartsapp",
  "keyword": "Given "
});
formatter.step({
  "name": "text displayed should be \u003ctitle text\u003e",
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
        "Introspect text",
        "direction"
      ]
    },
    {
      "cells": [
        "abhyasi.2000@mailinator.com",
        "abhyasi",
        "Meditate",
        "Introspect",
        "right"
      ]
    }
  ]
});
formatter.scenario({
  "name": "iOS",
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
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.all({By.id: com.hfn.unified:id/btn_view_more_introspection,By.xpath: /XCUIElementTypeButton[@name\u003d\"Make Note\"]})\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Vishnus-MacBook-Pro.local\u0027, ip: \u0027fd3c:678c:b4da:2e00:89ca:206d:f8f5:69fb%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.6\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: driver.version: IOSDriver\n\tat org.openqa.selenium.support.pagefactory.ByAll.findElement(ByAll.java:58)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:58)\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\n\tat io.appium.java_client.ios.IOSDriver.findElement(IOSDriver.java:1)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\n\tat pages.IntrospectPage.clickMakeNote(IntrospectPage.java:80)\n\tat steps.IntrospectPageSteps.user_clicks_on_make_note(IntrospectPageSteps.java:26)\n\tat ✽.user clicks on make note(src/test/java/resources/Features/Abhyasi.feature:75)\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});