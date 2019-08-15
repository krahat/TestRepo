/**
 * 
 */
package restAssuredCMApi;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.authentication.FormAuthConfig;
import io.restassured.response.Response;


/**
 * @author krahat
 *
 */
public class GetData {

	@Test
	public void getTest() {
		
		Response resp = given()
				  .baseUri("http://xrpswqwebchg01b")
				  .basePath("/")
				  .cookie("ASP.NET_SessionId", "d0rby0l2kpjsliwgzb540vg3")
				  .get("/");
		
		//given().auth().form("HCA\\JSO7296", "Welcome2#").expect().statusCode(200).when().get("http://xrpswqwebchg01b");
		
		//given().auth().form("HCA\\JSO7296", "Welcome2#", FormAuthConfig.springSecurity()).expect().statusCode(200).when().get("http://xrpswqwebchg01b");

		//Response resp =  get("http://xrpswqwebchg01b/Report/KeyingCompletedSOXReport").cookie();
		
			
		int code = resp.getStatusCode();
		
		System.out.println("Status code is : " + code);
		
		
	
		String data = resp.asString();
        System.out.println("Response received is :: " +data);
        
        Assert.assertEquals(code, 200);
		
		}
	
	@Test
	public void postTest() {
		
		Response resp = given()
				  .baseUri("http://xrpswqwebchg01b")
				  .basePath("/")
				  .cookie("ASP.NET_SessionId", "d0rby0l2kpjsliwgzb540vg3")
				  .post("/Home/GetHomeDataTest");
		
		//given().auth().form("HCA\\JSO7296", "Welcome2#").expect().statusCode(200).when().get("http://xrpswqwebchg01b");
		
		//given().auth().form("HCA\\JSO7296", "Welcome2#", FormAuthConfig.springSecurity()).expect().statusCode(200).when().get("http://xrpswqwebchg01b");

		//Response resp =  get("http://xrpswqwebchg01b/Report/KeyingCompletedSOXReport").cookie();
		
			
		int code = resp.getStatusCode();
		
		System.out.println("Status code is : " + code);
		
		
	
		String data = resp.asString();
        System.out.println("Response received is :: " +data);
        
        Assert.assertEquals(code, 200);
		
		}
}

