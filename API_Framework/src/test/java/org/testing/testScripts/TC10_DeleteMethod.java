package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.PropertiesLoad;
import org.testng.annotations.Test;

public class TC10_DeleteMethod {
	@Test
	public void testCase10() throws IOException {
		Properties pr= PropertiesLoad.handleProperties("../API_Framework/URI.properties");
		HTTPMethods http=new HTTPMethods(pr);
		http.DeleteMethod("QA_REAL1",TC1_PostRequest.resIdvalue);
		
	}

}
