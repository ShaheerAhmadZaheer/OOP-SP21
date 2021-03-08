public class L3HA1Runner {

	public static void main(String[] args) {
		Marks m1 = new Marks();
		System.out.println("Sum of the marks is "+m1.calculateSum());
		
		Marks m2 = new Marks(84,72,76);
		System.out.println("Sum of the marks is "+m2.calculateSum());

	}

}
