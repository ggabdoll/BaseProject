package modling1;

import java.util.Scanner;
import modling1.Rectangle;

public class TestRectangle {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	
	Rectangle rec1 = new Rectangle();
	System.out.println("ù��° ���簢���� ����");
	rec1.setColor(keyboard.next());
	
	System.out.println("ù��° ���簢���� ����");
	rec1.setWidth(keyboard.nextInt());
	
	System.out.println("ù��° ���簢���� ����");
	rec1.setLegth(keyboard.nextInt());
	
	Rectangle rec2 = new Rectangle();
	System.out.println("�ι�° ���簢���� ����");
	rec2.setColor(keyboard.next());
	
	System.out.println("�ι�° ���簢���� ����");
	rec2.setWidth(keyboard.nextInt());
	
	System.out.println("�ι�° ���簢���� ����");
	rec2.setLegth(keyboard.nextInt());
	
    System.out.println(rec1.getColor()+ "���簢���� ���̴�" + rec1.area() + "�̰� �ѷ���"+
                       rec1.perimiter()+"�Դϴ�.");
    
    System.out.println(rec2.getColor()+ "���簢���� ���̴�" + rec2.area() + "�̰� �ѷ���"+
            rec2.perimiter()+"�Դϴ�.");
    
    if(rec1.area()>rec2.area()) {
    	System.out.println("���̴� " + rec1.getColor() + "���簢���� �� Ů�ϴ�.");
    }else if(rec1.area()<rec2.area()) {
    	System.out.println("���̴� " + rec1.getColor() + "���簢���� �� Ů�ϴ�.");
    }else {
    	System.out.println("�� �簢���� ���̴� �����ϴ�.");
    }
    if(rec1.perimiter()>rec2.perimiter()) {
    	System.out.println("�ѷ��� " + rec1.getColor() + "���簢���� �� Ů�ϴ�.");
    }else if(rec1.perimiter()<rec2.perimiter()) {
    	System.out.println("�ѷ��� " + rec1.getColor() + "���簢���� �� Ů�ϴ�.");
    }else {
    	System.out.println("�� �簢���� �ѷ��� �����ϴ�.");
    }
    

	}

}
