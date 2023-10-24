package com.luv2code.aopdemo.DAO;

import org.springframework.stereotype.Repository;

import com.luv2code.aopdemo.Account;

@Repository
public class AccountDAOImpl implements AccountDAO{

	@Override
	public void addAccount(Account theAccount, boolean vipFlag) {
		
		System.out.println(getClass()+": Doing my db work: adding an account");
		
	}

	@Override
	public boolean doWork() {
		System.out.println(getClass()+": doWork()");
		return false;
	}
	
}
