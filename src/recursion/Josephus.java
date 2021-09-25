package recursion;

public class Josephus {

	public int Jos(int n, int k) {
		if(n==1) {
			return 0;
		}
		else 
			return (Jos(n-1, k) + k)%n;
	}
	
	
	public static void main(String[] args) {
     Josephus obj = new Josephus();
   System.out.println( obj.Jos(5, 3)); 
	}

}
