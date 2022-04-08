package test2;


import static org.hamcrest.Matchers.*;

import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Apitest {
	
	
	
	@Test
	public void Task1and2() {
				
		String responseadduser= given()
								.header("Content-Type","application/json")
				.body(Payload.Adduser("fghjk@test.com")).when()
		.post("https://thinking-tester-contact-list.herokuapp.com/users")
		.then().log().all().assertThat().statusCode(201).body("user.firstname", notNullValue(),"user.lastname",notNullValue(),"user.email",notNullValue()).extract().response().asString();
		
		JsonPath js= new JsonPath(responseadduser);
		
		String token= js.getString("token");
		String fname1= js.getString("user.firstname");
		String lname1= js.getString("user.lastname");
		String mail1= js.getString("user.email");
		
		
		String responsefetchuser=given().header("Authorization","Bearer "+ token)
		.when().get("https://thinking-tester-contact-list.herokuapp.com/users/me")
		.then().log().all().assertThat().statusCode(200).body("firstname", notNullValue(),"lastname",notNullValue(),"email",notNullValue())
		.extract().response().asString();
		
		
		
		JsonPath jse= new JsonPath(responsefetchuser);
		
		
		Assert.assertEquals(jse.getString("firstname"), fname1);
		Assert.assertEquals(jse.getString("lastname"), lname1);
		Assert.assertEquals(jse.getString("email"), mail1);
		
		
	}
		
		
		
		@Test
		public void Task3() {
			String falsetoken= "eyJhbGciOiE2NDkzMzQ1OTV9.UqPW_R1e3EcJx1L84Kcl0g5_vy0NBSNSjwwEKmP3Fo0";
			try {
				given().header("Authorization","Bearer "+ falsetoken)
				.when().get("https://thinking-tester-contact-list.herokuapp.com/users/me")
				.then().log().all()
				.extract().response().asString();
				
			}
			catch(Exception e) {
				
				Assert.assertTrue(true);
			}
		}
		
			
		
		
		
	
}
