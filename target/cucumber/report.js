$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cucumber/account.feature");
formatter.feature({
  "line": 1,
  "name": "Testing a REST API for Account",
  "description": "Users should be able to sent GET/POST/PUT/DELETE requests to a Account RESTFul web service.",
  "id": "testing-a-rest-api-for-account",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Add an Account details",
  "description": "",
  "id": "testing-a-rest-api-for-account;add-an-account-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Account details",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "users submits the data",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "server returns a status of add Account",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountStepDefinition.account_details()"
});
formatter.result({
  "duration": 193547241,
  "status": "passed"
});
formatter.match({
  "location": "AccountStepDefinition.users_submits_the_data()"
});
formatter.result({
  "duration": 2534871521,
  "status": "passed"
});
formatter.match({
  "location": "AccountStepDefinition.server_returns_a_status_of_add_Account()"
});
formatter.result({
  "duration": 27238,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Account details retrieval from a web service",
  "description": "",
  "id": "testing-a-rest-api-for-account;account-details-retrieval-from-a-web-service",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "Account id is provided",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "users want to get information about an Account",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "the requested Account data is returned",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountStepDefinition.account_id_is_provided()"
});
formatter.result({
  "duration": 39080,
  "status": "passed"
});
formatter.match({
  "location": "AccountStepDefinition.users_want_to_get_information_about_an_Account()"
});
formatter.result({
  "duration": 57448124,
  "status": "passed"
});
formatter.match({
  "location": "AccountStepDefinition.the_requested_Account_data_is_returned()"
});
formatter.result({
  "duration": 29607,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "All Account details retrieval from a web service",
  "description": "",
  "id": "testing-a-rest-api-for-account;all-account-details-retrieval-from-a-web-service",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "RESTFul url is provided",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "users wants to get all Account informations",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "server returns a status of get all Accounts",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountStepDefinition.restful_url_is_provided()"
});
formatter.result({
  "duration": 40659,
  "status": "passed"
});
formatter.match({
  "location": "AccountStepDefinition.users_wants_to_get_all_Account_informations()"
});
formatter.result({
  "duration": 231765856,
  "status": "passed"
});
formatter.match({
  "location": "AccountStepDefinition.server_returns_a_status_of_get_all_Accounts()"
});
formatter.result({
  "duration": 33159,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Account details is  updated using a web service",
  "description": "",
  "id": "testing-a-rest-api-for-account;account-details-is--updated-using-a-web-service",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "Account Id is provided",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "users want to update Account informations",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "server returns a status of update Accounts",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountStepDefinition.account_Id_is_provided()"
});
formatter.result({
  "duration": 51713,
  "status": "passed"
});
formatter.match({
  "location": "AccountStepDefinition.users_want_to_update_Account_informations()"
});
formatter.result({
  "duration": 90133908,
  "status": "passed"
});
formatter.match({
  "location": "AccountStepDefinition.server_returns_a_status_of_update_Accounts()"
});
formatter.result({
  "duration": 31975,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Account details is  deleted using a web service",
  "description": "",
  "id": "testing-a-rest-api-for-account;account-details-is--deleted-using-a-web-service",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "Account Id is provided",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "users want to delete Account informations",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "server returns a status of delete Accounts",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountStepDefinition.account_Id_is_provided()"
});
formatter.result({
  "duration": 42238,
  "status": "passed"
});
formatter.match({
  "location": "AccountStepDefinition.users_want_to_delete_Account_informations()"
});
formatter.result({
  "duration": 149535260,
  "status": "passed"
});
formatter.match({
  "location": "AccountStepDefinition.server_returns_a_status_of_delete_Accounts()"
});
formatter.result({
  "duration": 31975,
  "status": "passed"
});
});