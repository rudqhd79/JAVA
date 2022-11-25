package test.ch11.Exit;

import java.util.Properties;
import java.util.Set;

public class GetProperty {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		
		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userHome);

		Properties props = System.getProperties();
		Set keys = props.keySet();
		
		for (Object objkey: keys) {
			String key = (String) objkey;
//			System.out.println(key);
			System.out.println(System.getProperty(key));
		}
	}

}
