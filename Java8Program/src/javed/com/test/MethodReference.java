package javed.com.test;

import java.util.function.Function;

public class MethodReference {

	public static void saySomething() {
		System.out.println("Hello,This is static method");
	}
	
	public static void ThreadStatus() {
		System.out.println("Thread is Running...");
	}
	static String show(String msg) {
		return "Hello " + msg;
	}
	public static void main(String args[]) {
		//Refering static method
		Sayable2 s = MethodReference::saySomething;
		
		//Calling Method
	    s.say();
	    
	       
	    Thread t1=new Thread(MethodReference::ThreadStatus);
	    t1.start();
	    
	    // Function interface referring to a method  
	    Function<String, String> fun =MethodReference::show;
	    System.out.println(fun.apply("Javed"));
	}
}
