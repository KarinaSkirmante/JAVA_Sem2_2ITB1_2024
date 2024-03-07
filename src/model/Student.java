package model;

public class Student extends Person{

	//1. variables
	private long sId;

	
	private static long counter = 10000;
	//2. get and set
	public long getsId() {
		return sId;
	}

	
	
	public void setsId() {
		this.sId = counter;
		counter++;
	}
		

	//3. constructors
	public Student() {
		super();
		setsId();
	}
	
	public Student(String name, String surname) {
		super(name, surname);
		setsId();
	}
	//4.toString
	public String toString() {
		return "Student ->" + sId + ":" + super.toString();
	}
	//5. other functions
}
