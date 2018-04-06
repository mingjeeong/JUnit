package com.bank.account;

import com.bank.account.exception.NotEnoughBalanceException;

public class AccountManagement {

	// 입금
	public long deposit(Account account, long amount){
		//기존의 금액 얻어오기
		long balance = account.getBalance();
		//기존 금액+ 입금금액
		account.setBalance(balance+amount);
		return balance+amount;			
	}
	
	
	// 출금
	public long withdrawal(Account account, long amount){
		long balance = account.getBalance();
		if(balance <amount){
			throw new NotEnoughBalanceException("잔액이 부족합니다.");
		}
		account.setBalance(balance-amount);
		return balance-amount;
		
		
	}
	
}
