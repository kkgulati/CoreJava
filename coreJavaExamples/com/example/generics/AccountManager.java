package com.example.generics;

public class AccountManager {
	
	public static void main(String[] args) {
		
		SavingAccount savingAccount=new SavingAccount();
		CurrentAccount currentAccount=new CurrentAccount();
		
		/*
		
		
		SavingAccountDAOImpl savingAccountDAOImpl=new SavingAccountDAOImpl();
		System.out.println(savingAccountDAOImpl.open(savingAccount));
		System.out.println(savingAccountDAOImpl.close(savingAccount));
		
		
		
		CurrentAccountDAOImpl currentAccountDAOImpl=new CurrentAccountDAOImpl();
		
		System.out.println(currentAccountDAOImpl.open(currentAccount));
		System.out.println(currentAccountDAOImpl.close(currentAccount));
		*/
		 
		
		Account account=new Account();
		
		AccountDAOImpl<Account,String> accountDAOImpl1=new AccountDAOImpl<Account,String>();
		System.out.println(accountDAOImpl1.open(account));
		System.out.println(accountDAOImpl1.close(account));
		accountDAOImpl1.display("New Account is created");
		
		AccountDAOImpl<SavingAccount,String> accountDAOImpl2=new AccountDAOImpl<SavingAccount,String>();
		System.out.println(accountDAOImpl2.open(savingAccount));
		System.out.println(accountDAOImpl2.close(savingAccount));
		accountDAOImpl2.display("New Account is created");
		
		AccountDAOImpl<CurrentAccount,String> accountDAOImpl3=new AccountDAOImpl<CurrentAccount,String>();
		System.out.println(accountDAOImpl3.open(currentAccount));
		System.out.println(accountDAOImpl3.close(currentAccount));
		accountDAOImpl3.display("New Account is created");
	
	}

}
