package basic_request;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class getRequestClass {

	@Test
	public void test01() {
		Response res = get("https://reqres.in/api/users?page=2");
		System.out.println("respoanse body "+res.getBody().asPrettyString());
		System.out.println("respoanse Status code "+res.statusCode());
		System.out.println("response time "+res.getTime());
		System.out.println("response header "+res.getHeader("Accept-Encoding"
				));
		System.out.println("response header "+res.getHeader("Connection"));
		
		
	}
	
	@Test
	public void test02() {
		baseURI="https://reqres.in/api/users";
		given()
		.queryParam("page", "2")
		.when()
		.get()
		.then()
		.statusCode(200);
		
	}
	
	
}
