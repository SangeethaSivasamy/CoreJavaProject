package com.sang.thread.deadlock;

public class TestTransaction {
public static void main(String[] args) {
	DepositService depositService = new DepositService();
	WithdrawalService withdrawalService = new WithdrawalService();
	
	new DepositThread(depositService, withdrawalService);
	new WithdrawalThread(depositService,withdrawalService);
}
}
