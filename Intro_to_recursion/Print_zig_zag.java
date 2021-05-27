package Intro_to_recursion;

import java.util.Scanner;

public class Print_zig_zag {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		pzz(n);

	}
	
	public static void pzz(int n) {
		if(n==0) {
			return;
		}
		
		System.out.println("Pre" + n);
		pzz(n-1);
		System.out.println("In"+ n);
		pzz(n-1);
		System.out.println("Post"+n );
	}

}
