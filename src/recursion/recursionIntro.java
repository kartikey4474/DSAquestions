package recursion;

public class recursionIntro {

	static void fun(int n) {
		if(n==0) {
			return ;
		}
	
		System.out.println(n);
		fun(n-1);
		
	}
	
	public static void main(String[] args) {
		recursionIntro obj = new recursionIntro();
		
	obj.fun(10);
	}

}
