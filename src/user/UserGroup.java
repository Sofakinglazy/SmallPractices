package user;

import java.util.ArrayList;
import java.util.Iterator;

public class UserGroup {

	private ArrayList<User> users;
	
	public UserGroup(){
		users = new ArrayList<>();
	}
	
	public void addSampleData(){
		User lewis = new User("yx5m", UserType.admin, "Lewis");
		User joyce = new User("jc4c", UserType.user, "Joyce");
		User courtney = new User("cn3c", UserType.admin, "Courtney");
		User phil = new User("ph1m", UserType.user, "Phil");
		User chris = new User("ci5s", UserType.user, "Chris");
		User anne = new User("xy4m", UserType.editor, "Anne");
		User hanna = new User("ha2i", UserType.editor, "Hanna");
		User powell = new User("po1m", UserType.editor, "Powell");
		User john = new User("jo5m", UserType.user, "John");
		
		users.add(lewis);
		users.add(powell);
		users.add(anne);
		users.add(courtney);
		users.add(joyce);
		users.add(john);
		users.add(hanna);
		users.add(chris);
		users.add(phil);	
	}
	
	public void addUser(User u){
		users.add(u);
	}
	
	public User getUser(int index){
		return users.get(index);
	}
	
	public void setUserType(UserType userType){
		for (User u : users){
			u.setUsertype(userType);
		}
	}
	
	public int size(){
		return users.size();
	}
	
	public void removeFirstUser(){
		if (users.isEmpty()) return;
		
		users.remove(0);
	}
	
	public void removeLastUser(){
		if (users.isEmpty()) return;
		
		int last = users.size() - 1;
		users.remove(last);
	}
	
	public void removeUser(String username){
		if (users.isEmpty()) return;
		
		ArrayList<User> delete = new ArrayList<>(); 
		
		for (User u : users){
			if (u.getUsername().equals(username)) delete.add(u);
		}
		
		users.removeAll(delete);
	}
	
	public Iterator<User> getIterator(){
		return users.iterator();
	}
	
	public void printUsernames(){
		
		for (User u : users){
			System.out.println(u.getUsername() + " " + u.getUsertype().toString());
		}
	}
}
