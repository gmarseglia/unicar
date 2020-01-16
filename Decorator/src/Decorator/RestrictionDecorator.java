package Decorator;

public abstract class RestrictionDecorator implements Filter{

	protected Filter newFilter;
	
	public RestrictionDecorator(Filter newFilter) {
		this.newFilter = newFilter;
	}
	
	@Override
	public void getList() {
		newFilter.getList();
	}
	
}
