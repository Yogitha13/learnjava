package com.ict.learning.learnjava;

import java.util.Scanner;

public class ReadDataFromUser {

	public static void main(String[] args) {
		System.out.println(" Enter your First Name:-");
		Scanner scanner = new Scanner(System.in);
		String FirstName = scanner.nextLine();
		
		System.out.println(" Enter your Last Name:-");
		Scanner scanner1 = new Scanner(System.in);
		String LastName = scanner1.nextLine();
		
		String FullName = (FirstName+" " +LastName);
		System.out.println(" Hello " + FullName +" Welcome");

	}

}
