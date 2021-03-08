 */
package l04hac02;

/**
 *
 * @author cui
 */
public class L04HAC02Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.setBalance(20000);
        System.out.println("Current Balance in account 1 is:  "+a1.getBalance());
        
        
        Account a2 = new Account (a1.getBalance());
        System.out.println("Current Balance in account 2 is: "+a2.getBalance());
        
        a1.withdraw(10000);
        System.out.println("Current Balance in account 1 is:  "+a1.getBalance());
        System.out.println("Current Balance in account 2 is:  "+a1.getBalance());
    }
    
}
