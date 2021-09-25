package sorting;

public class MergeSort {

	void Merge(int a[], int b[], int m , int n) {
		int i =0;
		int j =0;
		while(i<m && j<n) {
			if(a[i] <= b[j]) {
				System.out.println(a[i]); i++;
			}
			else {
				System.out.println(b[j]); j++;
			}
		}
		
		while(i<m) {
			System.out.println(a[i]); i++;
			
		}
		while(j<n) {
			System.out.println(b[j]); j++;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,0,0,0};
		int b[] = {2,5,6};
		int n = a.length;
		int m = b.length;
		MergeSort obj = new MergeSort();
		
		obj.Merge(a,b,m,n);
		


	}

}


