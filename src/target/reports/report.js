$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/search.feature");
formatter.feature({
  "name": "Search and place order for vegetables",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search for items and validate results",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@selenium-test"
    }
  ]
});
formatter.step({
  "name": "User is on greencart page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.MyStepDefinitions.user_is_on_greencart_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searched for cucumber",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.MyStepDefinitions.user_searched_for_cucumber()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat StepDefinition.MyStepDefinitions.user_searched_for_cucumber(MyStepDefinitions.java:28)\r\n\tat ✽.User searched for cucumber(file:///C:/Users/HEADWAY/Workspace/Automation/src/test/java/features/search.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "\"Cucumber\" results are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.MyStepDefinitions.something_results_are_displayed(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
});