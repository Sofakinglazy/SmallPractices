package smartcard;

public class SmartCard {
	private String name;
	private boolean isStaff;
	
	public SmartCard(String name){
		this.name = name;
	}
	
	public void setStaff(boolean isStaff){
		this.isStaff = isStaff;
	}
	
	public boolean isStaff(){
		return isStaff;
	}

	public String getOwner(){
		return name;
	}
}
