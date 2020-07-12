package com.fitabank.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {
	
	
	 Properties prop;

		public ReadProp() {
			File file = new File("./configurations/app.properties");
			try {
				FileInputStream fis = new FileInputStream(file);
				prop = new Properties();
				prop.load(fis);

			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		public String getUrl() {
			String url = prop.getProperty("website");
			return url;
		}

		public String getUserName() {
			String url = prop.getProperty("userid");
			return url;
		}

		public String getPassword() {
			String url = prop.getProperty("password");
			return url;
		}

		public String getchromePath() {
			String url = prop.getProperty("chromepath");
			return url;
		}

}
