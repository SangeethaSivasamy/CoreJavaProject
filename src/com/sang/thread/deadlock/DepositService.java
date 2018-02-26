package com.sang.thread.deadlock;

public class DepositService {
	WithdrawalService withdrawalService;
	
	public DepositService() {
		// TODO Auto-generated constructor stub
		this.withdrawalService = withdrawalService;
	}
	/*public synchronized void depositPrint(WithdrawalService withdrawalService) {
		System.out.println("depositPrintEntry:"+Thread.currentThread().getName());
		try {
		Thread.sleep(5000);
		withdrawalService.calculateW();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("depositPrintExit:"+Thread.currentThread().getName());
	}*/
	
	
	public  void depositPrint(WithdrawalService withdrawalService) {
		System.out.println("depositPrintEntry:"+Thread.currentThread().getName());
		synchronized(this) {
		try {
		Thread.sleep(5000);
		withdrawalService.calculateW();
		} catch (Exception e) {
			// TODO: handle exception
		}
		}
		System.out.println("depositPrintExit:"+Thread.currentThread().getName());
	}
	
	public  void calculateD() {
		synchronized(this) {
		System.out.println("calculateD:"+Thread.currentThread().getName());
		}
	}
}
