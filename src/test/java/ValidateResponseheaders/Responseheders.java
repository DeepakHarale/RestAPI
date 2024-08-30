package ValidateResponseheaders;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Responseheders {
	
	@Test
	public void Test06(){
		RequestSpecification spec = RestAssured.given();
		spec.baseUri("https://reqres.in/");
		spec.basePath("api/users/2");
		Response res = spec.get();
		 String contentType = res.getHeader("Content-Type");
		
		 System.out.println(contentType);
		 
		 Assert.assertEquals(contentType, "application/json; charset=utf-8");
		 
		  Headers listheaders = res.getHeaders();
		 for(Header head1:listheaders) {
			 System.out.println(head1.getName()+": "+ head1.getValue());
		 }
		 
		
	}

}
