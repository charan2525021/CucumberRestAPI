package utility;


import io.cucumber.java.Before;
import org.testng.annotations.BeforeMethod;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


public class BaseTest extends FrameworkUtility {

	public static RequestSpecification requestSpec;
	public static ResponseSpecification responseSpec;

	public void setBaseURI() {
		
//        AllureLogger.logToAllure("The base URI is : "+readConfigurationFile("Base_URI"));
		requestSpec = new RequestSpecBuilder().
                		setBaseUri(readConfigurationFile("Base_URI")).
                		build();
        
	}

	/*****************************************************************************************************************/
//	@AfterSuite
	public void afterSuite() {

	}
	
	/****************************************************************************************************************/
//	@BeforeClass
	public void beforeClass() {
	}
	
	/****************************************************************************************************************/	
//	@AfterClass
	public void afterClass(){

	}
	
	/************************************************************************************************************************/
	@BeforeMethod
	public void beforeMethod() {
    	responseSpec = new ResponseSpecBuilder().expectStatusCode(200).build();        
	}

//	@AfterMethod
	public void afterMethod() {

	}

}
/*****************************************************************************************************************/