package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.HandleJsonFile;
import org.testing.utilities.JsonParsing;
import org.testing.utilities.JsonVariableReplacement;
import org.testing.utilities.PropertiesLoad;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC6_PostRequest {
	static String resIdvalue;
	@Test
	public void testCase6() throws IOException {
		
		Properties pr= PropertiesLoad.handleProperties("../API_Framework/URI.properties");
		String requestBody=HandleJsonFile.readJSonFile("../API_Framework/src/test/java/org/testing/resources/RequestBody1.json");
		Random r=new Random();
		Integer idValue=r.nextInt();
		requestBody=JsonVariableReplacement.jsonReplacement(requestBody,"id",idValue.toString());
		System.out.println("Before hitting the request:");
		System.out.println(requestBody);
		HTTPMethods http=new HTTPMethods(pr);
		Response resObj=http.postMethod(requestBody,"QA_REAL1");
		resIdvalue=JsonParsing.jsonParsingUsingJsonPath(resObj, "id");

	}

}
