package com.springdemo;

import java.util.ArrayList;
import java.util.Optional;

public class MyApp {

	public static void main(String[] args) {
		
		Coach TheCoach = new BaseballCoach();
		Coach TheCoach2 = new TrackCoach();
		
		
		System.out.println(TheCoach.getDailyWorkout());
		System.out.println(TheCoach2.getDailyWorkout());
		System.out.println(TheCoach2.getDailyWorkout());

		
	}

}
