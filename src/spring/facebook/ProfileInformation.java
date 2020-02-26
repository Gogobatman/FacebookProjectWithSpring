package spring.facebook;

public class ProfileInformation {
	String name;
	String surname;
	String birthDate;
	String joinDate;
	String relationshipStatus;
	String location;
	int mutualFriends;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setSurname(String surname) {
		this.surname=surname;
	}
	public String getSurname() {
		return surname;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate=birthDate;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate=joinDate;
	}
	public String getJoinDate() {
		return joinDate;
	}
	public void setRelationshipStatus(String relationshipStatus) {
		this.relationshipStatus=relationshipStatus;
	}
	public String getRelationshipStatus() {
		return relationshipStatus;
	}
	public void setLocation(String location) {
		this.location=location;
	}
	public String getLocation() {
		return location;
	}
	public void setMutualFriends(int mutualFriends) {
		this.mutualFriends=mutualFriends;
	}
	public int getMutualFriends() {
		return mutualFriends;
	}
	public String writeProfileInformation() {
		return("Profile name: " +getName()+" "+getSurname()
				+"\nBirth date: " +getBirthDate()+"\nJoin date: " + getJoinDate()
				+"\nRelationship status: " + getRelationshipStatus()
				+"\nLocation: " + getLocation()
				+"\nMutual friends: " + getMutualFriends());
	}
}


