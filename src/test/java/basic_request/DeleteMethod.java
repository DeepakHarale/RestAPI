package basic_request;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteMethod {
	@Test
	public void deleteData() {

		baseURI ="https://reqres.in/api/users/539";
		given()
		.when().delete()
		.then().log().all().statusCode(204);
	}

}
