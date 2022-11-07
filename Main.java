package Davis;
import java.util.*;

class Account{
	public String accountOwner,accountNumber;
	public double balance;
	
}

class Savings extends Account{
	
	int period;
	int rate;
	double interest;
	
	Savings(int period, int rate, double interest) {
		this.period=period;
		this.rate=rate;
		this.interest=interest;
		
	}
	
	public String toString() {
		return period+""+rate+""+interest;
	}

	Scanner z = new Scanner(System.in);
	public void record() {
		System.out.print("please Enter the account number: ");
		accountNumber=z.nextLine();
		System.out.print("please Enter Account Owner :");
		accountOwner=z.nextLine();
		System.out.print("please Enter the balance: ");
		balance=z.nextDouble();
	}
	
	public void interst() {
		
		System.out.print("Dear customer "+accountOwner+"Enter your period in years:  ");
		period=z.nextInt();
		System.out.print("please Enter your rate %: ");
		rate=z.nextInt();
		interest=(balance*rate*period)/100;
		
		System.out.println("Our customer "+accountOwner+"Your interest is: "+interest+" in "+period+" Year(s)");
	}
}

public class Main {

	public static void main(String[] args) {
		Savings ni = new Savings(0, 0, 0);
		ni.record();
		ni.interst();

	}

}

