package model;

import java.time.LocalDate;

public class DepositAccount extends Account{
	
    private int minResidue;
    private float INTEREST_RATE;
    
    public DepositAccount() {
    }
    
    public DepositAccount(String number, double residue, LocalDate dateCreation, int minResidue) {
        super(number, residue, dateCreation);
        this.minResidue=minResidue;
        this.INTEREST_RATE= (float) 0.05;
    }

	/**
	 * @return the minResidue
	 */
	public int getMinResidue() {
		return minResidue;
	}

	/**
	 * @param minResidue the minResidue to set
	 */
	public void setMinResidue(int minResidue) {
		this.minResidue = minResidue;
	}
    
    public double calculateInterest() {
		return INTEREST_RATE;
    }

	@Override
	public void deposti(double residue) {
		
	}

	@Override
	public boolean retirement() {
		// TODO Auto-generated method stub
		return false;
	}
    
}
