package com.investmentapp.repository;

import java.util.List;

import com.investmentapp.model.Investment;

public interface IInvestmentRepository {

	void addInvestment(Investment investment);
	void updateInvestment(int planId, double amount);
	void deleteInvestment(int planId);

	List<Investment> findByType(String type);
	List<Investment> findByPurpose(String purpose);
	List<Investment> findByRiskAndTerm(String risk,int term);
	List<Investment> findall();

	
	Investment findById(int planId);
	// double calculateMaturity(Investment investment);
}
