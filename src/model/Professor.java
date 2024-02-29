package model;

public class Professor {
	//1.variables
	private long pId;
	private String name;
	private String surname;
	private Degree degree;
	
	private static long counter = 0;
	
	//2.get and set
	public long getpId() {
		return pId;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public Degree getDegree() {
		return degree;
	}
	
	
	public void setpId() {
		this.pId = counter;
		counter++;
	}
		
	public void setName(String name) {
		if(name != null && name.matches("[A-ZĒŪĪĻĶĢŠĀČŅ]{1}[a-zēūīļķģšāžčņ]+"))
			this.name = name;
		else
			this.name = "---";
	}
	public void setSurname(String surname) {
		if(surname != null && surname.matches("[A-ZĒŪĪĻĶĢŠĀČŅ]{1}[a-zēūīļķģšāžčņ]+"))
			this.surname = surname;
		else
			this.surname = "---";
	}
	public void setDegree(Degree degree) {
		if(degree != null)
			this.degree = degree;
		else
			this.degree = Degree.other;
	}
	
	
	//3.constructors
	public Professor() {
		setpId();
		setName("Janis");
		setSurname("Berzins");
		setDegree(Degree.other);
	}
	
	public Professor(String name, String surname, Degree degree) {
		setpId();
		setName(name);
		setSurname(surname);
		setDegree(degree);
	}
	
	//4.toString function
	//generated
	/*@Override
	public String toString() {
		return "Professor [pId=" + pId + ", name=" + name + ", surname=" + surname + ", degree=" + degree + "]";
	}*/
		
	
	
	public String toString() {
		return pId + ":" +degree + ", " + name + " " + surname;
	}
	
	
	
	//5.other functions
	
	
}
