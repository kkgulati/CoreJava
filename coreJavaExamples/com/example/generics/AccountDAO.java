package com.example.generics;

public interface AccountDAO<T extends Account> {

	public T open(T account);
	public T close(T account);
}
