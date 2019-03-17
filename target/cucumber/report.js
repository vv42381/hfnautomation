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
  "error_message": "org.openqa.selenium.InvalidElementStateException: io.appium.uiautomator2.common.exceptions.InvalidElementStateException: Cannot set the element to \u002712\u0027. Did you interact with the correct element?\n\tat io.appium.uiautomator2.handler.SendKeysToElement.safeHandle(SendKeysToElement.java:95)\n\tat io.appium.uiautomator2.handler.request.SafeRequestHandler.handle(SafeRequestHandler.java:36)\n\tat io.appium.uiautomator2.server.AppiumServlet.handleRequest(AppiumServlet.java:250)\n\tat io.appium.uiautomator2.server.AppiumServlet.handleHttpRequest(AppiumServlet.java:241)\n\tat io.appium.uiautomator2.http.ServerHandler.channelRead(ServerHandler.java:44)\n\tat io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:366)\n\tat io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:352)\n\tat io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:345)\n\tat io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:102)\n\tat io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:366)\n\tat io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:352)\n\tat io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:345)\n\tat io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.fireChannelRead(CombinedChannelDuplexHandler.java:435)\n\tat io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:293)\n\tat io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:267)\n\tat io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:250)\n\tat io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:366)\n\tat io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:352)\n\tat io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:345)\n\tat io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1294)\n\tat io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:366)\n\tat io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:352)\n\tat io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:911)\n\tat io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:131)\n\tat io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:611)\n\tat io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:552)\n\tat io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:466)\n\tat io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:438)\n\tat io.netty.util.concurrent.SingleThreadEventExecutor$2.run(SingleThreadEventExecutor.java:140)\n\tat io.netty.util.concurrent.DefaultThreadFactory$DefaultRunnableDecorator.run(DefaultThreadFactory.java:144)\n\tat java.lang.Thread.run(Thread.java:761)\n\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Vishnus-MacBook-Pro.local\u0027, ip: \u0027fd3c:678c:b4da:2e00:4cc9:39b2:4c3d:da04%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.6\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: io.appium.java_client.android.AndroidDriver\nCapabilities {app: /Users/vishnu/eclipse-works..., appActivity: com.hfn.unified.view.splash..., appPackage: com.hfn.unified, automationName: UiAutomator2, databaseEnabled: false, desired: {app: /Users/vishnu/eclipse-works..., appActivity: com.hfn.unified.view.splash..., appPackage: com.hfn.unified, automationName: UiAutomator2, deviceName: emulator-5554, newCommandTimeout: 60, platformName: android, platformVersion: 7, setWebContentsDebuggingEnabled: true}, deviceApiLevel: 24, deviceManufacturer: Google, deviceModel: Android SDK built for x86, deviceName: emulator-5554, deviceScreenDensity: 420, deviceScreenSize: 1080x1920, deviceUDID: emulator-5554, javascriptEnabled: true, locationContextEnabled: false, networkConnectionEnabled: true, newCommandTimeout: 60, pixelRatio: 2.625, platform: LINUX, platformName: Android, platformVersion: 7.0, setWebContentsDebuggingEnabled: true, statBarHeight: 63, takesScreenshot: true, viewportRect: {height: 1731, left: 0, top: 63, width: 1080}, warnings: {}, webStorageEnabled: false}\nSession ID: 21c9105d-f704-4c6f-a186-fd08a61b83b5\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:239)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:42)\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\n\tat io.appium.java_client.android.AndroidDriver.execute(AndroidDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\n\tat io.appium.java_client.DefaultGenericMobileElement.execute(DefaultGenericMobileElement.java:45)\n\tat io.appium.java_client.MobileElement.execute(MobileElement.java:1)\n\tat io.appium.java_client.android.AndroidElement.execute(AndroidElement.java:1)\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:106)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\n\tat com.sun.proxy.$Proxy18.sendKeys(Unknown Source)\n\tat pages.SubscriptionPage.submitCreditCardDetails(SubscriptionPage.java:125)\n\tat steps.SubscriptionPageSteps.user_submits_credi_card_details(SubscriptionPageSteps.java:45)\n\tat ✽.user submits credit card details(src/test/java/resources/Features/Demo.feature:17)\n",
  "status": "failed"
});
formatter.step({
  "name": "user submits credit card password",
  "keyword": "And "
});
formatter.match({
  "location": "SubscriptionPageSteps.user_submits_credi_card_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "payment confirmation text displayed should be Payment Successful!!",
  "keyword": "Then "
});
formatter.match({
  "location": "SubscriptionPageSteps.payment_confirmation_text_displayed_should_be(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});