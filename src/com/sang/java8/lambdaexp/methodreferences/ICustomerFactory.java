package com.sang.java8.lambdaexp.methodreferences;

@FunctionalInterface
public interface ICustomerFactory {

	Customer getCustomer(String name, String age);
}
