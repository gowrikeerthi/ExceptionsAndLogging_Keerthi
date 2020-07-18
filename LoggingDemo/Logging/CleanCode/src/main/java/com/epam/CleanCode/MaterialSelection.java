package com.epam.CleanCode;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MaterialSelection {
	private static Logger logger = LogManager.getLogger(MaterialSelection.class);
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		logger.info("Choose material standard to build your house");
		logger.info("1. Standard materials(Cost 1200 INR per square feet)");
		logger.info("2. Above standard materials(Cost 1500 INR per square feet)");
		logger.info("3. High Standard material(Cost 1800 INR per square feet)");
		logger.info("Enter your choice in integer: ");
		int choice = sc.nextInt();
		logger.info(choice);
		float costPerSquareFeet = 0;
		if(choice >= 1 && choice <= 3) {
			if(choice == 1) 
				costPerSquareFeet = 1200;
			else if(choice == 2)
				costPerSquareFeet = 1500;
			else if(choice == 3) {
				logger.info("Do you need fully automated house(Cost 2500 INR per square feet");
				logger.info("Enter true or false : ");
				boolean automatedHouse = sc.nextBoolean();
				logger.info(automatedHouse);
				if(automatedHouse)
					costPerSquareFeet = 2500;
				else
					costPerSquareFeet = 1800;
			}
			logger.info("Enter area of house in square feet : ");
			float area = sc.nextFloat();
			logger.info(area);
			TotalCost tc = new TotalCost(costPerSquareFeet, area);
			logger.info("Total cost is : " + tc.costCalculation());
		}
		else {
			logger.error("Your choice is invalid!!!");
		}
		logger.info("End of main method" + "\n\n");
		sc.close();
	}

}
