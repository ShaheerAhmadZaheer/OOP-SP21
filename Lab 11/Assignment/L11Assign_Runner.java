
public class L11Assign_Runner {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(12.0, 23.0);
		Circle c = new Circle(5.0);
		Triangle t = new Triangle(10.0, 12.0, 20.0, 7.0);
		
		Shape [] s= {r, c, t};
		
		CalculateAreas areas = new CalculateAreas(s);
		areas.display();
		

	}

}
