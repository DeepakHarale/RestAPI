package ValidateResponseJsonOrBody;

import org.testng.Assert;
import org.testng.annotations.Test;

import groovyjarjarpicocli.CommandLine.Spec;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class ValidaterResponsebodyData {
	
	@Test
	public void vaildateresponseBodyAnyData() {
		
		RequestSpecification spec = RestAssured.given();
		spec.baseUri("https://reqres.in");
		spec.basePath("/api/users?page=2");
		Response resBody = spec.get();
		ResponseBody getData = resBody.getBody();
		String data = getData.asPrettyString();
		System.out.println(data);
		Assert.assertEquals(data.contains("Bluth"),true );
	}

}
