package user;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		UserGroup users = new UserGroup();
		users.addSampleData();
		
		UserGroup admins = new UserGroup();
		
		Iterator<User> iterator = users.getIterator();
		
		while(iterator.hasNext()){
			User u = iterator.next();
			if (u.getUsertype().equals(UserType.admin))
				admins.addUser(u);
		}
		
		admins.printUsernames();
		
		admins.setUserType(UserType.user);
		
		admins.printUsernames();
	}
}
