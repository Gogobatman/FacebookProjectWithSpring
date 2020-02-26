package spring.facebook;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ProfileInterface profile = context.getBean("programmersProfile",ProfileInterface.class);
		System.out.println(profile.profileInformationDisplay());
		profile.sendFriendsRequest();
		context.close();
	}

}
