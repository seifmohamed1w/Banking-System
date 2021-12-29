import java.util.Scanner;

public class Account {
	private double balance;
    private int accnum;
    private double previousTransaction;
	
	public Account(double balance, int accnum) {
		this.balance = balance;	
		this.accnum = accnum;
	}
	
//Getters and Setters:
	public double getBalance() {
		return balance;
	}

	public void setAmount(double balance) {
		this.balance = balance;
	}

	public int getAccnum() {
		return accnum;
	}

	public void setAccnum(int accnum) {
		this.accnum = accnum;
	}

//function for depositing money
	public void deposit(double amount) {
		if(amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
		System.out.println(balance);
	}
	
	//function for depositing money
	public void withdraw(double amount) {
		if(amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
		System.out.println(balance);
		
	}
	
	public void getPreviousTransaction() {
		if(previousTransaction > 0) {
			System.out.println("deposited: " + previousTransaction);
		} 
		else if(previousTransaction < 0) {
			System.out.println("withdrawn: " + Math.abs(previousTransaction));
		} 
		else {
			System.out.println("no transaction");
		}
	}
	
	public void calculateIntrest(int years) {
		double intrestRate = 0.185;
		double newBalance  = ( balance* intrestRate* years)+balance;
		System.out.println("the current intrest rate is" + (100*intrestRate)+"%");
		System.out.println("after"+ years+ "years, your balance will be:" + newBalance);
	}
	
	public void showMenu(Bank o) {
		char option = 'x';
		Scanner s = new Scanner(System.in);
		System.out.println("welcome " + o.name);
		System.out.println("your acc number is :" + accnum);
		System.out.println();
		System.out.println("A. check balance");
		System.out.println("b. make a deposit");
		System.out.println("c. withdraw");
		System.out.println("d. view prevoius transaction");
		System.out.println("e. calculate intrest");
		System.out.println("f. exit");
		
		do{
			System.out.println();
			System.out.println("enter an option");
			char option1 = s.next().charAt(0);
			option = Character.toUpperCase(option1);
			System.out.println();

		
		switch(option) {
		//show balance 
		case 'A' :
			System.out.println("==============================");
			System.out.println("balance :" + balance);
			System.out.println("===============================");
			System.out.println();
		
		//add money
		case 'B' :
			System.out.println("enter an amount to deposit: ");
			int amount = s.nextInt();
			deposit(amount);
			System.out.println();
			break;
			
		//withdaw money
		case 'C' :
			System.out.println("enter an amount to withdraw ");
			int amount2 = s.nextInt();
			withdraw(amount2);
			System.out.println();
			break;
			
		case 'D' :
			System.out.println("=========================");
			getPreviousTransaction();
			System.out.println("==========================");
			System.out.println();
			break;
			
		case 'E' :
			System.out.println("enter how many years of intrest");
			int years = s.nextInt();
			calculateIntrest(years);
			break;
			
		case 'F' :
			System.out.println("=====================");
			break;
			
		default:
			System.out.println("error: invalid option. please enter A,B,C,D,E");
			break;
		}
		}
		while(option != 'F');
		System.out.println("thank you");
	}
}
