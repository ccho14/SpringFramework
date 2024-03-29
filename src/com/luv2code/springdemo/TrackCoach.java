package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {

	}

	@Override
	public String getDailyWorkOut() {

		return "Run a hard 5k";

	}

	@Override
	public String getDailyFortune() {

		return "Just Do It: " + fortuneService.getFortune();
	}

}
