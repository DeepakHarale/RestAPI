package WorkWithQueryParameter;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class ValidateQueryparam {

	@Test
	public void validateSingleData() {
		RequestSpecification spec = RestAssured.given();
		spec.baseUri("https://reqres.in");
		spec.basePath("/api/users");
		spec.queryParam("page", 2).queryParam("id", 8);
		
		Response res = spec.get();
		JsonPath json = res.jsonPath();
		ResponseBody body = res.getBody();
		String data = body.asString();
		System.out.println(data);
		String name = json.get("data.last_name");
		Assert.assertEquals("Ferguson", name);
		
	}

}
