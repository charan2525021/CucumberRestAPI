package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import utility.BaseTest;

import static io.restassured.RestAssured.given;
import static utility.FrameworkUtility.logResponseAsString;

public class population {

    private Response response;

    @Given("request the population end point")
    public void request_the_population_end_point() {
        System.out.println(BaseTest.requestSpec);
        response = given().
                spec(BaseTest.requestSpec).
                queryParam("drilldowns","Nation").
                queryParam("measures","Population").
                when().
                get("/api/data").then().extract().response();


        logResponseAsString(response);
        throw new cucumber.api.PendingException();

    }

    @Then("Validate the response")
    public void validate_the_response() {

        logResponseAsString(response);
        throw new cucumber.api.PendingException();

    }
}
