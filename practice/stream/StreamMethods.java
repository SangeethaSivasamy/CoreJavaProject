package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {
	
public static void main(String[] args) {
	
	List<Student> list = new ArrayList<>();
	list.add(new Student(1, "A", 10));
	list.add(new Student(3, "C", 30));
	list.add(new Student(3, "C", 30));
	list.add(new Student(3, "C", 30));
	list.add(new Student(55, "E", 550));
	list.add(new Student(4, "D", 40));
	list.add(new Student(6, "F", 60));
	list.add(new Student(7, "G", 70));
	list.add(new Student(2, "B", 20));
	list.add(new Student(2, "B", 20));
	list.add(new Student(2, "B", 20));
	list.add(new Student(5, "E", 50));
	list.add(new Student(5, "E", 50));
	
	/*Stream<Student> stream = list.stream();
	
	boolean bl = stream.allMatch(n->n.getAge()>20);
	System.out.println(bl);*/
	
	/*Stream<Student> stream2 = list.stream();
	boolean bl2 = stream2.anyMatch(n->n.getAge()>20);
	System.out.println(bl2);*/
	
	/*Stream<Student> stream2 = list.stream();
	boolean bl2 = stream2.noneMatch(n->n.getAge()>20);
	System.out.println(bl2);*/
	
	/*Stream<Student> stream2 = list.stream();
	Optional<Student> optional = stream2.findAny();
	optional.ifPresent(n->System.out.println(n));*/
	
	/*Stream<Student> stream2 = list.stream();
	Optional<Student> optional = stream2.findFirst();
	optional.ifPresent(n->System.out.println(n));*/
	
	/*Stream<Student> stream2 = list.stream();
	System.out.println(stream2.count());*/
	
	/*Stream<Student> stream2 = list.stream();
	Optional<Student> optional = stream2.min(new StudentNameComparator());
	optional.ifPresent(n->System.out.println(n));*/
	
	/*Stream<Student> stream2 = list.stream();
	Optional<Student> optional = stream2.max(new StudentNameComparator());
	optional.ifPresent(n->System.out.println(n));*/
	
	/*Stream<Student> stream2 = list.stream();
	stream2.forEach(n->System.out.println(n));*/
	
	/*Stream<Student> stream2 = list.stream();
	Student[] arr =  stream2.toArray(n->new Student[n]);
	System.out.println(Arrays.toString(arr));*/
	
	Stream<Student> stream2 = list.stream();
	Stream<Student> newstream = stream2.distinct();//not working
	newstream.forEach(System.out::println);
	
	System.out.println("====================s");
	Student s1 = new Student(3, "C", 30);
	Student s2 = new Student(3, "C", 30);
	
	System.out.println("===================="+	s1.equals(s2));
	
	/*Stream<Student> stream2 = list.stream();
	Stream<Student> newstream = stream2.filter(n->n.getAge()>20).sorted(new StudentNameComparator()).skip(2).limit(5).peek(n->n.setAge(70));
	newstream.forEach(n->System.out.println(n));*/
	
	/*Stream<String> stream = Stream.of("A","B");
	stream.forEach(n->System.out.println(n));*/
	
	/*Stream<String> stream = Stream.generate(()->"A");
	stream.forEach(n->System.out.println(n));*/
	
	/*Stream<Student> stream21 = list.stream();
	Optional<Student> optional = stream21.reduce((n,v)->{
		if(n.getAge()>v.getAge()) return n;
		else return v;
	});
	optional.ifPresent(n->System.out.println(n));*/
	
	Stream<Student> stream22 = list.stream();
	Student s = stream22.reduce(new Student(11,"11",200),(n,v)->{
		if(n.getAge()>v.getAge()) return n;
		else return v;
	});
	System.out.println(s);
	
	/*Stream<Student> stream2 = list.stream();
	Student s = stream2.reduce(new Student(11,"11",200),
			(n,v)->{
		n.setAge(10);
	},
	(n,v)->{
		if(n.getAge()>v.getAge()) return n;
		else return v;
	} );
	System.out.println(s);*///not working
	
	/*Stream<Student> stream2 = list.stream();
	Stream<String> stream3 = stream2.map(n->n.getName());
	stream3.forEach(n->System.out.println(n));*/
	
	
	
	/*Stream<Student> stream2 = list.stream();
	List<Student> list2 = stream2.collect(Collectors.toList());
	System.out.println(list2);*/
	
	
	 int[] array = {23,43,56,97,32};
	  //Set start value. Result will be start value + sum of array. 
	  int startValue = 100;
	  int sum = Arrays.stream(array).reduce(startValue, Integer::sum);
	  System.out.println(sum);
	  sum = Arrays.stream(array).reduce(startValue, (n,v)->n+v);
	  System.out.println(sum);
}
}
