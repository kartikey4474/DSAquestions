package arrays;

public class leftRotate {
	
	void leftRotatebyOne(int arr[], int n)
    {
		// modified into right rotate by one
        int i, temp;
        temp = arr[n-1];
        for (i = n - 1; i >0; i--)
            arr[i] = arr[i - 1];
        arr[0] = temp;
    }
	
	
	void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
	
	
	
	

	public static void main(String[] args) {
		leftRotate obj = new leftRotate();
		int arr[] = {1,2,3,4,5};
				
		int n = arr.length;		
		obj.leftRotatebyOne(arr, n);		
		obj.printArray(arr, n);
		

	}
	


}
