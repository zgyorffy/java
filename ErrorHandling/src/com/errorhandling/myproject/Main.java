package com.errorhandling.myproject;

public class Main {

	public static void main(String[] args) {
		
		//simple try catch
		simpleTryCatch();
		
		//IO -> finally
		readFile();
	}
	
	public static void readFile() {
		System.out.println("\n\n");
		System.out.println("readFile");
		System.out.println("-----------------------");
		
		String filename = "Numbers.txt";
		InputOutputBase io = new InputOutputBase(filename);
		io.readSumFromFile();
		System.out.println();
		io.readFile();
	}
	
	public static void simpleTryCatch() {
		
		//System.out.println("\n\n");
		System.out.println("simpleTryCatch");
		System.out.println("-----------------------");
		
		int i = 12;
		int j = 2;
		
		try {
			int result = i / (j - 2);
			System.out.println(result);
			
		} catch (Exception e) {
			System.out.println(
					"error: " + e.getMessage());
			//if uncommented it shows the real java built in error
			//e.printStackTrace();
		}
	}

}
