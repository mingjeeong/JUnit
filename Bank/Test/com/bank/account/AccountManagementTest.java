package com.bank.account;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bank.account.exception.NotEnoughBalanceException;

public class AccountManagementTest {

	@Test
	public void testDeposit(){
		Account a = new Account(1,"박",1000);
		AccountManagement am = new AccountManagement();
		long amount = am.deposit(a, 2000);
		assertEquals(3000,amount);
		assertEquals(3000,a.getBalance());
	}
	
	@Test(expected= NotEnoughBalanceException.class)//
	public void test출금(){//public void 
		Account kim = new Account(2, "김", 500);
		AccountManagement am = new AccountManagement();
		long amount = am.withdrawal(kim, 600);
		//assertEquals(200,amount);//
		//assertEquals(200,kim.getBalance());//
	}
}
