package user;

public class User {
	private String username;
	private UserType usertype;
	private String name;
	
	public User(String username, UserType usertype, String name) {
		this.username = username;
		this.usertype = usertype;
		this.name = name;
	}

	public UserType getUsertype() {
		return usertype;
	}

	public void setUsertype(UserType usertype) {
		this.usertype = usertype;
	}

	public String getUsername() {
		return username;
	}

	public String getName() {
		return name;
	}
	
	public String toString(){
		return name + ", " + username + ", " + usertype.toString();
	}
}
