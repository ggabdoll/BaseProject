package base1;

import java.util.Scanner;

public class base03 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("1���� ũ�� 10���� ���� ������ �Է��ϼ��� : ");
		
		int inputInt = keyboard.nextInt();
		//�Ʒ��� �����ϼ���
		if(inputInt <2 || inputInt >9) {
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
		}
		int factorial = 1;
		for(int i = 1; i<= inputInt; i++) {
			factorial *= i;
			System.out.println(i+ " ! = "+ factorial);
		}
	}

}
