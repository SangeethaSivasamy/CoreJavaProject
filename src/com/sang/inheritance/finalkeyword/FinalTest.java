package com.sang.inheritance.finalkeyword;

public class FinalTest {
final int STATUSCODE = 111;
final int ACC;
final int ACCNUM;
static final int NO;

public FinalTest() {
	// TODO Auto-generated constructor stub
	System.out.println("FinalTest()");
	ACC = 100000;
}

public FinalTest(int i) {
	System.out.println("FinalTest(int i)");
	ACC = 200000;
}

{
	System.out.println("block");
	ACCNUM = 27;
}


static {
	System.out.println("static block");
	NO = 2;
}


}
