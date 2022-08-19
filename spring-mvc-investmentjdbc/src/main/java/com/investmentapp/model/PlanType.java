package com.investmentapp.model;

public enum PlanType {

	
	mutual("Mutual Fund"),
	ppf("Public Provident Fund"),
	ulip("Unit limited Investment Plan"),
	senior("Senior pension  scheme"),
	fd("Fixed deposit");
	public String type;
	
	private PlanType(String planType) {
		this.type = planType;
	}
	
}
