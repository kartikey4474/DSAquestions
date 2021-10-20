package arrays;

import recursion.recursionIntro;

public class ArrayIsSorted {

	public static void main(String[] args) {
		int arr[] = {5,99,7,8};
		ArrayIsSorted obj = new ArrayIsSorted();
		
		System.out.println(obj.Insorted(arr));
		

	}
	
	boolean Insorted(int arr[]) {
		for(int i = 1; i < arr.length; i++)
			if(arr[i] < arr[i-1])
				return false;
		return true;
		
	
			
		
		
	}


}
