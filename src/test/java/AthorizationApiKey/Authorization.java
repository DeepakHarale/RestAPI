package AthorizationApiKey;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Authorization {
	
	@Test
	public void ApiKey() {
		RequestSpecification spec = RestAssured.given();
		spec.baseUri("https://history.openweathermap.org");
		spec.basePath("/data/2.5/history/city?");
		
//		https://history.openweathermap.org/data/2.5/history/city?q=London,UK&appid={API key}
		
		spec.queryParam("q", "india").queryParam("appid", "5661fd5d7b2657094c24d02413630431");
		
		Response res = spec.get();
		
		Assert.assertEquals(res.getStatusCode(), 200);
		
		System.out.println("get ststus "+ res.getStatusLine());
		System.out.println("get Body : "+ res.getBody().asPrettyString());
		
	}

}
