package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;

	// define a constructor for a dependency injection
	public BaseballCoach(FortuneService theFortuneService) {

		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkOut() {

		return "Spend 30 minutes on batting practise";

	}

	@Override
	public String getDailyFortune() {

		// use my fortuneService to get a fortune
		return fortuneService.getFortune();

	}

}
