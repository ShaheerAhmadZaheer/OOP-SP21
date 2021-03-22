public class Fraction {
	private int ratio;
	private int nuem;
	private int deno;
	
	public Fraction() {
		nuem = 24;
		deno = 12;
		ratio = nuem/deno;
	}
	
	public Fraction(int x, int y) {
		nuem = x;
		deno = y;
		ratio = nuem/deno;
	}
	
	public void setNuem(int x) {
		nuem = x;
	}
	
	public void setDeno(int y) {
		deno = y;
	}
	
	public int getRatio() {
		return ratio;
	}
	
	public boolean equals(Fraction f) {
		if (this.ratio==f.ratio) {
			return true;
		}
		else return false;
	}
	
}
