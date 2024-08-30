package ValidateResponse;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ValidateAssertResponse {
	
	@Test
	public void assertMethodResponseForGet() {
		 RestAssured.baseURI="https://reqres.in/api/users/2";
		 RequestSpecification specific = RestAssured.given();
		 Response res = specific.get();
		 int status = res.getStatusCode();
		 Assert.assertEquals(status, 200,"Wrong status code");
		 
		 String line = res.getStatusLine();
		 Assert.assertEquals(line, "HTTP/1.1 200 OK");
		 
	}

}
