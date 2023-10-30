package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.PropertiesLoad;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC7_GetAllRequest {
	
	@Test
	public void testCase7() throws IOException {
		Properties pr= PropertiesLoad.handleProperties("../API_Framework/URI.properties");
		HTTPMethods http=new HTTPMethods(pr);
		Response resObj=http.getAllMethod("QA_REAL");
	}

}
