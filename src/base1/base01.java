package base1;

import java.util.Scanner;

public class base01 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("1���� ũ�� 10���� ���� ������ �Է��ϼ���. : ");
		int a = in.nextInt();
		
		
		if(a<2 || a>9) {
			System.out.println("�߸��� ���ڰ� �Է� �Ǿ����ϴ�.");
		} else {
			for(int i = 1; i<10; i++) {
			System.out.println(a+" * "+ i +" = " + a*i);
			}
		}
	}

}
