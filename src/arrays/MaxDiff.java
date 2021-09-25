package arrays;

public class MaxDiff {

	void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
	
  int maxDifference(int arr[], int n) {
		//write ur code here
	  
	  int res = arr[0] - arr[1];
	  int minValue = arr[0];
	  
	  for(int j = 0; j<n; j++) {
	 res =  Math.max(res, arr[j]-minValue);
	 minValue = Math.min(minValue, arr[j]);
		 
	  }
	  
	  return res;
	  
		
		
	}
	public static void main(String[] args) {
		MaxDiff obj = new MaxDiff();
		int arr[] = {1,2,3,4,5};
				
		int n = arr.length;
		
		System.out.println(obj.maxDifference(arr, n));
	}

}
