package com.cap.entities;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

	
	@Entity
	@Table(name="loandisbursal")
	public class LoanDisbursal  {
	
		    @Id
		    private String loanRequestId;
		
			private String accountId;
			
			private double loanAmount;
			
			private double loan_amount_paid;
			
			private Date loan_due_date;
			
			private String loanType;
			
			private double loanEmi;
			
			private int loanTenure;
			
			
			
		
			public String getAccountId() {
				return accountId;
			}
			public void setAccountId(String accountId) {
				this.accountId = accountId;
			}
			public double getLoanAmount() {
				return loanAmount;
			}
			public void setLoanAmount(double loanAmount) {
				this.loanAmount = loanAmount;
			}
			public int getLoanTenure() {
				return loanTenure;
			}
			public void setLoanTenure(int loanTenure) {
				this.loanTenure = loanTenure;
			}
			
			
			public String getLoanType() {
				return loanType;
			}
			public void setLoanType(String loanType) {
				this.loanType = loanType;
			}
			public double getloanEmi() {
				return loanEmi;
			}
			public void setloanEmi(double loanEmi) {
				this.loanEmi = loanEmi;
			}
			public String getLoanRequestId() {
				return loanRequestId;
			}
			public void setLoanRequestId(String loanRequestId) {
				this.loanRequestId = loanRequestId;
			}
			
			 
			public double getLoan_amount_paid() {
				return loan_amount_paid;
			}
			public void setLoan_amount_paid(double loan_amount_paid) {
				this.loan_amount_paid = loan_amount_paid;
			}
			public Date getLoan_due_date() {
				return loan_due_date;
			}
			public void setLoan_due_date(Date loan_due_date) {
				this.loan_due_date = loan_due_date;
			}
			 @Override
			    public boolean equals(Object o) {
			        if (this == o) return true;
			        if (o == null || getClass() != o.getClass()) return false;
			        LoanDisbursal customer = (LoanDisbursal) o;
			        return loanRequestId == customer.loanRequestId;
			    }

			    @Override
			    public int hashCode() {
			        return Objects.hash(loanRequestId);
			    }
			    
			    
			   

	}
