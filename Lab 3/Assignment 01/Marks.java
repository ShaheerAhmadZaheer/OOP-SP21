public class Marks {
	public int oop;
	public int dsa;
	public int dld;
	private int sum;
	
	public Marks() {
		oop = 80;
		dsa = 80;
		dld = 80;	
	}
	
	public Marks(int a, int b, int c) {
		oop = a;
		dsa = b;
		dld = c;
	}
	
	public int calculateSum(){
		sum = oop + dsa + dld;
		return sum;
	}

}
