package com.epam.CleanCode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.epam.CleanCode.SimpleAndCompoundInterest;

public class SimpleAndCompoundInterest {
	private static Logger logger = LogManager.getLogger(SimpleAndCompoundInterest.class);
	float principleAmount, rateOfInterest;
	int time;
	public SimpleAndCompoundInterest(float principleAmount, float rateOfInterest, int time) {
		super();
		this.principleAmount = principleAmount;
		this.rateOfInterest = rateOfInterest;
		this.time = time;
	}
	float simpleInterest() {
		logger.info("It is a method to calculate SIMPLE INTEREST");
		return ((principleAmount * rateOfInterest * time) / 100);
	}
	float compoundInterest() {
		logger.info("It is a method to calculate COMPOUND INTEREST");
		float q = 1 + (rateOfInterest / 100);
		return principleAmount * (float)Math.pow(q, time);
	}
}
