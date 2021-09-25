package arrays;

public class maxElementInArray {

	public static void main(String[] args) {
		int i;
		 int intArray[] = {10,34,2,67,4};
		
		 maxElementInArray obj = new maxElementInArray();
		
		
		
		System.out.println(" min element in array is "+intArray[obj.getMin(intArray, 3 ) ]);
		
		
		
		
		 
		 

	}
	public int getMax (int intArray[]) {
		int res =0;
		for(int i =1; i<intArray.length; i++) 
			if(intArray[i] > intArray[res])
				res = i;
					return res;
					
		
			
					
				
			
			
		}
	public int getMin (int intArray[], int k) {
		
		
		
		int res =0;
		
		for(int i =1; i<intArray.length; i++) 
			if(intArray[i] < intArray[res])
				res = i;
		
		
					return res;
		
			
			
			
				
			
			
		}

}
