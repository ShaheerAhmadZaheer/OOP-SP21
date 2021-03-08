public class Time {
	public int hr;
	public int min;
	public int sec;
	
	public Time() {
		hr = 12;
		min = 00;
		sec = 00;
	}
	
	public Time(int a, int b, int c) {
		if (a >= 24) {
			while (a >= 24) {
				a = a -24;
			}
		}
		
		if (b >= 60) {
			while (b>=60) {
				b = b-60;
				a++;		
			}
		}
		
		if (c >= 60) {
			while (c>=60) {
				c = c-60;
				b++;
			}
		}
		
		hr = a;
		min = b; 
		sec = c;
		
	}
	
	public void display() {
		System.out.println("TIME IS: "+hr+":"+min+":"+sec);
	}

}
