package stepDefinition;


import Request.Request;

import RequestBuilder.TestDataBuilder;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import pojo.PersonalRecord;

public class CreatePersonalRecordStepDef {

    public PersonalRecord pr ;

    public Request rq;

    public Response rs;

    @Given("Add payload")
    public void add_payload() {

       TestDataBuilder prB = new TestDataBuilder();

       pr =  prB.generateBody() ;

    }
    @When("user call the api with POST request")
    public void user_call_the_api_with_post_request() throws JsonProcessingException {
        rq = new Request();
        rs = rq.postMethod(pr);
    }
    @Then("user will get success response with status code {int}")
    public void user_will_get_success_response_with_status_code(int expectedCode) {

        System.out.println("Response---> "+rs.asString());

        int responseCode =  rs.getStatusCode();

        Assert.assertEquals(responseCode,expectedCode);
    }
    @Then("all the required details are present in response body")
    public void all_the_required_details_are_present_in_response_body() {



    }

}
