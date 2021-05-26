package com.learn.springAnnotations;

import org.springframework.stereotype.Component;

@Component("theTennisCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Practice Serving 30 minutes";
	}

}
