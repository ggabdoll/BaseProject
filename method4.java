package base05;

public class method4 {

	public static void main(String[] args) {
       int month = Integer.parseInt(args[0]);
       new method4().printSeason(month);
	}
    
	public void printSeason(int month) {
		
		String season = "��";
		
		switch(month) {
		case 3:
		case 4:
		case 5:
		   break;
		case 6:
		case 7:
		case 8:
			season = "����";
			break;
		case 9:
		case 10:
		case 11:
			season = "����";
			break;
		case 12:
		case 1:
		case 2:
			season = "�ܿ�";
			break;
		default:
			System.out.println("1~12 ������ ���ڸ� �Է��ϼž� �մϴ�.");
			return;
		}
		System.out.println(season + "�� �¾�̳׿�!");
	}
}
