import Controller.StudentBuilder;
import Entity.Student;

public class Prova{
	
	public static void main(String[] args) {
		Student student = new StudentBuilder("000").fullname("Mario", "Rossi").password("abc").Build();
		System.out.println(student.toString());
	}	
}