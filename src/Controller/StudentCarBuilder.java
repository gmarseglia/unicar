package Controller;

import java.util.ArrayList;

import Entity.CarInfo;
import Entity.Report;
import Entity.StudentCar;

public class StudentCarBuilder extends StudentBuilder{


	private int rating;
	private CarInfo carInfo;
	private ArrayList<Report> reports;
	
	public StudentCarBuilder(String userID) {
		super(userID);
	}
	
	public static StudentCarBuilder newBuilder(String userID) {
		return new StudentCarBuilder(userID);
	}
	
	public StudentCar Build() {
		return new StudentCar(this.userID, this.password, this.name, this.surname, this.profile, this.weeklyPreferencies, this.lifts, this.rating, this.carInfo, this.reports);
	}
	
	//aggiungere i metodi del builder
	
	
	
}
