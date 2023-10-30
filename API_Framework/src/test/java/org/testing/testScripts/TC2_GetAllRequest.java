package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.PropertiesLoad;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC2_GetAllRequest {
	@Test
	public void testCase2() throws IOException {
		Properties pr= PropertiesLoad.handleProperties("../API_Framework/URI.properties");
		HTTPMethods http=new HTTPMethods(pr);
		Response resObj=http.getAllMethod("QA_URI3");
		System.out.println("*************************************");
		JsonParsingUsingOrgJson.jsonParsing(resObj.asString(), "id",true);
		System.out.println("*************************************");
		JsonParsingUsingOrgJson.jsonParsing(resObj.asString(), "id",false);
		
	}

}
