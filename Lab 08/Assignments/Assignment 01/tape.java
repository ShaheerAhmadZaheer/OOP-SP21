public class tape extends publication{
	private int playingTime;
	
	public tape(String t, int p, int d) {
		super(t, p);
		playingTime=d;
	}
	
	public void setPlayingtime(int t) {
		playingTime=t;
	}
	
	public int getPlayingtime() {
		return playingTime;
	}
	
	public void display() {
		super.distplay();
		System.out.println("Playing Time (In minutes): "+playingTime+"\n");
	}

}
