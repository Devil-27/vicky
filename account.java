import java.util.Scanner;

class Account
{
	int ac_no;
	//String name = new String();
	double balance;
	int ch;
	int n; 
	

void getdata()
{
	System.out.println("Enter the Account no. : ");
	ac_no = s.nextInt();
	System.out.println("Enter user name : ");
	//name = s.nextLine();
	System.out.println("Enter the Balance Amount");
	balance = s.nextDouble();
}
void display()
{
	System.out.println("Account No. : "+ac_no);
	//System.out.println(" Name : "+name);
	System.out.println("Total Balance : "+balance);
}
void deposit()
{
	System.out.println("Enter the Deposit Ammount ");
	n = s.nextInt();
	balance = balance+n;
	display();
}
void withdraw()
{
	System.out.println("Enter the Withdraw Ammount ");
	n = s.nextInt();
	if(n<balance)
	{
	balance = balance-n;
	display();
	}
	else
	System.out.println("No Sufficient Balance");
}
public static void main()
{
	
	Scanner s = new Scanner(System.in);
	Account a = new Account();

	a.getdata();

	System.out.println("Press 1 to View Balance ");
	System.out.println("Press 2 to  Deposit Money ");
	System.out.println("Press 3 to Withdraw Money ");

	System.out.println("Enter Your choice");
	ch = s.nextInt();

	switch(ch)
{
	case 1:
		a.display();
		break;
	case 2:
		a.deposit();
		break;
	case 3:
		a.withdraw();
		break;
	default:
		System.out.println("You Entered the wronge choice");		
}
}
}