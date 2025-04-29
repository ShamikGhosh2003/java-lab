import java.util.Scanner;
class BankAcct
{
	long accnumber;
	double balance, interest_rate;
    
	BankAcct()
	{
		accnumber=0;
		balance=0.0;
		interest_rate=0.0;
	}
	/*BankAcct(long acc_num, double bal, double rate)
	{
		accnumber=acc_num;
		balance=bal;
		interest_rate=rate;
	}*/
	public void initialize(Scanner sc)
	{
		System.out.println("Enter the account Number: ");
		accnumber = sc.nextLong();
		System.out.println("Enter the Inital Balance: ");
		balance = sc.nextDouble();
		System.out.println("Enter the interest rate: ");
		interest_rate = sc.nextDouble();
	}
	public void change_interest(Scanner sc)
	{
        System.out.println("Enter the updated interest rate: ");
		interest_rate = sc.nextDouble();
	}
	public double get_interest_rate()
	{
		return interest_rate;
	}
	public double get_balance()
	{
		return balance;
	}
	public double interest(Scanner sc)
	{
		double time;
        System.out.println("Enter the time (in years): ");
		time = sc.nextDouble();
		return (balance*interest_rate*time)/100;
    }
	public static void main(String args[])
	{
		int ch;
		Scanner sc = new Scanner(System.in);
		BankAcct obj = new BankAcct();
		do{
            System.out.println("--------------------MENU--------------------");
		    System.out.println("1. Initialize. \n2. Change interest_rate. \n3. Display Interest Rate \n4. Get Balance \n5. Get Interest \n0. Exit");
            System.out.println("Enter your choice: ");
			ch = sc.nextInt();
			switch(ch)
			{
				case 0:
					break;
				case 1:
					obj.initialize(sc);
					break;
				case 2:
					obj.change_interest(sc);
					break;
				case 3:
					System.out.println("Current Interest Rate: "+obj.get_interest_rate());
					break;
				case 4:
					System.out.println("Current Balance: "+obj.get_balance());
					break;
				case 5:
					double interest=obj.interest(sc);
					System.out.println("Interest: "+interest);
					System.out.println("Balance with interest: "+(interest+obj.get_balance()));
					break;
				default:
					System.out.println("Wrong Option!");
					break;
			}
		}while(ch!=0);
		sc.close();
	}	
}
