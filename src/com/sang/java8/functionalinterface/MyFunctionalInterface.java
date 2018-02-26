package com.sang.java8.functionalinterface;

@FunctionalInterface
public interface MyFunctionalInterface<T> {

	T manipulate(T t);
}
