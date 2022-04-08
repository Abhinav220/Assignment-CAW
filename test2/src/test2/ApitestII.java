package test2;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;


import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class ApitestII {
	@Test()
	public void Task4and5() {
		String responseadduser= given()
				.header("Content-Type","application/json")
.body(Payload.Adduser("hjkolw@testz.com")).when()
.post("https://thinking-tester-contact-list.herokuapp.com/users")
.then().log().all().assertThat().statusCode(201).body("user.firstname", notNullValue(),"user.lastname",notNullValue(),"user.email",notNullValue()).extract().response().asString();

JsonPath js= new JsonPath(responseadduser);

String token= js.getString("token");

		
		String responseaddcontact= given()
				.header("Content-Type","application/json").header("Authorization","Bearer "+token)
.body(Payload.Addcontact()).when()
.post("https://thinking-tester-contact-list.herokuapp.com/users")
.then().log().all().assertThat().statusCode(201)//
.body("firstname",equalTo(""),"lastname",equalTo(""),"lastname",
equalTo(""),"birthdate",equalTo(""),"email",equalTo(""),"phone",equalTo(""))
.extract().response().asString();
		
		JsonPath jse= new JsonPath(responseaddcontact);
		String contactId= jse.getString("contactId");
		
		given().header("Authorization","Bearer "+ token)
				.when().delete("https://thinking-tester-contact-list.herokuapp.com/contacts/"+contactId+"")
				.then().log().all().assertThat().statusCode(204);
		
		try {
			given().header("Authorization","Bearer "+ token)
		.when().get("https://thinking-tester-contact-list.herokuapp.com/contacts/"+contactId+"")
		.then().log().all().extract().response().asString();
		
		}
		catch(Exception e) {
		Assert.assertTrue(true);
		
		
		}
	}
	

}
