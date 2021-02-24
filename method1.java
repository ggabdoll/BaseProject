package base05;

public class method1 {

	public static void main(String[] args) {
		int num1 =6;
		int num2 = 15;
		
		method1 m1 = new method1();
		System.out.println("두 수의 차는:"+ m1.abs(num1,num2));
		

	}

	public int abs(int num1,int num2) {
		
		int a = 0;
		a = num1 - num2;
		
		if(a<0) {
			return a*(-1);
		}
		
		return a;
	}
	
}
