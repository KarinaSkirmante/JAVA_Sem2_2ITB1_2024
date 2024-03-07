package model;

public class Person {
	private String name;
	private String surname;
	
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
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
	
	public Person()
	{
		setName("Janis");
		setSurname("Berzins");
	}
	
	public Person(String name, String surname) {
		setName(name);
		setSurname(surname);
	}
	
	public String toString() {
		return name + " " + surname;
	}
	
	
}
