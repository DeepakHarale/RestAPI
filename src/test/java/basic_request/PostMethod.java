
package basic_request;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostMethod {
	
	@Test
	public void test03() {
		JSONObject jsnData = new JSONObject();
		jsnData.put("Rony","Shaha");
		jsnData.put("Moni", "Roe");
		
		baseURI ="https://reqres.in/api/users";
		given().header("Content-Type",
				"application/json"
				)
		.contentType(ContentType.JSON)
		.body(jsnData.toJSONString())
		.when().post()
		.then().statusCode(201).log().all();
		
		
		
	}

}
