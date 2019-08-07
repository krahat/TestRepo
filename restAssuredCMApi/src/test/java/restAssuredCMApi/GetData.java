/**
 * 
 */
package restAssuredCMApi;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
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
				  .cookie("ASP.NET_SessionId", "rj3yv5x0bt5niybkjkkuegba")
				  .get("/");

		//Response resp =  get("http://xrpswqwebchg01b/Report/KeyingCompletedSOXReport").cookie();
		
			
		int code = resp.getStatusCode();
		
		System.out.println("Status code is : " + code);
		
		
	
		String data = resp.asString();
        System.out.println("Response received is :: " +data);
        
        Assert.assertEquals(code, 200);
		
		}
}
