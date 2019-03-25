package com.strings.myproject;

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
