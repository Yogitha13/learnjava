package com.ict.learning.learnjava;

public class ArithematicOperators {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 10;
		int c = a+b;
		/*System.out.println("a+b="+c);//Addition
		c=a-b;
		System.out.println("a-b="+c);//Substraction
		
		System.out.println("a*b="+(a*b));//Multiplication
		
		System.out.println("a/b="+(a/b));//Divivsion
		double d = a%b;
		System.out.println("a%b="+d);//Modulus
		
		System.out.println("--a="+(--a));//PreDecrement of a
		System.out.println("Value of a after Predecrement="+(a));
		System.out.println("Post decrement="+(a--));//postDecrement of a
		System.out.println("Value of a after post decrement="+(a));
		
		System.out.println("++b="+(++b));//Increment of b	
		boolean Test;
		Test = a==b;
		System.out.println("Boolean value="+Test);
		
		
		System.out.println("a="+a);
		int e= a+=6;
		System.out.println("d=a+=6 value is "+e);
		
		
		System.out.println("e="+e);
		int f = e-=2;
		System.out.println("f = e=-2 value is "+f);
		System.out.println("b="+b);
		System.out.println("%= value is "+(b%=3));*/
		
		System.out.println(10 == 15);
		
		int myAge = 25;
		int votingAge = 18;
		System.out.println(myAge >= votingAge);
		System.out.println(myAge <= votingAge);
		
		
		int count = 3;

		System.out.println(!(count > 3)); 
		System.out.println(!(count <= 3));
		System.out.println("value of a & b are "+ a+" "+b);
		System.out.println("&& output is "+(a < 3 && b == 10));
		System.out.println("|| output is "+(a < 3 || b == 10));
	}

}
