package com.qa.day1;

public class Hello {
	
	public static void method1() {
		System.out.println("Hello");
	}
	
	public static void method2() {
		System.out.println("Hello2222");
	}
	
	public static void method3() {
		System.out.println("Hello3333");
	}
	
	public static void method4() {
		String hi = "Hello World from Hello";
		System.out.println(hi);
	}
	
	public static String method5() {
		return "Hello world - return";
	}	
		
	public  static void method6() {
		String stored = "This is a stored message";
		System.out.println("Repeating " + stored);
	}
	
	public static void method7(String fname, String sname ) {
		System.out.println("Hiya " + fname + sname);
	}	
	
	
	
	public static void runAll() {
		method1();
		method2();
		method3();
		method4();
		//method5();
		method6();
		//method7();
	}

}
