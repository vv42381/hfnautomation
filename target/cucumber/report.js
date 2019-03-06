$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/open.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "I want to write a step with precondition",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.i_want_to_write_a_step_with_precondition()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "some other precondition",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.some_other_precondition()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I complete action",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.i_complete_action()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "some other action",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.some_other_action()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "yet another action",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.yet_another_action()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the outcomes",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.i_validate_the_outcomes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check more outcomes",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.check_more_outcomes()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "I want to write a step with \u003cname\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "I check for the \u003cvalue\u003e in step",
  "keyword": "When "
});
formatter.step({
  "name": "I verify the \u003cstatus\u003e in step",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "value",
        "status"
      ]
    },
    {
      "cells": [
        "name1",
        "5",
        "success"
      ]
    },
    {
      "cells": [
        "name2",
        "7",
        "Fail"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "I want to write a step with name1",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.i_want_to_write_a_step_with_name(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check for the 5 in step",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.i_check_for_the_in_step(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the success in step",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.i_verify_the_success_in_step()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "I want to write a step with name2",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.i_want_to_write_a_step_with_name(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check for the 7 in step",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.i_check_for_the_in_step(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the Fail in step",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.i_verify_the_Fail_in_step()"
});
formatter.result({
  "status": "passed"
});
});