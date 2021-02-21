package base1;

import java.util.Scanner;

public class base03 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요 : ");
		
		int inputInt = keyboard.nextInt();
		//아래에 구현하세요
		if(inputInt <2 || inputInt >9) {
			System.out.println("잘못된 순자가 입력되었습니다.");
		}
		int factorial = 1;
		for(int i = 1; i<= inputInt; i++) {
			factorial *= i;
			System.out.println(i+ " ! = "+ factorial);
		}
	}

}
