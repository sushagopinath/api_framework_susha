//purpose read json file
//input json file path
//output request body string

package org.testing.utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;
public class HandleJsonFile {
	public static String readJSonFile(String jsonFilePath) throws FileNotFoundException {
		File f=new File(jsonFilePath);
		FileInputStream fi=new FileInputStream(f);
		JSONTokener js=new JSONTokener(fi);
		JSONObject j=new JSONObject(js);
		return j.toString();
	}
		
}
