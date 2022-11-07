package com.ict.learning.learnjava;

public class UnderstandingString {

	public static void main(String[] args) {
		
		String FirstName = "Robert";
		String LastName ="Coyote";
		//System.out.println("Name is "+FirstName+""+LastName);
		
		String FullName = FirstName.concat(LastName);
		
	/*	System.out.println("Substring of Full Name :-"+ FullName.substring(6));
		
		System.out.println("Length of Full Name :-"+ FullName.length());
		
		System.out.println("Substring of Full Name first 3 :-"+ FullName.substring(0,3));
		
		System.out.println("Substring of Full Name in Uppercase is :-"+ FullName.toUpperCase());
		
		System.out.println("Substring of Full Name in Lowercase is :-"+ FullName.toLowerCase());
		
		System.out.println(" Full Name :-"+ FirstName.toUpperCase()+" "+LastName.toLowerCase());
		
		System.out.println("Replace LastName to Boyle:- "+FirstName +" "+LastName.replace("Coyote","Boyle"));
		
		System.out.println(LastName);
		
		System.out.println("Compare First name to Full name :" +FullName.compareTo( FirstName ));
		
		System.out.println("Display char 10 in Full Name :- " +FullName.charAt(10));*/
		
		char[] data = {'b','o','y','l','e'};
		System.out.println(LastName);
		LastName =LastName.copyValueOf(data);
		System.out.println(LastName);
		
	   
        String str1 = "Java Exercises";
        //String str2 = new StringBuffer("Java").append(" Exercises").toString();
        String str2 = new String("Java Exercises");
        System.out.println(str2);
        String str3 = str2.intern();
        System.out.println(str3);
        
        //str2=str2.intern();
        /*When this line is executed the str2 moves from heap memory to
                               string pool resulting in line 50 to change from false to true*/
                               
        System.out.println("str1 == str2? " + (str1 == str2));
        System.out.println("str1 == str3? " + (str1 == str3));
		
        StringBuilder stringbuilder = new StringBuilder("Hello");
        System.out.println(stringbuilder.capacity());
        
		
	}

}
