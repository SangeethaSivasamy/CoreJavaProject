package com.sang.thread.deadlock;

public class WithdrawalService {
	DepositService depositService;
	
	public WithdrawalService() {
		// TODO Auto-generated constructor stub
		this.depositService = depositService;
	}

	/*public synchronized void wdPrint(DepositService depositService) {
		System.out.println("wdPrintEntry:"+Thread.currentThread().getName());
		try {
		Thread.sleep(5000);
		depositService.calculateD();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("wdPrintExit:"+Thread.currentThread().getName());
	}*/
	
	public  void wdPrint(DepositService depositService) {
		System.out.println("wdPrintEntry:"+Thread.currentThread().getName());
		synchronized(this) {
		try {
		//Thread.sleep(5000);
		depositService.calculateD();
		} catch (Exception e) {
			// TODO: handle exception
		}
		}
		System.out.println("wdPrintExit:"+Thread.currentThread().getName());
	}
	
	public  void calculateW() {
		synchronized(this) {
		System.out.println("calculateW:"+Thread.currentThread().getName());
		}
	}
}
