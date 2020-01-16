package Restrictions;

import Filter.Filter;
import Filter.RestricionDecorator;
import User.User;

public class Altezza extends RestricionDecorator{

	public Altezza(Filter actualFilter) {
		super(actualFilter);
	}
	
	@Override
	public boolean test(User user) {
		return actualFilter.test(user) && this.testBellezza(user);
	}
	
	private boolean testBellezza(User user) {
		return user.hasAttribute("alto");
	}
	
}
