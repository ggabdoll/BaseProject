package base1;

import java.util.Scanner;

public class base04 {

	public static void main(String[] args) {
		
		int number = 0;
		int count = 0;
		int sum = 0;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ���. ");
		number = keyboard.nextInt();
		
		/*���⿡ ���α׷��� �ϼ��Ͻʽÿ�*/
		
		for(int i = number; i<1001; i++) {
			if(i%number == 0) { 
				
				count ++;
				sum += i;
	
		
		}
	}
		
		System.out.println(number + "�� ��� ���� ="+ count);
		System.out.println(number + "�� ��� �� =" + sum);

	}

}
