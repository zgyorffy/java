package com.strings.myproject;

import java.util.StringJoiner;

public class Main {

	public static void main(String[] args) {
		
		//equality in strings example
		stringEquals();
		
		//converting Non-string to String
		nonString2String();
		
		//toStringMethod
		toStringMethod();
		
		//StringBuilder -> allocate a buffer string -> will increase if exceeded
		stringBuilderMethod();
		
		//StringJoiner method
		stringJoinerMethod();
		
		//StringFormatter method
		stringFormatter();
		
		//stringReplaceAll 
		stringReplaceAll();
	}
	
	public static void stringReplaceAll() {
		System.out.println("\n\n");
		System.out.println("stringReplaceAll");
		System.out.println("-----------------------");
		
		String s1 = "abcd efgaaa";
		
		System.out.println(s1);
		
		s1 = s1.replaceAll("a", "x");
		System.out.println(s1);
		
	}
	
	public static void stringFormatter() {
		System.out.println("\n\n");
		System.out.println("stringFormatter");
		System.out.println("-----------------------");
		
		int v1 = 5;
		int v2 = 6;
		float v3 = 1.000f;
		
		String s1 = String.format("V1: %d, V2: %d, V3: %.1f", v1, v2, v3);
		
		System.out.println(s1);
		
	}
	
	public static void stringJoinerMethod() {
		System.out.println("\n\n");
		System.out.println("stringJoinerMethod");
		System.out.println("-----------------------");
		
		StringJoiner sj = new StringJoiner(", ");
		sj.add("alpha");
		sj.add("beta");
		sj.add("gamma");
		String theResult = sj.toString();
		
		System.out.println("string: " + theResult);
		
		//Separator, first value, last value
		StringJoiner sj2 = new StringJoiner(", ","{","}");
		sj2.add("alpha");
		sj2.add("beta");
		sj2.add("gamma");
		String theResult2 = sj2.toString();
		
		System.out.println("string: " + theResult2);
		
	}
	
	public static void stringBuilderMethod() {
		System.out.println("\n\n");
		System.out.println("stringBuilderMethod");
		System.out.println("-----------------------");
		
		//SrtingBuilder -> built in
		StringBuilder sb = new StringBuilder(40);
		ToStringMethodBase s = new ToStringMethodBase(5);
		String name = "Zsolt";
		
		sb.append(name);
		sb.append(" - ");
		sb.append("sb.append(s) is calling toString() from class -> ");
		sb.append(s);
		
		System.out.println("sb.toString      : " + sb.toString());
		System.out.println("capacity()       : " + sb.capacity());
		System.out.println("length()         : " + sb.length());
		
		sb.insert(0, "INSERT - ");
		System.out.println("after insrer()   : " + sb.toString());
		
		
	}
	
	public static void toStringMethod() {
		System.out.println("\n\n");
		System.out.println("toStringMethod");
		System.out.println("-----------------------");
		
		ToStringMethodBase s = new ToStringMethodBase(100);
		System.out.println(s.toString());
	}
	
	public static void nonString2String() {
		System.out.println("\n\n");
		System.out.println("nonString2String");
		System.out.println("-----------------------");
		
		int iVal = 100;
		int a = 2;
		int b = 3;
		int result = a * b;
		
		String sVal = String.valueOf(iVal); 
		System.out.println(sVal + " is string now");
		
		System.out.println(a + "*" + b + "=" + result);
	}
	
	public static void stringEquals() {
		System.out.println("stringEquals");
		System.out.println("-----------------------");
		
		String s1 = "Me2";
		s1 += "b";
		
		String s2 = "Me"; 
		s2 += "2b";
		
		//they are not equal because the 2 strings are pointing to 2 different locations
		if(s1 == s2) {
			System.out.println("== : They are equal");
		} else {
			System.out.println("== : Not equal");
		}
		
		//character by character comparison -> big workload
		if(s1.equals(s2)) {
			System.out.println("equals() : They are equal");
		} else {
			System.out.println("equals() : Not equal");
		}
		
		//using INTERN returns a hash of the string and the 2 hashes are compared -> much faster
		
		String s3 = s1.intern();
		String s4 = s2.intern();
		
		if (s3 == s4) {
			System.out.println("== : They are equal");
		} else {
			System.out.println("== : Not equal");
		}
	}

}
