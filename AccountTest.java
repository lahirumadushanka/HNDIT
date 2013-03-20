//NEO Enterprises
import java.util.Scanner;
class Account{
	
		String holderName;
		String accountType;
		int accountNumber;
		int currentBalance;
		

	public Account(String h,String a,int b,int c){
		holderName=h;
		accountType=a;
		accountNumber=b;
		currentBalance=c;
	}

			
	void deposit(int c){
		currentBalance=currentBalance+c;
	}

	void withdraw(int d){
		
		if(currentBalance>=d){
			currentBalance=currentBalance-d;
			System.out.println("Your Balance is"+currentBalance);
		}
		else
			System.out.println("Your Balance is Insufficient");
	}

	void dis(){
		System.out.println("Account Holders Name:- "+holderName);
		System.out.println("Your Current Balance is:- "+currentBalance);
	}

	void check(){
		System.out.println("Your Current Balance is:- "+currentBalance);
	}
	
	int exit(){
		return 0;
	}
	
	
}


class AccountTest{
	public static void main(String[] args){
		int x,y,z,k;
		int j=0;
		String v,w;
				
		Scanner Hn=new Scanner(System.in);
		System.out.println("Enter Your Name ");
		v=Hn.nextLine();

		System.out.println("Savings Type ");
		w=Hn.nextLine();

		System.out.println("Account Number ");
		x=Hn.nextInt();
		
		System.out.println("Current Balance ");
		y=Hn.nextInt();
				
		
				
		Account acc1=new Account(v,w,x,y);
		while(j!=5){
			
			System.out.println("1.Withdraw Money 2.Deposit3.Check Balance4. View Details5. Exit");
			z=Hn.nextInt();
			switch(z){
				case 1:
					System.out.println("Please Enter Amount ");
					k=Hn.nextInt();
					acc1.withdraw(k);break;
				case 2:
					System.out.println("Please Enter Amount ");
					k=Hn.nextInt();
					acc1.deposit(k);break;
				case 3:
					acc1.check();break;
				case 4:
					acc1.dis();break;
				case 5:
					System.out.println("~~~End Of The Transaction~~~");
					acc1.exit();j=5;break;
					
				default:
					System.out.println("Invalid Input");
				
			}
		}

	}
}
					
				
				
		
		

		
		