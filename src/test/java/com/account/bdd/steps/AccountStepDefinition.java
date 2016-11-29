
package com.account.bdd.steps;

import com.example.cloudant.app.entity.Account;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.*;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class AccountStepDefinition {

    private static final String RESTFUL_URL = "http://localhost:8766/account";
    private static final String ACCOUNT_ID = "/30399794492a473a4eb71de41b572a9c";
    private static final String APPLICATION_JSON = "application/json";
    private static final String JSON_FILE = "account.json";
    

    private static String convertHttpResponseToString(HttpResponse httpResponse) throws IOException {
        InputStream inputStream = httpResponse.getEntity().getContent();
        return convertInputStreamToString(inputStream);
    }

    private static String convertInputStreamToString(InputStream inputStream) {
        Scanner scanner = new Scanner(inputStream, "UTF-8");
        String string = scanner.useDelimiter("\\Z").next();
        scanner.close();
        return string;
    }
    @Given("^Account details$")
    public void account_details() throws Throwable {


    }

    @When("^users submits the data$")
    public void users_submits_the_data() throws Throwable {
        InputStream jsonInputStream = this.getClass().getClassLoader().getResourceAsStream(JSON_FILE);
        String jsonString = new Scanner(jsonInputStream, "UTF-8").useDelimiter("\\Z").next();

        CloseableHttpClient httpClient = HttpClients.createDefault();

        HttpPost request = new HttpPost(RESTFUL_URL);
        StringEntity entity = new StringEntity(jsonString);
        request.addHeader("content-type", APPLICATION_JSON);
        request.setEntity(entity);
        HttpResponse response = httpClient.execute(request);

        assertEquals(201, response.getStatusLine().getStatusCode());

    }

    @Then("^server returns a status of add Account$")
    public void server_returns_a_status_of_add_Account() throws Throwable {


    }

    @Given("^Account id is provided$")
    public void account_id_is_provided() throws Throwable {


    }

    @When("^users want to get information about an Account$")
    public void users_want_to_get_information_about_an_Account() throws Throwable {

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet request = new HttpGet(RESTFUL_URL + ACCOUNT_ID);
        HttpResponse httpResponse = httpClient.execute(request);
        String stringResponse = convertHttpResponseToString(httpResponse);
        assertEquals(200, httpResponse.getStatusLine().getStatusCode());

   }

    @Then("^the requested Account data is returned$")
    public void the_requested_Account_data_is_returned() throws Throwable {


    }

    @Given("^RESTFul url is provided$")
    public void restful_url_is_provided() throws Throwable {


    }

    @When("^users wants to get all Account informations$")
    public void users_wants_to_get_all_Account_informations() throws Throwable {

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet request = new HttpGet(RESTFUL_URL);
        HttpResponse httpResponse = httpClient.execute(request);
        String stringResponse = convertHttpResponseToString(httpResponse);
        assertEquals(200, httpResponse.getStatusLine().getStatusCode());

    }

    @Then("^server returns a status of get all Accounts$")
    public void server_returns_a_status_of_get_all_Accounts() throws Throwable {


    }

    @Given("^Account Id is provided$")
    public void account_Id_is_provided() throws Throwable {


    }

    @When("^users want to update Account informations$")
    public void users_want_to_update_Account_informations() throws Throwable {

        InputStream jsonInputStream = this.getClass().getClassLoader().getResourceAsStream(JSON_FILE);
        String jsonString = convertInputStreamToString(jsonInputStream);
        CloseableHttpClient client = HttpClients.createDefault();

        HttpPut httpPost = new HttpPut(RESTFUL_URL + ACCOUNT_ID);
        StringEntity entity = new StringEntity(jsonString, "UTF-8");
        httpPost.setEntity(entity);
        httpPost.setHeader("Accept", APPLICATION_JSON);
        httpPost.setHeader("Content-type", APPLICATION_JSON);
        CloseableHttpResponse httpResponse = client.execute(httpPost);
        assertEquals(200, httpResponse.getStatusLine().getStatusCode());
        client.close();

    }

    @Then("^server returns a status of update Accounts$")
    public void server_returns_a_status_of_update_Accounts() throws Throwable {


    }

    @When("^users want to delete Account informations$")
    public void users_want_to_delete_Account_informations() throws Throwable {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpDelete request = new HttpDelete(RESTFUL_URL + "/30399794492a473a4eb71de41b56cf7f");
        HttpResponse httpResponse = httpClient.execute(request);
        String stringResponse = convertHttpResponseToString(httpResponse);
        assertEquals(404, httpResponse.getStatusLine().getStatusCode());

    }

    @Then("^server returns a status of delete Accounts$")
    public void server_returns_a_status_of_delete_Accounts() throws Throwable {


    }

}
