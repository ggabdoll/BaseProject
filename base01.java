package base05;

public class base01 {

	public static void main(String[] args) {
		
		int  n = 15;
		int sum = 0;
		
		for(int i =1; i<=n; i++) {
			int a =1;
			for(int j= 0; j<i; j++) {
		       a += j; 
						
			}
		sum += a;
		}
		
		System.out.println(n + "번째까지의 합:" + sum);

	}

}
