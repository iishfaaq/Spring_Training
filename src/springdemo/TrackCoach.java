package springdemo;

public class TrackCoach implements Coach {

	private FortuneTeller fortuneTeller;
	
	
	public TrackCoach(FortuneTeller fortuneTeller) {
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

}
