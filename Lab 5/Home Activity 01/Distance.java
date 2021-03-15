public class Distance {
	private int feet, inches;
	
	public Distance() {
		feet=5;
		inches = 5;
	}
	
	public Distance(int a, int b) {
		feet = a;
		inches = b;
	}
	
	public void setFeet(int x) {
		feet=x;
	}
	
	public void setInches(int y) {
		inches=y;
	}
	
	public int getFeet() {
		return feet;
	}
	
	public int getInches() {
		return inches;
	}
	
	public Distance add(Distance a) {
		Distance d_new= new Distance(feet+a.feet, inches+a.inches);
		return d_new;
	}
	
	public void display() {
		System.out.println("Feet = "+feet+", Inches = "+inches);
	}

}
