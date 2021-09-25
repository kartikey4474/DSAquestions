package sorting;

public class SelectionSort {
	

	void SelecSort(int arr[], int n ) {
		for(int i =0; i<n-1; i++) {
			int min_ind = i;
			for(int j = i+1; j<n; j++) {
				if(arr[j] <  arr[min_ind]) 
					min_ind = j;
					swap(arr, arr[min_ind], arr[i]);
					
				
			}
		}
	}
	void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
	

	public static void main(String[] args) {
		int arr[] = {5,3,2,1,4};
		int n = arr.length;
		
		
		SelectionSort obj = new SelectionSort();
		
		obj.SelecSort(arr, n);
		obj.printArray(arr, n);
           
	
	}
	public static void swap(int[] arr, int i, int j) {
		if(i==j) {
			return;
			
		}
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}




	}


