package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonParsingUsingOrgJson {
	public static void jsonParsing(String responseData,String keyName,boolean singleValue) {
		JSONArray js=new JSONArray(responseData);
		if(singleValue) {
			JSONObject j=js.getJSONObject(1);
			System.out.println(j.get(keyName));
		}
		else {
		 int len=js.length();
		 for(int i=0;i<len;i=i+1) { 
			 JSONObject  j=js.getJSONObject(i); 
			 System.out.println(j.get(keyName)); }
		 
		}
	}

}
