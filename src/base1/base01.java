package base1;

import java.util.Scanner;

public class base01 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. : ");
		int a = in.nextInt();
		
		
		if(a<2 || a>9) {
			System.out.println("잘못된 숫자가 입력 되었습니다.");
		} else {
			for(int i = 1; i<10; i++) {
			System.out.println(a+" * "+ i +" = " + a*i);
			}
		}
	}

}
