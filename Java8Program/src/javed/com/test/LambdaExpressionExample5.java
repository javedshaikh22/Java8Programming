package javed.com.test;

import java.util.ArrayList;
import java.util.List;



public class LambdaExpressionExample5 {

	public static void main(String[] args) {

		// Multiple parameters in lambda expression
		Addable a1 = (a, b) -> (a + b);
		System.out.println(a1.add(100, 300));

		// Multiple parameters with data type in lambda expression
		Addable ad2 = (int a, int b) -> (a + b);
		System.out.println(ad2.add(10, 20));

		// Lambda expression with return keyword.   
		Addable ad3=(a,b) ->{return (a+b);};
		System.out.println("Lambda expression with return keyword :"+ad3.add(30, 40));
		
		// For Each loop
		List <String> list = new ArrayList<String>();
		
		 list.add("ankit");  
	        list.add("mayank");  
	        list.add("irfan");  
	        list.add("jai");  
	      System.out.println("For Each Loop");  
	       list.forEach(
	    		   	(n)-> System.out.println(n)
	    		   	); 
		
	}
}
