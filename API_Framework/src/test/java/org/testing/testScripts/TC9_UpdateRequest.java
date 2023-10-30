package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.HandleJsonFile;
import org.testing.utilities.JsonVariableReplacement;
import org.testing.utilities.PropertiesLoad;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC9_UpdateRequest {
	
	@Test
	public void testCase9() throws IOException {
		Properties pr= PropertiesLoad.handleProperties("../API_Framework/URI.properties");
		String requestBody=HandleJsonFile.readJSonFile("../API_Framework/src/test/java/org/testing/resources/PutRequestBody1.json");
		requestBody=JsonVariableReplacement.jsonReplacement(requestBody,"id",TC6_PostRequest.resIdvalue);
		HTTPMethods http=new HTTPMethods(pr);
		Response resObj=http.putMethod(requestBody,"QA_REAL1",TC1_PostRequest.resIdvalue);
	}

}
