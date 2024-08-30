package Athorization_BearerToken;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Athorization {

	@Test
	public void bearerToken() {
		RequestSpecification spec = RestAssured.given();
		spec.baseUri("https://gorest.co.in");
		spec.basePath("/public/v2/users");
		
		JSONObject payload = new JSONObject();
		payload.put("name", "Deepak1234");
		payload.put("email", "Depak1234@gmail.com");
		payload.put("gender", "male");
		payload.put("status", "active");
		
		String authToken ="Bearer 861c92b68ad0d181218066f70926e8467bfec1fe32442ba26a85ca2a1d7d8e38";
		
		spec.header("Authorization", authToken)
		.contentType(ContentType.JSON)
		.body(payload.toJSONString());
		
		Response res = spec.post();
		Assert.assertEquals(res.statusCode(), 201);
		System.out.println("Speponse status "+res.statusLine() );
		System.out.println("Speponse Body: "+res.getBody().asPrettyString() );
		
	}

}
