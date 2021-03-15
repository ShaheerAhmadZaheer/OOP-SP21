public class L5HA1_Runner {

	public static void main(String[] args) {
		Distance d1 = new Distance();
		Distance d2 = new Distance(4,12);
		Distance d3 = d1.add(d2);
		
		d3.display();
		

	}

}
