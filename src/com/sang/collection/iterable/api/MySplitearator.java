package com.sang.collection.iterable.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class MySplitearator {
public static void main(String[] args) {
	
	Student student1 = new Student(1, "Sangeetha", 28);
	Student student2 = new Student(2, "Sankar", 30);
	Student student3 = new Student(3, "Harsha", 27);
	Student student4 = new Student(4, "Ajay", 26);
	Student student5 = new Student(5, "Raghu", 27);
	Student student6 = new Student(11, "AAAA", 27);
	Student student7 = new Student(12, "BBBB", 27);
	Student student8 = new Student(13, "CCCC", 27);
	Student student9 = new Student(14, "DDDD", 27);
	
	List<Student> list = new ArrayList<>();
	list.add(student1);
	list.add(student2);
	list.add(student3);
	list.add(student4);
	list.add(student5);
	list.add(student6);
	list.add(student7);
	list.add(student8);
	list.add(student9);
	
	Spliterator<Student> spliterator = list.spliterator();
	
	
	Spliterator<Student> spliterator2 = spliterator.trySplit();
	
	Spliterator<Student> spliterator3 = spliterator.trySplit();
	
	System.out.println(spliterator.estimateSize());
	System.out.println("ExactSize:"+spliterator.getExactSizeIfKnown());
	System.out.println(spliterator.characteristics());
	
	while(spliterator.tryAdvance(n->System.out.println("tryAdvance spliterator:"+n)));
	
	
	spliterator.forEachRemaining(n->System.out.println("forEachRemaining spliterator:"+n));
	System.out.println();
	spliterator2.forEachRemaining(n->System.out.println("forEachRemaining spliterator2:"+n));
	System.out.println();
	spliterator3.forEachRemaining(n->System.out.println("forEachRemaining spliterator3:"+n));

	spliterator.tryAdvance(n->System.out.println("tryAdvance spliterator:"+n));
	spliterator.tryAdvance(n->System.out.println("tryAdvance spliterator:"+n));
	
	
	
	
}

	
	/*public static void main(String[] args) 
    {
        // Create an array list for doubles.
        ArrayList<Integer> al1 = new ArrayList<>();
             
        // Add values to the array list.
        al1.add(1);
        al1.add(2);
        al1.add(-3);
        al1.add(-4);
        al1.add(5);
             
             
        // Use tryAdvance() to display(action) contents of arraylist.
             
        System.out.print("Contents of arraylist:\n");
             
        // getting Spliterator object on al1
        Spliterator<Integer> splitr = al1.spliterator();
             
        // Use tryAdvance() to display(action) contents of arraylist.
        // Notice how lambda expression is used to implement accept method
        // of Consumer interface
             
        while(splitr.tryAdvance((n) -> System.out.println(n)));
             
        // Use tryAdvance() for getting absolute values(action) of contents of arraylist.
             
             
        // Create new list that contains absolute values.
        ArrayList<Integer> al2 = new ArrayList<>();
             
             
             
        splitr = al1.spliterator();
             
        // Here our action is to get absolute values
        // Notice how lambda expression is used to implement accept method
        // of Consumer interface
        while(splitr.tryAdvance((n) -> al2.add(Math.abs(n))));
             
        System.out.print("Absolute values of contents of arraylist:\n");
             
        // getting Spliterator object on al2
        splitr = al2.spliterator();
             
             
        while(splitr.tryAdvance((n) -> System.out.println(n)));
             
    }*/


}
