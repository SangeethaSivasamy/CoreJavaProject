package com.sang.stream.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations1 {
	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<>();
		arrayList.add(new Student(1, "Sangeetha", 20));
		arrayList.add(new Student(3, "DDDD", 20));
		arrayList.add(new Student(4, "CCCC", 27));
		arrayList.add(new Student(2, "EEEE", 29));
		arrayList.add(new Student(5, "BBBB", 25));
		arrayList.add(new Student(5, "BBBB", 25));
		
		
		Stream<Student> stream = arrayList.stream();
		
		boolean isAllMatch = stream.allMatch(n->n.getAge()==20);
		System.out.println(isAllMatch);
		
		Stream<Student> stream1 = arrayList.stream();
		boolean isAnyMatch = stream1.anyMatch(n->n.getAge()==20);
		System.out.println(isAnyMatch);
		
		Stream<Student> stream2 = arrayList.stream();
		boolean isNoneMatch = stream2.noneMatch(n->n.getAge()==20);
		System.out.println(isNoneMatch);
		
		Stream<Student> stream3 = arrayList.stream();
		Optional<Student> findAny = stream3.findAny();
		if(findAny.isPresent()) System.out.println(findAny.get().getName());
		
		Stream<Student> stream4 = arrayList.stream();
		Optional<Student> findFirst = stream4.findFirst();
		if(findFirst.isPresent()) System.out.println(findFirst.get().getName());
		
		Stream<Student> stream5 = arrayList.stream();
		System.out.println(stream5.count());
		
		Stream<Student> stream6 = arrayList.stream();
		Optional<Student> min = stream6.min(new StudentNameComparator());
		if(min.isPresent()) System.out.println(min.get().getName());
		
		Stream<Student> stream7 = arrayList.stream();
		Optional<Student> max = stream7.max(new StudentNameComparator());
		if(max.isPresent()) System.out.println(max.get().getName());
		
		Stream<Student> stream8 = arrayList.stream();
		stream8.forEach(n->System.out.println(n));
		System.out.println("--------");
		
		Stream<Student> stream9 = arrayList.stream();
		Stream<Student> sorted = stream9.sorted(new StudentNameComparator());
		sorted.forEach(n->System.out.println(n));
		System.out.println("--------");
		
		Stream<Student> stream10 = arrayList.stream();
		Stream<Student> filtered = stream10.filter(n->n.getAge()>20);//stream has already been operated upon or closed but chain operation allowed
		filtered.forEach(n->System.out.println(n));
		System.out.println("--------");
		
		Stream<Student> stream11 = arrayList.stream();
		Stream<Student> skipped = stream11.skip(2);
		skipped.forEach(n->System.out.println(n));
		System.out.println("--------");
		
		Stream<Student> stream12 = arrayList.stream();
		Stream<Student> peeked = stream12.peek(n->n.setRollNo(1));
		peeked.forEach(n->System.out.println(n));
		System.out.println("--------");
		
		Stream<Student> stream13 = arrayList.stream();
		Stream<Student> limited = stream13.limit(2);
		limited.forEach(n->System.out.println(n));
		System.out.println("--------");
		
		Stream<Student> stream14 = arrayList.stream();
		Stream<Student> distinct = stream14.distinct();
		distinct.forEach(n->System.out.println(n));
		System.out.println("--------");
		
		//Reduction with accumulator
		Stream<Student> stream15 = arrayList.stream();
		Optional<Student> reduced1 = stream15.reduce((a,b)->a.getAge()>b.getAge()?a:b);
		if(reduced1.isPresent()) System.out.println("reduced1"+reduced1.get());
		System.out.println("--------");
		
		//Reduction with identity, accumulator
		Stream<Student> stream16 = arrayList.stream();
		int reduced2 = stream16.map(Student::getAge).reduce(1, (a,b)->a+b);
		System.out.println("reduced2"+reduced2);
		System.out.println("--------");
		
		//Reduction with identity, accumulator and combiner
		
		
		
		
		Map<Boolean,List<Student>> studentMap = 
				arrayList.stream()
				.collect(Collectors.partitioningBy((Student student) -> student.getAge() > 30));
		System.out.println("Employees partitioned based on age");
		studentMap.forEach((Boolean key, List<Student> studentList) -> System.out.println(key +"->" + studentList));

		
		
		
		arrayList.stream().map(n->n.getName()).forEach(n->System.out.println(n));
		
		
		
		
		System.out.println("Generate Method:");
		Stream<String> stream111 = Stream.generate(() -> {return "abc";});
		//stream111.forEach(n->System.out.println(n));
	}
}
