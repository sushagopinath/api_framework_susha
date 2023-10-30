package org.testing.utilities;

import io.restassured.response.Response;

public class JsonParsing {
	
	public static String jsonParsingUsingJsonPath(Response rs,String jsonPath) {
		String extractedValue=rs.jsonPath().get(jsonPath);
		return extractedValue;
				
	}

}
