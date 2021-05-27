package Intro_to_recursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int fact=factorial(n);
		System.out.println(fact);

	}
	
	public static int factorial(int n) {
		int val=1;
		
		if(n==1) {
			return 1;
		}
		
		val= n *factorial(n-1);
		return val;
		
	}

	 
}
