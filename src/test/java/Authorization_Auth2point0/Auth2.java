package Authorization_Auth2point0;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class Auth2 {
	
	@Test
	public void test08() {
		RequestSpecification spec = RestAssured.given();
		spec.baseUri("https://api-m.sandbox.paypal.com/");
		spec.basePath("v1/oauth2/token");
	}

}
