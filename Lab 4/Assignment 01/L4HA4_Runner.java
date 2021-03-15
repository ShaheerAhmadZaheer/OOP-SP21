public class L4HA1_Runner {

	public static void main(String[] args) {
		HotDogStand s1 = new HotDogStand(1, 0);
		s1.justSold();
		s1.justSold();
		s1.justSold();
		
		s1.display();
		
		HotDogStand s2 = new HotDogStand(2, 4);
		s2.justSold();
		s2.justSold();
		
		s2.display();
		
		HotDogStand s3 = new HotDogStand(3, 1);
		s3.justSold();
		s3.justSold();
		s3.justSold();
		s3.justSold();
		
		s3.display();

	}
}	
