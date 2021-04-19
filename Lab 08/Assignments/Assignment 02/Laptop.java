public class Laptop extends Computer {
	private double length;
	private double width;
	private double height;
	private double weight;
	
	public Laptop() {
		super();
		length=14;
		width=8;
		height=8.5;
		weight=2500;
	}
	
	public Laptop(int w, int m, int s, double sp, double l,double wid,double h,double wei ) {
		super(w, m, s, sp);
		length=l;
		width=wid;
		height=h;
		weight=wei;
	}
	
	public void display() {
		super.display();
		System.out.println("Length (inches): "+length+"\nWidth (inches): "+width+"\nHeight (inches): "+
				height+"\nWeight (Grams): "+weight+"\n");
	}
	
	

}
