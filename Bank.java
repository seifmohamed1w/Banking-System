import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank {
	static String name;
	private static List<Account> a = new ArrayList<>(); 

	public Bank(String name) {
		this.name = name;
	}
	
	public void addAccount(Account account) {
		a.add(account);
		System.out.println("account has been added sucssesfully");
	}
	
	public static void removeAccount(int accnum) {
		for(int i = 0; i<a.size();i++) {
			if(a.get(i).getAccnum() == accnum) {
				a.remove(i);
			}			
		}
		System.out.println("account removed");
		
	}
	
	public static void showAcc() {
		for(Account account: a) {
			System.out.println("\nthe account number"+": " + account.getAccnum());
		}		
	  }
	

	}

