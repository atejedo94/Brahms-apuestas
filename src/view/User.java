package view;

public class User {
	
	private int currentMoney, myEarnings, myLosts, timesIWon,timesILost;
	private String user,password;
	private boolean admin;

	
	
	
	public User(int currentMoney, int myEarnings, int myLosts, int timesIWon,
			int timesILost, String user, String password, boolean admin) {
		this.currentMoney = currentMoney;
		this.myEarnings = myEarnings;
		this.myLosts = myLosts;
		this.timesIWon = timesIWon;
		this.timesILost = timesILost;
		this.user = user;
		this.password = password;
		this.admin = admin;
	}
	public int getCurrentMoney() {
		return currentMoney;
	}
	public void setCurrentMoney(int currentMoney) {
		this.currentMoney = currentMoney;
	}
	public int getMyEarnings() {
		return myEarnings;
	}
	public void setMyEarnings(int myEarnings) {
		this.myEarnings = myEarnings;
	}
	public int getMyLosts() {
		return myLosts;
	}
	public void setMyLosts(int myLosts) {
		this.myLosts = myLosts;
	}
	public int getTimesIWon() {
		return timesIWon;
	}
	public void setTimesIWon(int timesIWon) {
		this.timesIWon = timesIWon;
	}
	public int getTimesILost() {
		return timesILost;
	}
	public void setTimesILost(int timesILost) {
		this.timesILost = timesILost;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [currentMoney=" + currentMoney + ", myEarnings="
				+ myEarnings + ", myLosts=" + myLosts + ", timesIWon="
				+ timesIWon + ", timesILost=" + timesILost + ", user=" + user
				+ ", password=" + password + "]";
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	
	

}
