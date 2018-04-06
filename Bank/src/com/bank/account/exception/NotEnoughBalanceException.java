package com.bank.account.exception;

public class NotEnoughBalanceException extends RuntimeException {

	/**
	 * 시리얼번호 없으면 warning이 발생하기에 그냥 추가한 것일 뿐
	 */
	private static final long serialVersionUID = 1L;

	//
	public NotEnoughBalanceException(){
		super();
	}
	
	public NotEnoughBalanceException(String message){
		super(message);
	}
}
