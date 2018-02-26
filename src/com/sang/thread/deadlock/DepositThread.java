package com.sang.thread.deadlock;

public class DepositThread implements Runnable{

	DepositService deposidervice;
	WithdrawalService withdrawalservice;
	
	public DepositThread(DepositService deposidervice,WithdrawalService withdrawalservice) {
		// TODO Auto-generated constructor stub
		this.deposidervice = deposidervice;
		this.withdrawalservice = withdrawalservice;
		new Thread(this,"DepositThread").start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		deposidervice.depositPrint(withdrawalservice);
	}

}
