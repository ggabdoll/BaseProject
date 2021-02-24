package base05;

public class base6 {

	public static void main(String args[]) {
         
		int[] array= {3,24,1,55,17,43,5};
		
		for(int i =0; i<array.length-1; i++) {
			for(int j =0; j<array.length-1; j++) {
				
				int a = array[j];
				int b = array[j+1];
				
				if(array[j]>array[j+1]) {
					array[j]=b;
					array[j+1]=a;
				}
			}
		}
		
		for(int i =0; i<array.length;i++) {
			System.out.print(array[i] + ",");
		}
		
		
	}

}
