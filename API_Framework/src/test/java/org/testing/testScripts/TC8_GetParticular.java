package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.PropertiesLoad;
import org.testng.annotations.Test;

public class TC8_GetParticular {
	@Test
	public void testCase8() throws IOException {
		Properties pr= PropertiesLoad.handleProperties("../API_Framework/URI.properties");
		HTTPMethods http=new HTTPMethods(pr);
		http.getParticular("QA_REAL1","8");
		
	}

}
