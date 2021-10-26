
package acount_sec1;

import java.util.Date;


public class Account {
    private int id=0;
    private double balance=0.0;
    private double annualInterestRate=0.0;
    private Date dateCreated;
    
     public Account(int id,double balance ) {
        
         this.id=id;
         this.balance=balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
      System.out.println("the AnnualInterestRate is ");
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
     
    public double getMonthlyInterestRate()
    {
    return (annualInterestRate/100)/12;
    }
    
    public double getMonthlyInterest()
    {
    return balance*getMonthlyInterestRate();
    }
    
     public double withdraw(double x)
    {
        return this.balance-=x;
    }
     
     public double deposit(double x)
    {
        return this.balance+=x;
    }
}
