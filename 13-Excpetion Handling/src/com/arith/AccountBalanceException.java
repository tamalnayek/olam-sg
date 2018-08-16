package com.arith;

public class AccountBalanceException extends Exception {
	@Override
	public String getMessage() {
		return "not enough balance";
	}
}
