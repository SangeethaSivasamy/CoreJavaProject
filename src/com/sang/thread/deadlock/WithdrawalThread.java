package com.sang.thread.deadlock;

public class WithdrawalThread implements Runnable{

	DepositService deposidervice;
	WithdrawalService withdrawalservice;
	
	public WithdrawalThread(DepositService deposidervice,WithdrawalService withdrawalservice) {
		// TODO Auto-generated constructor stub
		this.deposidervice = deposidervice;
		this.withdrawalservice = withdrawalservice;
		new Thread(this,"WithdrawalThread").start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		withdrawalservice.wdPrint(deposidervice);
	}

}
