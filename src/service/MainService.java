package service;

import model.Course;
import model.Degree;
import model.Grade;
import model.Professor;
import model.Student;

public class MainService {

	public static void main(String[] args) {
		Professor pr1 = new Professor();
		Professor pr2 = new Professor("Karina", "Šķirmante", Degree.mg);
		System.out.println(pr1);
		System.out.println(pr2);
		
		Student st1 = new Student();
		Student st2 = new Student("Līga", "Jaukā");
		System.out.println(st1);
		System.out.println(st2);
		
		Course c1 = new Course();
		Course c2 = new Course("Datu Struktūras un pamatalgoritmi", 2, pr2);
		System.out.println(c1);
		System.out.println(c2);
		
		Grade gr1 = new Grade();
		Grade gr2 = new Grade(4, c1, st2);
		Grade gr3 = new Grade(10, c2, st2);
		System.out.println(gr1);
		System.out.println(gr2);
		System.out.println(gr3);

	}

}
