import Controller.StudentBuilder;
import Controller.StudentCarBuilder;
import Entity.Student;
import Entity.StudentCar;

public class Prova{
	
	public static void main(String[] args) {
		Student student = StudentBuilder.newBuilder("000").fullname("Mario", "Rossi").password("abc").build();
		StudentCar sc = StudentCarBuilder.newBuilder("111").fullname("Pico", "Cavallo").rating(5).build();
		StudentCar sc2 = StudentCarBuilder.newBuilder(student).rating(99).build();
		System.out.println(student.toString());
		System.out.println(sc.toString());
		System.out.println(sc2.toString());
	}	
}