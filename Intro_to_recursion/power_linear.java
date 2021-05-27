package Intro_to_recursion;

import java.util.Scanner;

public class power_linear {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int x=s.nextInt();
		
		int ans= power(n,x);
		System.out.println(ans);
		

	}
	
	public static int power(int n, int x) {
		
		int val=1;
		if(x==0) {
			return 1;
		}
		val=n*power(n,x-1);
		return val;
	}

}
