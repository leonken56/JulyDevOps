package com.assign2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDAO implements InterfaceBankDAO {
	ArrayList<Bank> ALLBANKUSER = new ArrayList();
	@Override
	public ArrayList<Bank> getAllAccounts() {
		// TODO Auto-generated method stub
		return ALLBANKUSER;
	}

	@Override
	public Bank getAccount(String accountnumber) {
		// TODO Auto-generated method stub
		
		return ALLBANKUSER.get(ALLBANKUSER.indexOf(accountnumber));
	}

	@Override
	public void updateName(Bank user, String name) {
		// TODO Auto-generated method stub
		user.setCustomername(name);
	}

	@Override
	public void updateEmail(Bank user, String email) {
		// TODO Auto-generated method stub
		user.setEmail(email);
	}

	@Override
	public void updatePhoneNumber(Bank user, String PhoneNumber) {
		// TODO Auto-generated method stub
		user.setPhonenumber(PhoneNumber);
	}

	@Override
	public void deleteAccount(String accountnumber) {
		// TODO Auto-generated method stub
		ALLBANKUSER.remove(ALLBANKUSER.indexOf(accountnumber));
	}

	@Override
	public void addNewAccount(Bank account) {
		// TODO Auto-generated method stub
		ALLBANKUSER.add(account);
		
	}

	@Override
	public void deposit(Bank account, double amount) {
		// TODO Auto-generated method stub
		
		if ((amount>=5) &&(amount<=10000))
			account.deposit(amount);
		else System.out.println("Deposit fund must be between $5 - $10000");
			
	}

	@Override
	public void displayinfo(String name) {
		// TODO Auto-generated method stub
	    for (Bank x : ALLBANKUSER) {
	    	String curName = x.getCustomername();
	        if (curName == name)
	        	x.printinfo();
	      }
		
	}

	@Override
	public void displaybalance(String accountnumber) {
		// TODO Auto-generated method stub
		Bank curAccount = getAccount(accountnumber);
		double curBalance = curAccount.getBalance();
		System.out.println("This account [" + accountnumber + "] has a balance of: $" + curBalance);
	}

}
