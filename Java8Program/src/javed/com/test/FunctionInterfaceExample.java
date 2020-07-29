package javed.com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionInterfaceExample {

	static Integer addList(List<Integer> list) {
		return list.stream().mapToInt(Integer ::intValue).sum();
	}
	
	
	public static void main(String args[]) {
		// Creating a list and adding values  
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		
		// Referring addList() method  
		Function<List<Integer>,Integer> fun=FunctionInterfaceExample::addList;
		
		// Calling Function interface method 
		System.out.println("Sum of list values :"+fun.apply(list1)  );
	}
}
