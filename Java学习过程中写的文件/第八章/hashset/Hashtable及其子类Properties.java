package 第八章.hashset;

import java.util.Properties;
import java.io.*;

public class Hashtable及其子类Properties {
	public static void main(String[] args) throws IOException {
		String path = System.getProperty("user.dir");
        System.out.println(path);
		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream("ipconfig.properties");
		pro.load(fis);
		System.out.println("server ip:" + pro.getProperty("Server"));
		System.out.println("protL" + pro.getProperty("Port"));

	}

}
