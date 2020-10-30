package springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneTeller fortuneTeller;
	
	public BaseballCoach() {
		
	}
	
	public BaseballCoach(FortuneTeller fortuneTeller) {
		this.fortuneTeller = fortuneTeller;
	}

	@Override
	public String getDailyWorkout () {
		System.out.println(getDailyFortune());
		return "Spend 30 minitues on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneTeller.getFortune();
	}

}
