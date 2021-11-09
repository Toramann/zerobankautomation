$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/PurchaseForeignCurrency.feature");
formatter.feature({
  "name": "Purchase Foreign Currency",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "login",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.theUserIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Available currencies",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user accesses the Purchase foreign currency cash tab",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.PurchaseForeignCurencyDefs.theUserAccessesThePurchaseForeignCurrencyCashTab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "following currencies should be available",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.PurchaseForeignCurencyDefs.followingCurrenciesShouldBeAvailable(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected:\u003c[Australia (dollar), Canada (dollar), Switzerland (franc), China (yuan), Denmark (krone), Eurozone (euro), Great Britain (pound), Japan (yen), Mexico (peso), Norway (krone), New Zealand (dollar), Singapore (dollar)]\u003e but was:\u003c[Select One, Australia (dollar), Canada (dollar), Switzerland (franc), China (yuan), Denmark (krone), Eurozone (euro), Great Britain (pound), Hong Kong (dollar), Japan (yen), Mexico (peso), Norway (krone), New Zealand (dollar), Sweden (krona), Singapore (dollar), Thailand (baht)]\u003e\r\n\tat org.junit.Assert.fail(Assert.java:89)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:835)\r\n\tat org.junit.Assert.assertEquals(Assert.java:120)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.zerobank.stepdefinitions.PurchaseForeignCurencyDefs.followingCurrenciesShouldBeAvailable(PurchaseForeignCurencyDefs.java:36)\r\n\tat ✽.following currencies should be available(file:///C:/Users/Taha/Desktop/zerobankautomation/src/test/resources/features/PurchaseForeignCurrency.feature:7)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});