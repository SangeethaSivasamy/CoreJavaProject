package com.sang.inheritance.methodoverriding;

public class SavingsAccount extends Account{
	/*@Override
	public void print(Student p) {
		System.out.println(p);
	}*/
	
	public static void m1() {
		System.out.println("SavingsAccount m1");
	}

	
	public static void main(String[] args) {
		Account account = new SavingsAccount();
		account.m1();
		
		SavingsAccount account1 = new SavingsAccount();
		account1.m1();
		
	}
}
