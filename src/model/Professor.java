package model;

public class Professor extends Person {
	//1.variables
	private long pId;

	//name and surname will be from Person
	private Degree degree;
	
	private static long counter = 0;
	
	//2.get and set
	public long getpId() {
		return pId;
	}
	
	public Degree getDegree() {
		return degree;
	}
	
	
	public void setpId() {
		this.pId = counter;
		counter++;
	}
		

	public void setDegree(Degree degree) {
		if(degree != null)
			this.degree = degree;
		else
			this.degree = Degree.other;
	}
	
	
	//3.constructors
	public Professor() {
		super();//te tiek izsaukts Person() konstruktors
		setpId();
		setDegree(Degree.other);

	}
	
	public Professor(String name, String surname, Degree degree) {
		super(name, surname);//te tiek izsaukts Person(String name, String surname) konstruktors
		setpId();
		setDegree(degree);
	}
	
	//4.toString function
	//generated
	/*@Override
	public String toString() {
		return "Professor [pId=" + pId + ", name=" + name + ", surname=" + surname + ", degree=" + degree + "]";
	}*/
		
	
	
	public String toString() {
		return "Professor ->" + pId + ":" +degree + ", " + super.toString();//te izsauksies personas kalses toString funkcija
	}
	
	
	
	//5.other functions
	
	
}
