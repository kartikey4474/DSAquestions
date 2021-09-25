package arrays;

import java.util.ArrayList;
import java.util.Scanner;


public class SearchingInArray {

	public static void main(String[] args) {
		
	
		int intArray[] = {1,2,3,4,5};
		
		SearchingInArray obj = new SearchingInArray();
		
		
		
		System.out.println(obj.search(intArray, 4, 5));
		
		
		
	
		
 
	}
	// x = element that we need to search
	//n = total no. of elements in array.
	
	public int search (int intArray[], int x, int n) {
		
		for(int i =0;i<n;i++)
		
			if(intArray[i]==x) 				
				return i;
		
		return -1;
		
		
			
		
		
	}
	
	

}
