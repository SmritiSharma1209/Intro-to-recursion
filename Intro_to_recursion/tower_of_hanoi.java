package Intro_to_recursion;

import java.util.Scanner;

public class tower_of_hanoi {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int tl1d=s.nextInt();        //source
		int tl2d=s.nextInt();        //destination
		int tl3d=s.nextInt();        //helper
		toh(n, tl1d, tl2d, tl3d);
	}
	
	public static void toh(int n, int tl1d, int tl2d, int tl3d) {
		if(n==0) {
			return;
		}
		
		
		toh(n-1, tl1d, tl3d,tl2d);
		System.out.println(n + " [ " + tl1d + "->" + tl2d+ "]"  );
		toh(n-1,tl3d,tl2d,tl1d);
		
	}

}
