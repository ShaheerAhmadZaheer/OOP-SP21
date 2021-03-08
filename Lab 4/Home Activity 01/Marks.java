package l04hac01;

/**
 *
 * @author cui
 */
public class Marks {
    private int eng;
    private int math;
    private int urdu;
    
    public Marks(){
        eng = 0; math = 0; eng = 0;
        
    }
    
    public Marks(int a, int b, int c){
        eng = a; math = b; urdu = c;
    }
    
    public void setMath(int m){
        math = m;
    }
    
    public void setEng(int e){
        eng = e;
    }
    
    public void setUrdu(int u){
        urdu = u;
    }
    
    public int getMath(){
        return math;
    }
    
    public int getEng(){
        return eng;
    }
    
    public int getUrdu(){
        return urdu;
    }
    
    public void display(){
        System.out.println("Eng: "+eng+", Math: "+math+", Urdu: "+urdu);
    }
}
