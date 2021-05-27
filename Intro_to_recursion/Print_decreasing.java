package Intro_to_recursion;
import java.util.Scanner;

public class Print_decreasing {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		printdecreasing(n);
	}
	
	public static void printdecreasing(int n) {
		
		if(n==0) {
			return ;
		}
		
		System.out.println(n);
		printdecreasing(n-1);
		
	}

}
