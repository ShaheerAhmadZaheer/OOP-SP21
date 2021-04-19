
public class book extends publication{
	private int pageCount;
	
	public book(String t, int p, int c) {
		super(t, p);
		pageCount= c;
	}
	
	public void setPageCount(int i) {
		pageCount=i;
	}
	
	public int getPageCount() {
		return pageCount;
	}
	
	public void display() {
		super.distplay();
		System.out.println("Page Count: "+pageCount+"\n");
	}

}
