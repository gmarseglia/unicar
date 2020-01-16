package Decorator;


public class EmptyFilter implements Filter{
	
	public EmptyFilter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getList() {
		// TODO Auto-generated method stub
		System.out.println("This is empty: ");
	}

}
