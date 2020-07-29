package javed.com.test;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8Tester {

	public static void main(String args[]) {
	      
	      // Count empty strings
	      List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl","fsd");
	      System.out.println("List: " +strings);
	      
	      long count;
	      count= strings.stream().filter(string -> string.isEmpty()).count();
	      
	      System.out.println("Empty String :  "+count);
	      
	      count=strings.stream().filter(string -> string.length() == 3).count();
	      System.out.println("String Length:  "+count);
	      
	      List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
	      System.out.println("String Length:  "+filtered);
	      
	      String mergStr = strings.stream().filter(string -> ! string.isEmpty()).collect(Collectors.joining(", "));
	      
	      System.out.println("Merged String : "+mergStr);
	      
	      List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
	      
	      List<Integer> squaresList=numbers.stream().map(i -> i * i).collect(Collectors.toList());
	      
	      System.out.println(" Numbers        : "+numbers);
	      System.out.println(" Square Numbers : "+squaresList);
	      
	      List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19);
	      
	      IntSummaryStatistics stats =integers.stream().mapToInt((x) ->x).summaryStatistics();
	      System.out.println("List : "+integers);
	      System.out.println("Highest number in List : "+stats.getMax());
	      System.out.println("Lowest number in List :  "+stats.getMin());
	      System.out.println("SUm of all numbers : "+stats.getSum());
	      System.out.println("Avereage of all numbers : : "+stats.getAverage());
	     
	      
	      
	}
}
