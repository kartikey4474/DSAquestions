package Searching;

public class firstOcc {
	
	int lastOcc(int arr[], int n, int x) {
		int low = 0,  high = n-1;
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(arr[mid] > x)
				high = mid-1;
			else if (arr[mid] < x)
				low = mid +1;
			else {
				if(mid != n-1 || arr[mid] != arr[mid+1])
					return mid;
				else 
					high = mid + 1;
			}
			
		}
		return -1;
	}
	
	
	

	
	
	int firstOcc(int arr[], int n, int x) {
		int low = 0,  high = n-1;
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(arr[mid] > x)
				high = mid-1;
			else if (arr[mid] < x)
				low = mid +1;
			else {
				if(mid == 0 || arr[mid-1] != arr[mid])
					return mid;
				else 
					high = mid -1;
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {10, 20, 40,40,50,50,70};
		int n = arr.length;
		 firstOcc  obj = new  firstOcc ();
		
		System.out.println(obj.firstOcc(arr, n, 50));
		System.out.println(obj.lastOcc(arr, n, 50));
	}

}
