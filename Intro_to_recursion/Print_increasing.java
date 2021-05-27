package Intro_to_recursion;

import java.util.Scanner;

public class Print_increasing {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		printincreasing(n);

	}
	public static void printincreasing(int n) {
		
		if(n==0) {
		   return;
		}
		
		printincreasing(n-1);
		System.out.println(n);
		
	}

}
