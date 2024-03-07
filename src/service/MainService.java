package service;

import java.util.ArrayList;

import model.Course;
import model.Degree;
import model.Grade;
import model.Professor;
import model.Student;

public class MainService {

	private static ArrayList<Professor> allProfessors = new ArrayList<Professor>();
	private static ArrayList<Student> allStudents =  new ArrayList<Student>();
	private static ArrayList<Course> allCourses = new ArrayList<Course>();
	private static ArrayList<Grade> allGrades = new ArrayList<Grade>();
	
	
	
	public static void main(String[] args) {
		Professor pr1 = new Professor();
		Professor pr2 = new Professor("Karina", "Šķirmante", Degree.mg);
		allProfessors.add(pr1);
		allProfessors.add(pr2);
		for(Professor tempPro : allProfessors) {
			System.out.println(tempPro);
		}
		
		Student st1 = new Student();
		Student st2 = new Student("Līga", "Jaukā");
		allStudents.add(st1);
		allStudents.add(st2);
		for(Student tempSt : allStudents) {
			System.out.println(tempSt);
		}
		
		Course c1 = new Course();
		Course c2 = new Course("Datu Struktūras un pamatalgoritmi", 2, pr2);
		Course c3 = new Course("Programmatūras Inženierija I", 2, pr2);
		allCourses.add(c1);
		allCourses.add(c2);
		allCourses.add(c3);
		for(Course tempC : allCourses) {
			System.out.println(tempC);
		}
		
		Grade gr1 = new Grade();
		Grade gr2 = new Grade(4, c1, st2);
		Grade gr3 = new Grade(10, c2, st2);
		Grade gr4 = new Grade(5, c2, st1);
		allGrades.add(gr1);
		allGrades.add(gr2);
		allGrades.add(gr3);
		allGrades.add(gr4);
		
		for(Grade tempGr : allGrades) {
			System.out.println(tempGr);
		}
		
		try
		{
		
			System.out.println(st2.getName() + " " + st2.getSurname() + 
					" AVG grade: " +    calculateAVGgrade(st2));
			
			System.out.println(st2.getName() + " " + st2.getSurname() + 
					" AVG weighted grade: " +   calculateAVGweightedGrade(st2));
			System.out.println(c2.getTitle() + " AVG grade:" + calculateAVGGradeOfCourse(c2));
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	//10 4KP
	//5 2KP
	//10*4 + 5*2 = sum
	//howMany = 4KP + 2KP = 6Kp
	//->sum/6KP
	
	public static float calculateAVGgrade(Student student) throws Exception {
		if(student == null) throw new Exception("Problems with input student");
		
		float sum = 0;
		int howMany = 0;
		
		
		for(Grade tempGr : allGrades) {
			if(tempGr.getStudent().equals(student)) {
				sum = sum + tempGr.getGrValue();
				howMany++;
			}
		}
		if(howMany == 0) throw new Exception("There are no course");
		
		return sum/howMany;
		
	}
	
	
	public static float calculateAVGweightedGrade(Student student) throws Exception {
		if(student == null) throw new Exception("Problems with input student");
		
		float sum = 0;
		int howManyCP = 0;
		
		
		for(Grade tempGr : allGrades) {
			if(tempGr.getStudent().equals(student)) {
				sum = sum + tempGr.getGrValue()*tempGr.getCourse().getCreditPoints();
				howManyCP = howManyCP + tempGr.getCourse().getCreditPoints();
			}
		}
		if(howManyCP == 0) throw new Exception("There are no course");
		
		return sum/howManyCP;
		
	}
	
	
	public static float calculateAVGGradeOfCourse(Course course) throws Exception {
		if(course == null) throw new Exception("Problems with input course");
		float sum = 0;
		int howMany = 0;
		
		for(Grade tempGr : allGrades) {
			if(tempGr.getCourse().equals(course)) {
				sum += tempGr.getGrValue();
				howMany++;
			}
		}
		
		if(howMany == 0) throw new Exception("There are no grades in this course");
		
		return sum/howMany;
		
	}
	
	
	public static int calculateHowManyCourseByProfessor(Professor professor) throws Exception {
		if(professor == null) throw new Exception("Problems with input professor");
		
		int howMany = 0;
		
		for(Course tempCo : allCourses) {
			if(tempCo.getProfessor().equals(professor)) {
				howMany++;
			}
		}
		
		if(howMany == 0) throw new Exception("There are no course for this professor");
		
		return howMany;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
