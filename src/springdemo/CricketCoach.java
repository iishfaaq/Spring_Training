package springdemo;

public class CricketCoach implements Coach {

	private FortuneTeller fortuneTeller;
	private String name;
	private String emailAddress;
	


	@Override
	public String getDailyWorkout () {
		System.out.println(getDailyFortune());
		return "Spend 30 minitues on cricket practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneTeller.getFortune();
	}

	public FortuneTeller getFortuneTeller() {
		return fortuneTeller;
	}

	public void setFortuneTeller(FortuneTeller fortuneTeller) {
		this.fortuneTeller = fortuneTeller;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
