package model;

import java.util.ArrayList;
import java.util.Arrays;

public class Course {

	//1. variables
	private long cId;
	private String title;
	private int creditPoints;
	private ArrayList<Professor> professors = new ArrayList<Professor>();
	
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

	public ArrayList<Professor> getProfessors() {
		return professors;
	}

	public void setProfessors(ArrayList<Professor> professors) {
		if(professors != null)
			this.professors = professors;
		else
			this.professors = new ArrayList<Professor>(Arrays.asList(new Professor()));
	}
	//3. constructors
	public Course()
	{
		setcId();
		setTitle("Programmēšana tīmeklī JAVA");
		setCreditPoints(4);
		ArrayList<Professor> tempProfs = new ArrayList<Professor>(Arrays.asList(new Professor()));
		setProfessors(tempProfs);
	}
	
	public Course(String title, int creditPoints, ArrayList<Professor> professors) {
		setcId();
		setTitle(title);
		setCreditPoints(creditPoints);
		setProfessors(professors);
	}
	
	//4. toString
	public String toString() {
		return cId + ": " + title + "(" + creditPoints + " KP),"+professors;//tiks izsaukta Professor toString funkcija
	}
	
	//5. other functions
	
	public void addProfessor(Professor professor) {
		if(!professors.contains(professor))
		{
			professors.add(professor);
		}
	}
	
	public void removeProfessor(Professor professor) {
		if(professors.contains(professor))
		{
			professors.remove(professor);
		}
	}
	
}
