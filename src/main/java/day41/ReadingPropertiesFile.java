package day41;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
//		1Location of file
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\config.properties");
//		Loading properties file
		Properties propertiesobj = new Properties();
		propertiesobj.load(file);

//		Reading data from properies file
		String url = propertiesobj.getProperty("appurl");
		String mail = propertiesobj.getProperty("email");
		String pwd = propertiesobj.getProperty("password");
		String ordid = propertiesobj.getProperty("orderid");
		String custid = propertiesobj.getProperty("customerid");
		System.out.println(url + " " + mail + " " + pwd + " " + ordid + " " + custid);
//		Set<String> keys = propertiesobj.stringPropertyNames();
//		System.out.println(keys);

//		Set<Object> keys = propertiesobj.keySet();
//		System.out.println(keys);
		
		
//		Reading all the values from properties file
		Collection<Object> values=propertiesobj.values();
		System.out.println(values);
		file.close();
		
	}

}
