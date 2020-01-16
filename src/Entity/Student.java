package Entity;

import java.util.ArrayList;

public class Student extends User {

	protected String name;
	protected String surname;
	protected Profile profile;
	
	//Collection of favorite routes for the week
	protected WeeklyPreferencies weeklyPreferencies;
	

	//Collection of active lifts
	protected ArrayList<Lift> lifts;
	
	//Used in the RegistrationController, da mettere in una factory
	public Student(String userID, String password, String name, String surname) {
		super(userID, password);
		this.setName(name);
		this.setSurname(surname);
	}
	
	//Generated
	protected Student(String userID, String password, String name, String surname, Profile profile,
			WeeklyPreferencies weeklyPreferencies, ArrayList<Lift> lifts) {
		super(userID, password);
		this.name = name;
		this.surname = surname;
		this.profile = profile;
		this.weeklyPreferencies = weeklyPreferencies;
		this.lifts = lifts;
	}

	//Used in removeCar in SetCarInfoController, da mettere in una factory
	public Student(StudentCar studentCar) {
		this(studentCar.userID, studentCar.password, studentCar.name, studentCar.surname, studentCar.profile, studentCar.weeklyPreferencies, studentCar.lifts);
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Profile getProfile() {
		return this.profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public WeeklyPreferencies getWeeklyPreferencies() {
		return weeklyPreferencies;
	}

	public void setWeeklyPreferencies(WeeklyPreferencies weeklyPreferencies) {
		this.weeklyPreferencies = weeklyPreferencies;
	}

	public ArrayList<Lift> getLifts() {
		return this.lifts;
	}

	public void setLifts(ArrayList<Lift> lifts) {
		this.lifts = lifts;
	}
		
}
