
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class interest_rate{
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    	
    	 Scanner sc=new Scanner(System.in);
    	 int id;
    	    double balance;
    	    double interestRate;
    	    
    	    id=sc.nextInt();
    	   balance=sc.nextDouble();
    	   interestRate=sc.nextDouble();
    	   
    	   Account a=new Account(id,balance,interestRate);
    	   
    	   int years=sc.nextInt();
    	   double result=calculateInterest(a,years);
    	   System.out.print(String.format("%.3f",result));
    	
    }
    
    public static double calculateInterest(Account a, int years)
    {
       double res= a.balance + (a.interestRate + (a.interestRate/100*years));
       return res;
        
    }
}

class Account
{
    int id;
    double balance;
    double interestRate;
    
    
	public Account(int id, double balance, double interestRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.interestRate = interestRate;
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
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
    
}
