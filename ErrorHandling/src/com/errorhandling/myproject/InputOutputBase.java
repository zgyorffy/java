package com.errorhandling.myproject;

import java.io.BufferedReader;
import java.io.FileReader;

public class InputOutputBase {
	private String PATH = "F:\\java-workspace\\IO\\";
	private String filename;
	private String pathFilename;
	
	public String getFilename () {
		return this.filename;
	}
	
	public String getPathFilename () {
		return this.pathFilename;
	}
	
	public void setFilename(String filename) {
		this.filename = filename;
		this.pathFilename = PATH + filename;
	}
	
	public InputOutputBase() {}
	public InputOutputBase(String filename) {
		this.filename = filename;
		this.pathFilename = PATH + filename;
	}
	
	public void readSumFromFile() {
		BufferedReader reader = null;
		int total = 0;
		
		try {
			reader = new BufferedReader(new FileReader(this.pathFilename));
			String line = null;
			while ((line = reader.readLine()) != null)
				total += Integer.valueOf(line);
			System.out.println("Total: " + total);
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(reader !=null ) {
					reader.close();	
				}	
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public void readFile() {
		BufferedReader reader = null;
		int i = 0;
		
		try {
			reader = new BufferedReader(new FileReader(this.pathFilename));
			String line = null;
			System.out.println("nr : content");
			System.out.println("------------");
			
			while ((line = reader.readLine()) != null) {
				System.out.println(Integer.toString(i) + " : " + line);
				i = i + 1;
			}
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(reader !=null ) {
					reader.close();	
				}	
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
