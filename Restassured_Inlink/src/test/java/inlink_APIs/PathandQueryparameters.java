package inlink_APIs;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class PathandQueryparameters {
	
	
	//   https://reqres.in/api/users?page=2&id=5
	//   https://35keky97z1.execute-api.ap-southeast-1.amazonaws.com/uat/user?id=7eda6ea3-dad5-4655-a64d-82413927790b

	
	@Test
	 void testpathandqueryparams() {
		
		given()
		
		.pathParam("mypath", "users")
		.queryParam("page", "2")
		.queryParam("id", "5")
		
		
		.when()
		
		.get("https://reqres.in/api/{mypath}")
		
		.then()
		
		.statusCode(200)
		.log().all();
		
		
	}

}
