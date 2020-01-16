package application;

public class Student extends User {
	private String name;
	private String surname;
	private Profile profile;
	private WeeklyPreferencies weeklyPreferencies;
	private Lift[] lifts;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Profile getProfile() {
		return profile;
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

	public Lift[] getLifts() {
		return lifts;
	}

	public void setLifts(Lift[] lifts) {
		this.lifts = lifts;
	}

	public Student(String name, String surname, Profile profile, WeeklyPreferencies weeklyPreferencies, Lift[] lifts) {
		super();
		this.name = name;
		this.surname = surname;
		this.profile = profile;
		this.weeklyPreferencies = weeklyPreferencies;
		this.lifts = lifts;
	}
		
}
