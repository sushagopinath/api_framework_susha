package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;
import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.HandleJsonFile;
import org.testing.utilities.JsonVariableReplacement;
import org.testing.utilities.PropertiesLoad;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC4_UpdateRequest {
	@Test
	public void testCase4() throws IOException {
		Properties pr= PropertiesLoad.handleProperties("../API_Framework/URI.properties");
		String requestBody=HandleJsonFile.readJSonFile("../API_Framework/src/test/java/org/testing/resources/PutRequestBody.json");
		requestBody=JsonVariableReplacement.jsonReplacement(requestBody,"id",TC1_PostRequest.resIdvalue);
		HTTPMethods http=new HTTPMethods(pr);
		Response resObj=http.putMethod(requestBody,"QA_URI3",TC1_PostRequest.resIdvalue);
	}

}
