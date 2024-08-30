package basic_request;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PatchMethod {
	@Test
	public void test04() {
		JSONObject jsnData = new JSONObject();
		jsnData.put("agent","K");
		jsnData.put("Agent", "J");
		
		baseURI ="https://reqres.in/api/users/539";
		given().header("Content-Type",
				"application/json"
				)
		.contentType(ContentType.JSON)
		.body(jsnData.toJSONString())
		
		.when().patch()
		.then().log().all()
			.statusCode(200);
			
		
		
		
	}
}
