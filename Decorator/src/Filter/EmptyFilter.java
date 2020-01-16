package Filter;

import User.User;

public class EmptyFilter implements Filter{

	public EmptyFilter() {
		
	}

	@Override
	public boolean test(User user) {
		return true;
	}
	
	
}
