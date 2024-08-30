package basic_request;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutMethod {
	
	@Test
	public void test04() {
		JSONObject jsnData = new JSONObject();
		jsnData.put("dhoni","rana");
		jsnData.put("convey", "stive");
		
		baseURI ="https://reqres.in/api/users/539";
		given().header("Content-Type",
				"application/json"
				)
		.contentType(ContentType.JSON)
		.body(jsnData.toJSONString())
		.when().put()
		.then().statusCode(200).log().all();
		
		
		
	}

}
