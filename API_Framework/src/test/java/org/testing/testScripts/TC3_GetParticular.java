package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.PropertiesLoad;
import org.testng.annotations.Test;

public class TC3_GetParticular {
	@Test
	public void testCase3() throws IOException {
		Properties pr= PropertiesLoad.handleProperties("../API_Framework/URI.properties");
		HTTPMethods http=new HTTPMethods(pr);
		http.getParticular("QA_URI3",TC1_PostRequest.resIdvalue);
		
	}

}
