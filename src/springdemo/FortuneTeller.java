package springdemo;

public class FortuneTeller implements Fortune {

	
	public FortuneTeller() {
		System.out.println("I am inside the constructor of FortuneTeller");
	}

	@Override
	public String getFortune() {
		return "You have a very good Day";

	}

}
