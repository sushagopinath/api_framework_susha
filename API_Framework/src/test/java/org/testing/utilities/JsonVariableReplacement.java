//input --json data,variable name,variable value
//purpose-to assign the value to the variable
//output--after replacement it will give the complete string
package org.testing.utilities;

import java.util.regex.Pattern;

public class JsonVariableReplacement {
	
	public static String jsonReplacement(String reqBody,String variableName,String variableValue) {
		reqBody=reqBody.replaceAll(Pattern.quote("{{"+variableName+"}}"), variableValue);
		return reqBody;
	}

}
