package Decorator;

public class NoIdiots extends RestrictionDecorator{

	public NoIdiots(Filter newFilter) {
		super(newFilter);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void getList() {
		newFilter.getList();
		System.out.println("No idiots allowed");
	}

}
