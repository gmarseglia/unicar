import User.User;
import Filter.EmptyFilter;
import Filter.Filter;
import Restrictions.*;

public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.addAttribute("bravo");
		user.addAttribute("bello");
		
		System.out.println(user.toString());
		
//		Filter filter = new EmptyFilter();
//		
//		Filter filter = new Bellezza(new EmptyFilter());
		
		Filter filter = new Altezza(new EmptyFilter());
		
		System.out.println(filter.test(user));
		
	}
}
