package model;

public class Course {

	//1. variables
	private long cId;
	private String title;
	private int creditPoints;
	private Professor professor;
	
	private static long counter = 100000;
	//2. get and set

	public long getcId() {
		return cId;
	}

	public void setcId() {
		this.cId = counter;
		counter++;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if(title != null && title.matches("[A-ZĒŪĪĻĶĢŠĀČŅa-zēūīļķģšāžčņ ]+"))
			this.title = title;
		else
			this.title  ="undefinied";
	}

	public int getCreditPoints() {
		return creditPoints;
	}

	public void setCreditPoints(int creditPoints) {
		if(creditPoints > 0 && creditPoints <=20)
			this.creditPoints = creditPoints;
		else
			this.creditPoints = 2;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		if(professor != null)
			this.professor = professor;
		else
			this.professor = new Professor();
	}
	//3. constructors
	public Course()
	{
		setcId();
		setTitle("Programmēšana tīmeklī JAVA");
		setCreditPoints(4);
		setProfessor(new Professor());
	}
	
	public Course(String title, int creditPoints, Professor professor) {
		setcId();
		setTitle(title);
		setCreditPoints(creditPoints);
		setProfessor(professor);
	}
	
	//4. toString
	public String toString() {
		return cId + ": " + title + "(" + creditPoints + " KP),"+professor;//tiks izsaukta Professor toString funkcija
	}
	
	//5. other functions
}
