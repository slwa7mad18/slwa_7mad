
package acount_sec1;


public class Acount_sec1 {

    public static void main(String[] args) {
        
        Account m=new Account(1122,20000);
       
        
        m.setAnnualInterestRate(4.5);
        
        System.out.println("new1 balance is "+m.withdraw(2500.0));
        System.out.println("new2 balance is "+m.deposit(3000.0));
        System.out.println("the balance is "+m.getBalance());
        System.out.println("new MonthlyInterest is "+m.getMonthlyInterest());
        System.out.println("the date created is "+m.getDateCreated());
        
    }
    
}
