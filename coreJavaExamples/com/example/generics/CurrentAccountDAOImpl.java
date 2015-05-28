package com.example.generics;

public class CurrentAccountDAOImpl implements AccountDAO<CurrentAccount>{

	public CurrentAccount open(CurrentAccount account) {
		account.setStatus('N');
		return account;
	}

	public CurrentAccount close(CurrentAccount account) {
		account.setStatus('C');
		return account;
	}

}
