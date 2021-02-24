package base05;

import java.util.Scanner;

public class method6 {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("input         = ");
		
		method6 util = new method6();
		System.out.print("Result = " + util.factorial(keyboard.nextInt()));

	}
	
	public int factorial(int n) {
	
		 if(n==1) {
			 return n;
					 }
		 return n = n* factorial(n-1);
	}

}
