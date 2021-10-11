package com.greatlearning.lab.question1;

import java.util.Scanner;

public class BalancedBracketDriver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BalancedBracket balancedbracket = new BalancedBracket();
		
		System.out.println("Enter the input");
		String data = sc.nextLine();
		boolean result = balancedbracket.isBalanced(data);
		
		if(result == true)
		    System.out.println("Your input has balanced bracket");
		else
			System.out.println("Your input has not balanced bracket");
		
		
		sc.close();
	}

}
