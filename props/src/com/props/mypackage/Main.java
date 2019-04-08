package com.props.mypackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {
		
		//property file creation
		try {
			propsWriter();
		} catch (Exception e) {
			System.out.println(e.getClass().getSimpleName() +  " - " + e.getMessage());
		}
		
		//property file read
		try {
			propsReader();
		} catch (Exception e) {
			System.out.println(e.getClass().getSimpleName() +  " - " + e.getMessage());
		}
		
		//property XML file creation
		try {
			propsXMLWriter();
		} catch (Exception e) {
			System.out.println(e.getClass().getSimpleName() +  " - " + e.getMessage());
		}
		
		//property XML file reader
		try {
			propsXMLReader();
		} catch (Exception e) {
			System.out.println(e.getClass().getSimpleName() +  " - " + e.getMessage());
		}

	}
	
	public static void propsReader() throws IOException {
		Properties props = new Properties();
		
		try (BufferedReader reader = Files.newBufferedReader(Paths.get("xyz.properties"))) {
			props.load(reader);
		}
		String val1 = props.getProperty("name");
		String val2 = props.getProperty("mobile");
		System.out.println(val1);
		System.out.println(val2);
	}
	
	public static void propsXMLReader() throws IOException {
		Properties props = new Properties();
		
		try (InputStream in = Files.newInputStream(Paths.get("props.xml"))) {
			props.loadFromXML(in);
		}
		String val1 = props.getProperty("name");
		String val2 = props.getProperty("mobile");
		System.out.println(val1);
		System.out.println(val2);
	}
	
	public static void propsXMLWriter() throws IOException {
		Properties props = new Properties();
		props.setProperty("name", "Zsolt");
		props.setProperty("mobile", "0744xxx");
		
		try (OutputStream out = Files.newOutputStream(Paths.get("props.xml"))) {
			props.storeToXML(out, "my comment");
		}
	}
	public static void propsWriter() throws IOException {
		Properties props = new Properties();
		props.setProperty("name", "Zsolt");
		props.setProperty("mobile", "0744xxx");
		
		try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("xyz.properties"))) {
			props.store(writer, "my comment");
		}
	}

}
