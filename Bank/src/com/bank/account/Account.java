package com.bank.account;

public class Account {

	private int no;//계좌 번호
	private String name;//고객이름
	private long balance;//금액
	
	public Account(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
		
	public Account(int no, String name, long balance) {
		super();
		this.no = no;
		this.name = name;
		this.balance = balance;
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}	
}
