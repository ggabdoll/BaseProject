package base05;

public class method5 {

	public int[] ascending(int[] inputNumbers) {
		for(int i = 0; i< inputNumbers.length-1; i++) {
			
			for(int j = 0; j < inputNumbers.length-1; j++) {
				int a = inputNumbers[j];
				int b = inputNumbers[j+1];
				
				if(inputNumbers[j]>inputNumbers[j+1]) {
					inputNumbers[j] = b;
					inputNumbers[j+1] = a;
				}
				
			}
		}
		return inputNumbers;
	}
	
	public static void main(String[] args) {

		method5 util = new method5();
		int[] numbers = new int[] {7,5,2,19,34,51,32,11,67,21};
		
		numbers = util.ascending(numbers);
		
		for(int i =0; i<numbers.length; i++) {
			System.out.print(numbers[i]);
			
			if(i!= numbers.length-1) {
				System.out.print(",");
			}else {
				System.out.println("");
			}
		}
		System.out.println("Successfull!!!");
	}

}
