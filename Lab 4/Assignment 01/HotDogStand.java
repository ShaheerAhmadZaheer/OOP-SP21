public class HotDogStand {
	private int ID, sold;
	
	public HotDogStand(int x, int y) {
		ID=x;
		sold=y;
	}
	
	public void justSold() {
		sold ++;
	}
	
	public int getSold() {
		return sold;
	}
	
	public int getID() {
		return ID;
	}
	
	public void display() {
		System.out.println("Hot Dog Stand of ID "+ID+" sold "+sold+" hotdogs today!");
	}
}
