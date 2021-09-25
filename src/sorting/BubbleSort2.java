package sorting;

public class BubbleSort2 {

	void BubbleSort(int arr[], int n) {
		boolean swapped = false;
		for(int i = 0; i<n-1; i++) {
			for(int j =0; j <  n-i-1; j++) {
				if(arr[j] > arr[j+1])
					swap(arr,j, j+1);
				swapped = true;
			}
		
		if(swapped == false) {
			break;
		}
	}
}
	public static void swap (int[] array, int i, int j) { //this method will check two numbers in an array if greater then it will swap the numbers.
		if(i == j) {
			return;
		}
		
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
		
		
	}
	void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
	
	public static void main(String[] args) {
		
		int arr[] = {5,3,2,1,4};
		int n = arr.length;
		BubbleSort2 obj = new BubbleSort2();
		obj.BubbleSort(arr, n);
		obj.printArray(arr, n);
		

	}

}

// time complexity = 0(n^2)
