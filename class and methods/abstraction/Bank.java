import java.util.Scanner;
abstract class BankAccount{
    private long accountNumber;
    private double balance;
    static double interestRate;
    static double interest;
    abstract void calculateInterest();
    BankAccount(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Account number :");
        accountNumber=sc.nextLong();
        long acc=9876;
        if(accountNumber==acc)
            this.balance=26577.09;
        else
            this.balance=0.00;
    }
    protected void display(){
        System.out.println("Account Number :"+ accountNumber);
        System.out.println("Balance : "+balance);
        System.out.println("Interest : "+interest);
    }
    protected double getBalance(){
        return balance;
    }
}
class SavingsAccount extends BankAccount
{
    SavingsAccount(){
        super();
    }
	public void calculateInterest(){
	    interestRate=0.035;
	    interest=interestRate*getBalance();
	    display();
	}
	
}
class CurrentAccount extends BankAccount{
    CurrentAccount(){
        super();
    }
    public void calculateInterest(){
	    interestRate=0.02;
	    interest=interestRate*getBalance();
	    display();
	}
	
}
public class Bank{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("1 for Savings Account\n2 for Current Account");
        int n=in.nextInt();
        switch(n){
            case 1:
                SavingsAccount s=new SavingsAccount();
                s.calculateInterest();
                break;
            case 2:
                CurrentAccount c=new CurrentAccount();
                c.calculateInterest();
                break;
            default:
                System.out.println("Error occured!!!");
        }
    }
} 