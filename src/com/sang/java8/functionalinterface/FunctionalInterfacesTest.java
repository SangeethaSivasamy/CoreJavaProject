package com.sang.java8.functionalinterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalInterfacesTest {

	public static void main(String[] args) {
		
		Predicate<Student> predicate = n->n.getAge()>30;
		Consumer<Student> consumer = n->System.out.println(n);
		Supplier<Student> supplier = ()->new Student(55, "fiftyfive", 55);
		Function<Student, String> function = n->"Sangeetha";
		UnaryOperator<Student> unaryOperator = n->{
													n.setAge(n.getAge()+10);
													return n;
												 };
	    
        System.out.println("Predicate:");
        System.out.println(predicate.test(new Student(1,"one",50)));
        System.out.println("-----------------------------------------------------------------------------");
        
        System.out.println("Consumer:");
        consumer.accept(new Student(2,"two",20));
        System.out.println("-----------------------------------------------------------------------------");
        
        System.out.println("Supplier:");
        System.out.println(supplier.get());
        System.out.println("-----------------------------------------------------------------------------");
        
        System.out.println("Function:");
        System.out.println(function.apply(new Student(3,"three",35)));
        System.out.println("-----------------------------------------------------------------------------");
        
        System.out.println("UnaryOperator");
        System.out.println(unaryOperator.apply(new Student(4,"four",40)));
        System.out.println("-----------------------------------------------------------------------------");
        
        
        MyFunctionalInterface<String> myFunctionalInterface = n->n+"Sangeetha";
        System.out.println(myFunctionalInterface.manipulate("Sankar"));
	}
}
