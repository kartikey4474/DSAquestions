package arrays;

import java.util.Collections;

public class LrotateByD {
	
			void printArray(int arr[], int n)
		    {
		        for (int i = 0; i < n; i++)
		            System.out.print(arr[i] + " ");
		    }
	
	void leftRotateByD(int arr[], int n, int d) {
		
		reverse(arr, 0, d); //reverse elements upto d
		
		reverse(arr, d+1, n-1); // reverse elements from d to last.
		reverse(arr, 0, n-1); // reverse  the whole array
		
	}
	
	void reverse(int arr[], int low, int high) {
		
		while(low<high) {
			arr[low] = (arr[low] + arr[high]) - (arr[high] = arr[low]); // to swap two elements in array (Very important.)
			
			
			low++;
			high--;
			
		}
	}
	
	

	public static void main(String[] args) {
		LrotateByD obj = new LrotateByD();
		int arr[] = {1,2,3,4,5};
				
		int n = arr.length;		
		obj.leftRotateByD(arr, n, 2);		
		obj.printArray(arr, n);
		

	}

	
	
	// TO = O(n)
	// AS = O(1)

}
