package Intro_to_recursion;

import java.util.Scanner;

public class Print_increasing_decreasing {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		pdi(n);

	}
	
	public static void pdi(int n) {

		printdecreasing(n);
		printincreasing(n);
          
		
	}
	
	public static void printdecreasing(int n) {
		if(n==0) {
			return ;
		}
		System.out.println(n);
		printdecreasing(n-1);
	}
	
	public static void printincreasing(int n) {
		
		if(n==0) {
			return;
		}
		
		printincreasing(n-1);
		System.out.println(n);
		
	}

}
