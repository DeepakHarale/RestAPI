package basic_request;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest {
	@Test
	public void getAllUrl() {
		
		RestAssured.baseURI ="https://reqres.in/";
		Response res = given()
		.when()
		.get("api/users?page=2")
		.then()
		.extract()
		.response();
		String resp = res.asPrettyString();
		System.out.println(resp);
		
	}
	
}
