package Restrictions;

import Filter.Filter;
import Filter.RestricionDecorator;
import User.User;

public class Bellezza extends RestricionDecorator{

	public Bellezza(Filter actualFilter) {
		super(actualFilter);
	}
	
	@Override
	public boolean test(User user) {
		return actualFilter.test(user) && this.testBellezza(user);
	}
	
	private boolean testBellezza(User user) {
		return user.hasAttribute("bello");
	}
	
}
