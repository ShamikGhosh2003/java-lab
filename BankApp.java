import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

abstract class Account{
	private long accNo;
	private String accountType;

	Account(long accNo,String accountType)
	{
		this.accNo=accNo;
		this.accountType=accountType;
	}

	public long getAccNo()
	{
		return accNo;
	}

	public String getAccountType()
	{
		return accountType;
	}

	abstract double calculateInterest();

	public void display()
	{
		System.out.println("Account No: "+accNo+" has interest: "+calculateInterest());
	}
}

class SavingsAccount extends Account
{
	private double balnance;
	private static final double interest_rate=0.038; //3.8%
	
	SavingsAccount(long accNo, double balnance)
	{
		super(accNo,"Savings");
		this.balnance=balnance;
	}

	@Override
	public double calculateInterest()
	{
		return balnance*interest_rate;
	}
}

class CurrentAccount extends Account
{
	private double overdraftAmount;
	private static final double interest_rate=0.018; //1.8%
	
	CurrentAccount(long accNo, double overdraftAmount)
	{
		super(accNo,"Current");
		this.overdraftAmount=overdraftAmount;
	}

	@Override
	public double calculateInterest()
	{
		return overdraftAmount*interest_rate;
	}

	public void displayOverdraftAmount()
	{
		System.out.println("Overdraft amount: "+overdraftAmount);
	}
}

class Bank{
	private List<Account> accounts = new ArrayList<>();

	public void addAccount(Account acc)
	{
		accounts.add(acc);
		System.out.println(acc.getAccountType()+" Account added: "+acc.getAccNo());
	}

	public boolean verifyAccount(long accNo)
	{
		for(Account acc: accounts)
			if(acc.getAccNo()==accNo)
				return true;
		return false;
	}

	public void displayAllAccounts()
	{
		if(accounts.isEmpty())
		{
			System.out.println("No accounts present");
			return;
		}
		for(Account acc: accounts){
			acc.display();
			if(acc instanceof CurrentAccount)
				((CurrentAccount)acc).displayOverdraftAmount();
		}
	}
}

public class BankApp
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank ob = new Bank();
		int ch;
		long accno;
		double bal;
		do
		{
			accno=0;bal=0.0;
			System.out.println("\n------------------MENU------------------");
			System.out.println("1. Add Savings Account.");
			System.out.println("2. Add Current Account");
			System.out.println("3. Verify Account");
			System.out.println("4. Display all accounts.");
			System.out.println("0. Exit.");
			System.out.print("Enter your choice: ");
			ch=sc.nextInt();

			switch(ch)
			{
				case 1:
					System.out.print("\nEnter account number: ");
					accno = sc.nextLong();
					System.out.print("\nEnter balance: ");
					bal = sc.nextDouble();
					ob.addAccount(new SavingsAccount(accno,bal));
				    break;
				case 2:
					System.out.print("\nEnter account number: ");
					accno = sc.nextLong();
					System.out.print("\nEnter balance: ");
					bal = sc.nextDouble();
					ob.addAccount(new CurrentAccount(accno,bal));
				    break;
				case 3:
					System.out.print("\nEnter account number: ");
					accno = sc.nextLong();
					boolean isPresent = ob.verifyAccount(accno);
					if(!isPresent)
						System.out.println("\nAccount does not exist");
					break;
				case 4:
					System.out.println("Displaying all accounts: ");
					ob.displayAllAccounts();
					break;
				case 0:
					break;
				default:
					System.out.println("Invalid Option!");
					break;

			}
			
		}while(ch!=0);
		sc.close();
	}
}
