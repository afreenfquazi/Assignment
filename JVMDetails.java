package com.practice.assignment1;

import java.util.Properties;

public class JVMDetails {

	public static void main(String[] args) {
		Runtime.Version version = Runtime.version();
		System.out.println(version);
		Properties prop = System.getProperties();
		System.out.println(prop.getProperty("java.vendor"));
		System.out.println(prop.getProperty("java.class.path"));
		System.out.println(prop.getProperty("user.home"));
		System.out.println(prop.getProperty("os.name"));
		System.out.println(prop.getProperty("os.version"));
	}

}

