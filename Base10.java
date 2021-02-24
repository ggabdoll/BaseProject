package BaseProject.src;

public class Base10 {

	public static void main(String[] args) {
		 int largest = 0;
		 int smallest = 10000;
		 int sum = 0;
		 double average = 0.0;
		 
		 int[] array = new int[args.length];
		 
		 for(int i =0; i<array.length;i++) {
			array[i] = Integer.parseInt(args[i]);
			System.out.println(array[i]+",");
			 sum += array[i];
		 }
		 for(int j =0; j<array.length;j++) {
			
				 if(smallest> array[j]) {
					 smallest = array[j];
					 if(largest < array[j])
						 largest = array[j];
				 }
			 
		 average = sum/(double)array.length;
		 }
		 
		 
		 
		 System.out.println("the largest value = "+ largest);
		 System.out.println("the smallest value = "+ smallest);
         System.out.println("and the average is = " + average);
	}

}
