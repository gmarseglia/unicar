package Entity;

//Non so se l'abstract ce sta
public abstract class User {
	//Matriculation number, used for login
	protected String userID;
	
	//Stored encrypted
	protected String password;
	
	//Only child classes can use this method(?)
	protected User(String userID, String password) {
		this.userID = userID;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
}
