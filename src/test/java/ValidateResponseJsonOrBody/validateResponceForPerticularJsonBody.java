package ValidateResponseJsonOrBody;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class validateResponceForPerticularJsonBody {
	
	@Test
	public void test07() {
		
		RequestSpecification spec = RestAssured.given();
		spec.baseUri("https://reqres.in");
		spec.basePath("/api/users?page=2");
		
		Response res = spec.get();
		
		ResponseBody body = res.getBody();
		String data = body.asString();
		System.out.println(data);
		
		JsonPath jsonPathView = body.jsonPath();
		
		Assert.assertEquals(jsonPathView.get("data[1].first_name"), "Janet");
	}

}
