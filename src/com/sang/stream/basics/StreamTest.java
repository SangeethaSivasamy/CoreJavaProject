package com.sang.stream.basics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
		/*ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(20);
		arrayList.add(25);
		arrayList.add(27);
		arrayList.add(21);
		arrayList.add(28);
		arrayList.add(26);
		arrayList.add(24);
		arrayList.add(22);
		arrayList.add(23);


		// Obtain a Stream to the array list.
		Stream<Integer> stream = arrayList.stream();

		// Obtain the minimum and maximum value by use of min(),
		// max(), isPresent(), and get().
		Optional<Integer> minVal = stream.min(Integer::compare);
		if(minVal.isPresent()) System.out.println(minVal.get());

		// Must obtain a new stream because previous call to min()
		// is a terminal operation that consumed the stream.
		Stream<Integer> stream2 = arrayList.stream();
		Optional<Integer> maxVal = stream2.max(Integer::compare);
		if(maxVal.isPresent()) System.out.println(maxVal.get());

		// Sort the stream by use of sorted().
		Stream<Integer> sortedStream = arrayList.stream().sorted();


		// Display the sorted stream by use of forEach().
		sortedStream.forEach(n->System.out.println(n));


		// Display only the odd values by use of filter().
		Stream<Integer> stream3 = arrayList.stream().filter(n->(n%2 != 0));
		stream3.forEach(n->System.out.println("-->"+n));

		// Display only the odd values that are greater than 5. Notice that
		// two filter operations are pipelined.
		Stream<Integer> stream4 = arrayList.stream().filter( (n) -> (n % 2) == 1).filter((n) -> n > 5);
		System.out.print("Odd values greater than 5: ");
		stream4.forEach((n) -> System.out.print(n + " ") );
		
		*/
		
		/*//Using String
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Sangeetha");
		arrayList.add("DDDD");
		arrayList.add("CCCC");
		arrayList.add("EEEE");
		arrayList.add("CCCCC");
		
		Stream<String> stream = arrayList.stream();
		Optional<String> optional = stream.min(String::compareTo);
		if(optional.isPresent()) System.out.println(optional.get());*/
		
		
		//Using my own Object
		ArrayList<Student> arrayList = new ArrayList<>();
		arrayList.add(new Student(1, "Sangeetha", 20));
		arrayList.add(new Student(3, "DDDD", 20));
		arrayList.add(new Student(4, "CCCC", 27));
		arrayList.add(new Student(2, "EEEE", 29));
		arrayList.add(new Student(5, "BBBB", 25));
		
		Stream<Student> stream = arrayList.stream();
		Optional<Student> optional = stream.min(new StudentNameComparator());
		if(optional.isPresent()) System.out.println(optional.get());
		
		
		
		
		
	}
	
	
	
	
	
}
