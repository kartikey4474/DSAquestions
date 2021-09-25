package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {

	public static void main(String[] args) {
		
		LeadersInArray obj = new LeadersInArray();
		int arr[] = {5,4,7,2,7,9};
		int n = arr.length;
		ArrayList<Integer> res = new ArrayList<Integer>();
		 res = obj.leaders(arr, n);
		 System.out.println(res);
		

		
	}
	
	
		static ArrayList<Integer> leaders(int arr[], int n){
	        ArrayList<Integer> al = new ArrayList<Integer>();
	        if(n==1){
	            al.add(arr[0]);
	            return al;
	        }
	        al.add(arr[n-1]);
	        int cL = arr[n-1];
	        for(int i = n-2; i>=0; i--){
	            if(cL <= arr[i]){
	                cL = arr[i];
	               al.add(arr[i]);
	            }
	        }
	         Collections.reverse(al);
	        return al;
	        
	    }
	
	
	void printArray(int arr[], int n)
	{
		for(int i = 0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}
}
