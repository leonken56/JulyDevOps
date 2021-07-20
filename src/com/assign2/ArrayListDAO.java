import java.util.ArrayList;
import java.util.List;

public class ArrayListDAO implements InterfaceBankDAO {
	ArrayList<Bank> ALLBANKUSER = new ArrayList();

	public ArrayList<Bank> getAllAccounts() {
		// TODO Auto-generated method stub
		return ALLBANKUSER;
	}


	public Bank getAccount(String accountnumber) {
		// TODO Auto-generated method stub
		
		return ALLBANKUSER.get(ALLBANKUSER.indexOf(accountnumber));
	}


	public void updateName(Bank user, String name) {
		// TODO Auto-generated method stub
		user.setCustomername(name);
	}


	public void updateEmail(Bank user, String email) {
		// TODO Auto-generated method stub
		user.setEmail(email);
	}


	public void updatePhoneNumber(Bank user, String PhoneNumber) {
		// TODO Auto-generated method stub
		user.setPhonenumber(PhoneNumber);
	}


	public void deleteAccount(String accountnumber) {
		// TODO Auto-generated method stub
		ALLBANKUSER.remove(ALLBANKUSER.indexOf(accountnumber));
	}

	public void addNewAccount(Bank account) {
		// TODO Auto-generated method stub
		ALLBANKUSER.add(account);
		
	}


	public void deposit(Bank account, double amount) {
		// TODO Auto-generated method stub
		
		if ((amount>=5) &&(amount<=10000))
			account.deposit(amount);
		else System.out.println("Deposit fund must be between $5 - $10000");
			
	}


	public void displayinfo(String name) {
		// TODO Auto-generated method stub
	    for (Bank x : ALLBANKUSER) {
	    	String curName = x.getCustomername();
	        if (curName == name)
	        	x.printinfo();
	      }
		
	}


	public void displaybalance(String accountnumber) {
		// TODO Auto-generated method stub
		Bank curAccount = getAccount(accountnumber);
		double curBalance = curAccount.getBalance();
		System.out.println("This account [" + accountnumber + "] has a balance of: $" + curBalance);
	}

	public void displayall() {
	    for (Bank x : ALLBANKUSER) {
	    	x.printinfo();
	      }
		
	}
}
