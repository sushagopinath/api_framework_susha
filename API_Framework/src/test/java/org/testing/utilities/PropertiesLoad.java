//purpose load any property file
//input-file path
//output-object of the properties class
package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLoad {
		public static Properties handleProperties(String filePath) throws IOException {
			File f=new File(filePath);
			FileInputStream fi=new FileInputStream(f);
			Properties pr=new Properties();
			pr.load(fi);
			return pr;
	}
	

}
