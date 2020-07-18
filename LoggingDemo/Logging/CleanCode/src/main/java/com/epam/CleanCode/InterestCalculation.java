package com.epam.CleanCode;
import java.util.*;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class InterestCalculation {
	private static Logger logger = LogManager.getLogger(InterestCalculation.class);
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		logger.info("<---------SIMPLE AND COMPOUND INTEREST CALCULATION----------->");
		logger.info("Enter principle amount : ");
		float principleAmount = sc.nextFloat();
		logger.info(principleAmount);
		logger.info("Enter rate of interest : ");
		float rateOfInterest = sc.nextFloat();
		logger.info(rateOfInterest);
		logger.info("Enter period of time : ");
		int time = sc.nextInt();
		logger.info(time);
		SimpleAndCompoundInterest sac = new SimpleAndCompoundInterest(principleAmount, rateOfInterest, time);
		float simpleInterest = sac.simpleInterest();
		logger.info("Simple interest : " + simpleInterest);
		float compoundInterest = sac.compoundInterest();
		logger.info("Compound interest : " + compoundInterest);
		logger.info("End of main method\n\n");
		sc.close();

	}

}
