package com.epam.CleanCode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class TotalCost {
	private static Logger logger = LogManager.getLogger(TotalCost.class);
	float costPerSquareFeet, area;
	public TotalCost(float costPerSquareFeet, float area) {
		super();
		this.costPerSquareFeet = costPerSquareFeet;
		this.area = area;
	}
	float costCalculation() {
		logger.info("method to calculate cost for construction");
		return costPerSquareFeet * area;
	}
}
