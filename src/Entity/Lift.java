package Entity;

public class Lift {
	private String liftID;
	private StudentCar driver;
	private String note;
	private Route route;
	private Message[] messages;
	
	public void Lift(String liftID, String note, Route route, StudentCar driver) {
		this.liftID = liftID;
		this.note = note;
		this.route = route;
		this.driver = driver;
	}

	public Message[] getMessages() {
		return messages;
	}

	public void setMessages(Message[] messages) {
		this.messages = messages;
	}

	public String getLiftID() {
		return liftID;
	}

	public StudentCar getDriver() {
		return driver;
	}

	public String getNote() {
		return note;
	}

	public Route getRoute() {
		return route;
	}
	
	
}
