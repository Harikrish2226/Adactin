package com.sam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Read_ConfigProperties {

	public static void readProp() {

		try {
			File file = new File(
					"C:\\Users\\Hari\\eclipse-workspace\\MyFirstProjet\\src\\test\\resources\\TestData\\config.properties");
			FileReader reader = new FileReader(file);
			Properties prop = new Properties();
			prop.load(reader);

			String url = prop.getProperty("url");
			System.out.println(url);

			String userName = prop.getProperty("username");
			System.out.println(userName);

			String pswrd = prop.getProperty("password");
			System.out.println(pswrd);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

		public static String readProp_reuseable(String data) {
			String value =null;
			try {
				File file = new File(
						"C:\\Users\\Hari\\eclipse-workspace\\MyFirstProjet\\src\\test\\resources\\TestData\\config.properties");
	
				FileReader reader = new FileReader(file);
				Properties prop = new Properties();
				prop.load(reader);
				value = prop.getProperty(data);
				System.out.println(value);
	
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return value;
		}

	public static void main(String[] args) {
		//readProp();
		readProp_reuseable("password");
	}

}
