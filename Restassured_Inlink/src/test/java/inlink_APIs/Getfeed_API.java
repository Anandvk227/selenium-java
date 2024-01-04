package inlink_APIs;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;




public class Getfeed_API {
	
	int id;
	
	@Test(priority=0)
	void Getfeeds() {
		
//		given()
		
		
		when()
		    .get("https://reqres.in/api/users?page=2")
		
		
		.then()
		
		    .statusCode(200);
//		    .body("page",equalTo(2))
//	    	.log.all();
		
	}
	@Test(priority=1)
	public void CreateUser() {
		
		
		HashMap hm=new HashMap();
		
		hm.put("name", "badhri");
		hm.put("job", "Teacher");
		
		id=given()
		
		.contentType("application/json")
		.body(hm)
		
		
		.when()
		.post("https://reqres.in/api/users")
		.jsonPath().getInt("id");
		
//		.then()
//		.statusCode(201)
//		.log().all();
		
	}
  
	@Test(priority=2,dependsOnMethods= {"CreateUser"})
	void updateUser() {
	HashMap hm=new HashMap();
	
	hm.put("name", "badhri");
	hm.put("job", "SD");
	
	given()
	
	.contentType("application/json")
	.body(hm)
	
	
	.when()
	.put("https://reqres.in/api/users/"+id)
	
	
	.then()
	.statusCode(200)
	.log().all();
	
	}

	
	@Test(priority=3)
	
	void DeleteUser() {
		
		given()
		
		.when()
		
		.delete("https://reqres.in/api/users/"+id)
		.then()
		.statusCode(204)
		.log().all();
		
	}

}
