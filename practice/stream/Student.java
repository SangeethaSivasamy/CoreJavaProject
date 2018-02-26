package stream;

public class Student {

	Student(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	private int rollNo;
	private String name;
	private int age;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return this.getRollNo() + "-" + this.getName() + "-" + this.getAge();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (null == obj)
			return false;

		if (!(obj instanceof Student))
			return false;

		Student newObj = (Student) obj;
		System.out.println(this);
		System.out.println(newObj);

		if (this.getAge() == newObj.getAge() && this.getName().equals(newObj.getName())
				&& this.getRollNo() == newObj.getRollNo()) {
			return true;
		}
		return false;
	}
}
