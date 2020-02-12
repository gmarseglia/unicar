package Controller;

import java.util.ArrayList;
import Entity.Lift;
import Entity.Profile;
import Entity.Student;
import Entity.WeeklyPreferencies;

/*
 * 	es. di utilizzo
 * 		Student student = StudentBuilder.newBuilder("000").fullname("Mario", "Rossi").password("abc").build();
 */

public class StudentBuilder{

	//Matriculation number, used for login
	protected String userID;
	//Stored encrypted
	protected String password;
	protected String name;
	protected String surname;
	protected Profile profile;
	//Collection of favorite routes for the week
	protected WeeklyPreferencies weeklyPreferencies;
	//Collection of active lifts
	protected ArrayList<Lift> lifts;
	
	//Costruttore del builder
	public StudentBuilder(String userID) {
		this.userID = userID;
	}
	
	public static StudentBuilder newBuilder(String userID) {
		return new StudentBuilder(userID);
	}
	
	//Metodo che chiama correttamente il costruttore di Student
	public Student build() {
		return new Student(this.userID, this.password, this.name, this.surname, this.profile, this.weeklyPreferencies, this.lifts);
	}

	/*
	 *	Tutti i metodi necessari per l'utilizzo del pattern 
	 */
	public StudentBuilder password(String password) {
		this.password = password;
		return this;
	}

	public StudentBuilder fullname(String name, String surname) {
		this.name = name;
		this.surname = surname;
		return this;
	}
	
	public StudentBuilder profile(Profile profile) {
		this.profile = profile;
		return this;
	}

	public StudentBuilder weeklyPreferencies(WeeklyPreferencies weekly) {
		this.weeklyPreferencies = weekly;
		return this;
	}
	
	public StudentBuilder lifts(ArrayList<Lift> lifts) {
		this.lifts = lifts;
		return this;
	}
	
	
}
