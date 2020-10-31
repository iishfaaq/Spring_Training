package springdemo;

public class TrackCoach implements Coach {

	private FortuneTeller fortuneTeller;
	
	
	public TrackCoach(FortuneTeller fortuneTeller) {
		System.out.println("I am inside the constructor of TrackCoach");
		this.fortuneTeller = fortuneTeller;
		
	}


	@Override
	public String getDailyWorkout() {
		System.out.println(getDailyFortune());
		return "Run Hard 5k";
	}


	@Override
	public String getDailyFortune() {
		return fortuneTeller.getFortune();
	}
	
	
	
	public void initMethod() {
		
		System.out.println("I am inside the initilizing method");
	}
	
	public void destroyMethod() {
		
		System.out.println("I am inside the destroy method");
	}

}
