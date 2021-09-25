package arrays;

public class MoveZeroesToEnd {

	public static void main(String[] args) {
		int intArray[] = new int[5];
		MoveZeroesToEnd obj = new MoveZeroesToEnd();
		intArray[0] = 10;
		intArray[1] = 0 ;
		intArray[2] = 7;
		intArray[3] = 0;
	
		
		int n = intArray.length;
		
		obj.moveZeroes(intArray, n);
		
		for(int i = 0; i <intArray.length;i++) {
			System.out.println(intArray[i]);
		}
		
		
		
		
		
	}
	
	void moveZeroes(int intArray[], int n) {
		int count =  0;
		
		for(int i =0; i<n; i++) {
			if(intArray[i] != 0) {
				 intArray[count++]=intArray[i]; 
				 while (count < n)
			            intArray[count++] = 0;
			    }
				
			}
		}
	}
	

	


