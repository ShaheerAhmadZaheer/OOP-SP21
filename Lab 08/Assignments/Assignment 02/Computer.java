public class Computer {
	protected int wordsize;
	protected int memorysize;
	protected int storagesize;
	protected double speed;
	
	public Computer() {
		wordsize=64;
		memorysize=4000;
		storagesize=132000;
		speed= 3.0*1000;
	}
	
	public Computer(int w, int m, int s, double sp) {
		wordsize=w;
		memorysize=m;
		storagesize=s;
		speed=sp;
	}
	
	public void display() {
		System.out.println("Word Size (bits): "+wordsize+"\nMemory Size (MBs): "+memorysize+"\nStorage Size (MBs): "+
				storagesize+"\nSpeed (Mhz): "+speed);
	}

}
