package com.investmentapp.service;

import java.util.List;

import com.investmentapp.exceptions.PlanNotFoundExceptions;
import com.investmentapp.model.Investment;

public interface IInvestmentService {
	
void addInvestment(Investment investment);
void updateInvestment(int planId, double amount) throws PlanNotFoundExceptions;
void deleteInvestment(int planId);

List<Investment> getByType(String type);
List<Investment> getByPurpose(String purpose);
List<Investment> getByRiskAndTerm(String risk,int term);
List<Investment> getAll();

double calculateMaturity(Investment investment);
Investment getById(int planId) throws PlanNotFoundExceptions;
}
