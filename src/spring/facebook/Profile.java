package spring.facebook;

public class Profile implements ProfileInterface{
	private ProfileInformation profileInformation;
	
	@Override
	public String profileInformationDisplay() {
		return(profileInformation.writeProfileInformation());
	}
	@Override
	public void sendFriendsRequest() {
		System.out.print("Friends request sent! ");
		if(profileInformation.mutualFriends>=10) {
			System.out.println("You might actually know that person");
		}else if (profileInformation.mutualFriends<10) {
			System.out.println("You probably don't know that person");
		}
	}
	public void setProfileInformation(ProfileInformation profileInformation) {
		this.profileInformation=profileInformation;
	}
}
