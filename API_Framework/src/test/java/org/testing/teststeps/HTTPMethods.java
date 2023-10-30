//purpose -to hit the http method
//input Request Body
//output response
package org.testing.teststeps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
public class HTTPMethods {
	Properties proObject;
	public HTTPMethods(Properties proObject) {
		this.proObject=proObject;
	}
	public Response postMethod(String requestBody,String uriKeyName) {
		String uriValue=proObject.getProperty(uriKeyName);
		Response rs=
				given()
				.contentType(ContentType.JSON)
				.body(requestBody)
				.when()
				.post(uriValue);
		System.out.println("Status code is "+rs.statusCode());
		System.out.println(rs.asString());
		return rs;
	}
	public Response getAllMethod(String uriKeyName) {
		String uriValue=proObject.getProperty(uriKeyName);
		Response rs=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(uriValue);
		System.out.println("Status code is "+rs.statusCode());
		System.out.println("Request data is");
		System.out.println(rs.asString());
		return rs;
	}
	public void getParticular(String uriKeyName,String endPointValue) {
		String uriValue=proObject.getProperty(uriKeyName)+"/"+endPointValue;
		Response rs=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(uriValue);
		System.out.println("Status code is "+rs.statusCode());
		System.out.println("Request data is");
		System.out.println(rs.asString());
	}
	public Response putMethod(String requestBody,String uriKeyName,String endPointValue) {
		String uriValue=proObject.getProperty(uriKeyName)+"/"+endPointValue;
		Response rs=
				given()
				.contentType(ContentType.JSON)
				.body(requestBody)
				.when()
				.put(uriValue);
		System.out.println("Status code is "+rs.statusCode());
		System.out.println("Request data is");
		System.out.println(rs.asString());
		return rs;
	}
	public void DeleteMethod(String uriKeyName,String endPointValue) {
		String uriValue=proObject.getProperty(uriKeyName)+"/"+endPointValue;
		Response rs=
				given()
				.contentType(ContentType.JSON)
				.when()
				.delete(uriValue);
		System.out.println("Status code is "+rs.statusCode());
		System.out.println("Request data is");
		System.out.println(rs.asString());
	}
}
