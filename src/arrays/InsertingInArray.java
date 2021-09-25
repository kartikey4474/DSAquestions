package arrays;

public class InsertingInArray {

	public static void main(String[] args) {
		int intArray[] = new int[5];
		InsertingInArray obj = new InsertingInArray();
		intArray[0] = 10;
		intArray[1] = 10;
		intArray[2] = 7;
		intArray[3] = 30;
		
		
		obj.insert(intArray, 3, 4, 5, 2);
		
		for(int i = 0; i <intArray.length;i++) {
			System.out.println(intArray[i]);
		}
		
		
		
		
		
	}

	
  public int insert (int intArray[], int x, int n, int cap, int pos) {
	
	if(n==cap)
		return n;
	
	int index = pos-1;
	
		
		for(int i =0;i>=index;i--)
			intArray[i+1] = intArray[i];
		
		intArray[index] = x;
		
		return(n+1);
		
		
		
			
		
		
	}
}
