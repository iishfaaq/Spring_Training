package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeMainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext2.xml");
		
		TrackCoach Coach = context.getBean(TrackCoach.class);
		
		TrackCoach Coach2 = context.getBean(TrackCoach.class);
		
		context.close();

	}

}
