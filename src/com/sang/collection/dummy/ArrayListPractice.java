
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {
public static void main(String args[]) {
	ArrayList<Integer> arrayList = new ArrayList<>();
	arrayList.add(1);
	arrayList.add(9);
	arrayList.add(5);
	arrayList.add(4);
	
	System.out.println(arrayList);
	Collections.sort(arrayList);
	System.out.println(arrayList);
	
	
	//Obtaining array from ArrayList
	Object[] array = arrayList.toArray();
	Integer[] intarray = (Integer[])array;
	
	
}
}
