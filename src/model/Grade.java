package model;

public class Grade {
	
	//1.variables
	private long gId;
	private int grValue;
	private Student student;
	private Course course;
	
	private static long counter = 200000;

	//2. get and set
	public long getgId() {
		return gId;
	}

	public void setgId() {
		this.gId = counter;
		counter++;
	}

	public int getGrValue() {
		return grValue;
	}

	public void setGrValue(int grValue) {
		if(grValue > 0 && grValue < 11)
			this.grValue = grValue;
		else
			this.grValue = 0;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		if(student != null)
			this.student = student;
		else
			this.student = new Student();
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		if(course != null)
			this.course = course;
		else
			this.course = new Course();
	}
	
	
	//3. constructors
	public Grade()
	{
		setgId();
		setGrValue(4);
		setCourse(new Course());
		setStudent(new Student());
	}
	
	public Grade(int grValue, Course course, Student student) {
		setgId();
		setGrValue(grValue);
		setCourse(course);
		setStudent(student);
	}
	//4. toString
	
	public String toString() {
		return student.getName() + " " + student.getSurname() + " gets "
	+ grValue + " in course: " + course.getTitle();
	}
	//5 other functions

}
