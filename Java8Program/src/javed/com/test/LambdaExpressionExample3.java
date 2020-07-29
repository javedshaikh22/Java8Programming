package javed.com.test;

public class LambdaExpressionExample3 {
 public static void main(String args[]) {
	 
	 Sayable s1 =()->{
		 return "Hello Java 8 without parameter";
	 };
	 System.out.println(s1.say1());
	 
	 Sayable1 s2=(name)->{
		 return "Hello" +name;
	 };
	 System.out.println(s2.say(" Java 8"));
	 
	 Sayable1 s3 = name -> {
		 return "Hello " +name;
	 };
	 System.out.println(s3.say("Java 8"));
 }
}
