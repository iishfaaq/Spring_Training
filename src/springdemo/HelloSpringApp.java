package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach2",Coach.class);
		CricketCoach cricketCoach = context.getBean("cricketCoach",CricketCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getEmailAddress());
		System.out.println(cricketCoach.getName());
		
		
		CricketCoach cricketCoach2 = context.getBean("cricketCoach2",CricketCoach.class);
		System.out.println(cricketCoach2.getDailyWorkout());
		System.out.println(cricketCoach2.getEmailAddress());
		System.out.println(cricketCoach2.getName());
		
		//context.close();

	}

}
