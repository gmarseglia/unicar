package User;

import java.util.ArrayList;

public class User {
	
	private ArrayList<String> attributes;
	
	public User() {
		this.attributes = new ArrayList<String>();
	}
	
	public User(ArrayList<String> attributes) {
		this.setAttributes(attributes);
	}
	
	public ArrayList<String> getAttributes(){
		return this.attributes;
	}
	
	public void setAttributes(ArrayList<String> attributes) {
		this.attributes = attributes;
	}
	
	public boolean hasAttribute(String attribute) {
		for(String userAttributes : this.attributes) {
			if(attribute.toUpperCase().equals(userAttributes.toUpperCase())) {
				return true;
			}
		}
		return false;
	}
	
	public void addAttribute(String attribute) {
		this.attributes.add(attribute);
	}
	
	@Override
	public String toString() {
		String text = "User has: ";
		for(String actualString : this.attributes) {
			text = text + actualString + ", ";
		}
		return text;
	}
}
