package Filter;

import User.User;

public class RestricionDecorator implements Filter {
	
	protected Filter actualFilter;
	
	public RestricionDecorator(Filter actualFilter) {
		this.actualFilter = actualFilter;
	}

	@Override
	public boolean test(User user) {
		return actualFilter.test(user);
	}

}
