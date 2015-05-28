package com.example.generics;

public class SavingAccountDAOImpl implements AccountDAO<SavingAccount>{

	public SavingAccount open(SavingAccount account) {
		account.setStatus('N');
		return account;
	}

	public SavingAccount close(SavingAccount account) {
		account.setStatus('C');
		return account;
	}

}
