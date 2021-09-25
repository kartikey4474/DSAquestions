package sorting;

public class InsertionSort {
	
	
	
	void Insertion (int arr[], int n) {
		for(int i = 0; i<n; i++) {
			int key = arr[i];
			int j = i-1;
			while(j>= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
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
		
		
		InsertionSort obj = new InsertionSort();
		
		obj.Insertion(arr, n);
		obj.printArray(arr, n);
           
	
	
	

	}
	}

