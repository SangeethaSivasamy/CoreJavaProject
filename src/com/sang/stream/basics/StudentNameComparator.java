package com.sang.stream.basics;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getName().equals(o2.getName())) 
			return 0;
		else if(  (o1.getName().compareTo(o2.getName()))<0  )
			return -1;
			else if(  (o1.getName().compareTo(o2.getName()))>0  )
				return 1;
			
		return 0;
	}

}
