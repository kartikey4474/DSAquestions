package arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		int arr[] = {5,6,7,8};
		ReverseAnArray obj = new ReverseAnArray();
		obj.reverse(arr, arr.length);
		
		for(int i = 0; i <arr.length;i++) {
			System.out.print(arr[i]);
		}
		

	}
	
	void reverse(int arr[], int n) {
		int low = 0;
		int high = n-1;
		while(low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
			
		}
		
	}

}
