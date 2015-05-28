package com.example.generics;

public class AccountDAOImpl<T extends Account,A> implements AccountDAO<T> {

	public void display(A info) {
		System.out.println(info);
	}
	
	public T open(T account) {
		account.setStatus('N');
		return account;
	}

	public T close(T account) {
		account.setStatus('C');
		return account;
	}

}
