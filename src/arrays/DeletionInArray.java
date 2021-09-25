package arrays;

public class DeletionInArray {

	public static void main(String[] args) {
      int intArray[] = {1,2,3,4,5};
		
      DeletionInArray obj = new DeletionInArray();
		
		
		
		obj.delete(intArray, 2, 5);
		for(int i = 0; i <intArray.length;i++) {
			System.out.println(intArray[i]);
		}
		

	}
	public int delete (int intArray[], int x, int n ) {
		int i;
		for( i = 0;i<n;i++)
			if(intArray[i]==x)
				break;
		
		if(i==n)
			return n;
		
	
			
			for(int j =i;j<n-1;j++)
				intArray[j] = intArray[j+1];
			
			
			
			return(n-1);
			
			
			
				
			
			
		}

}
