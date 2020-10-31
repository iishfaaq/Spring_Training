package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeMainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext2.xml");
		
		TrackCoach Coach = context.getBean(TrackCoach.class);
		
		TrackCoach Coach2 = context.getBean(TrackCoach.class);
		
		BaseballCoach Coach3 = context.getBean(BaseballCoach.class);
		
		BaseballCoach Coach4 = context.getBean(BaseballCoach.class);
		
		boolean res = (Coach == Coach2);
		boolean res2 = (Coach3 == Coach4);
		
		System.out.println(res);  // this will be true because scope of the trackcoach is singleton by default
		System.out.println(Coach); 
		System.out.println(Coach2); 
		System.out.println(res2); // this will be false because we changed the scope of the BaseballCoach is prototype 
								  // Which will create multiple objects
		System.out.println(Coach3); 
		System.out.println(Coach4); 
		
		context.close(); //Destroy method will be call after the context.close call

	}

}
