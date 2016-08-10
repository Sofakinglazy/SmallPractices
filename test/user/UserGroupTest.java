package user;

import junit.framework.TestCase;

public class UserGroupTest extends TestCase {

	public void testUserGroup(){
		UserGroup users = new UserGroup();
		users.addSampleData();
		
		User courtney = new User("cn3c", UserType.admin, "Courtney");
		
		assertEquals(9, users.size());
		users.removeFirstUser();
		assertEquals(8, users.size());
		users.removeLastUser();
		assertEquals(7, users.size());
		
		users.removeUser("ys2i");
		assertEquals(7, users.size()); // fail 
		
		users.removeUser("cn3c");
		assertEquals(6, users.size()); // success
		
		users.printUsernames();
		
	}
}
