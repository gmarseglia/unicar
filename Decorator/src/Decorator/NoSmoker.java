package Decorator;

public class NoSmoker extends RestrictionDecorator {

	public NoSmoker(Filter newFilter) {
		super(newFilter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getList() {
		newFilter.getList();
		System.out.println("No Smokers Allowed");
	}
}
