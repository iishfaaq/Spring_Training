package springdemo;

import java.util.ArrayList;

import org.springframework.core.SpringVersion;

import java.util.Optional;

public class MyApp {

	public static void main(String[] args) {
		
		Coach TheCoach = new BaseballCoach();
		
		
		System.out.println(TheCoach.getDailyWorkout());
		System.out.println(TheCoach.getDailyWorkout());
		System.out.println(TheCoach.getDailyWorkout());
		
		System.out.println("version: " + SpringVersion.getVersion());

		
	}

}
