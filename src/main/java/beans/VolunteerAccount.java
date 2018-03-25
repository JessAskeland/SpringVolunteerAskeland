package beans;

import java.util.Date;

public class VolunteerAccount {
	private long id;
	private String volunteerName;
	private double hourBalance;
	private Date accessTime;
	private boolean locked;
	
	public VolunteerAccount() {
		
	}
	
	public VolunteerAccount(long id, String volunteerName, double hourBalance) {
		this.id = id;
		this.volunteerName = volunteerName;
		this.hourBalance = hourBalance;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getVolunteerName() {
		return volunteerName;
	}

	public void setVolunteerName(String volunteerName) {
		this.volunteerName = volunteerName;
	}

	public double getHourBalance() {
		return hourBalance;
	}

	public void setHourBalance(double hourBalance) {
		this.hourBalance = hourBalance;
	}

	public Date getAccessTime() {
		return accessTime;
	}

	public void setAccessTime(Date accessTime) {
		this.accessTime = accessTime;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}
	

}
