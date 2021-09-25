package recursion;

public class TowerOfHanoi {
	
	static void TOH(int n , char from_rod,
            char to_rod, char aux_rod)
	{
		if(n==1) {
			System.out.println("move 1 from "+ from_rod+ "to" + aux_rod);
			return;
		}
		
		TOH(n-1,  from_rod,  to_rod,  aux_rod);
		System.out.println("move" + n + "from" + from_rod + "to" + to_rod);
		TOH(n-1,  from_rod,
                 to_rod,  aux_rod);
	}

	public static void main(String[] args) {
		TowerOfHanoi obj = new TowerOfHanoi();
		
		 obj.TOH(3,'A','B','C');
	}

}
