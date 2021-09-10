package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class CurrentAccount extends Account{
	
    public CheckBook checkBook;
	private double overdraft;
    private ArrayList <CheckBook> CheckBooks;
    
    public CurrentAccount() {
    	super();
    }
    
    public CurrentAccount(String number, double residue, LocalDate dateCreation, double overdraft) {
        super(number, residue, dateCreation);
        this.overdraft=overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
    
    public boolean addCheckBook(String message, String message1){
        return false;
    }
    
    public ArrayList<CheckBook> getCheckBooks(){
		return CheckBooks;
    }

	@Override
//	depositar en la cuenta 
	public void deposti(double residue) {
		double sd = (getResidue() + residue);
		setResidue(sd);
	}

	@Override
//	Sobregiro de 2000
	public boolean retirement(double retiro) {
		if(getResidue() > 0) {
			double saldo = (getResidue() - (retiro + getOverdraft()));
			setResidue(saldo);
			return true;
		}else {
			return false;
		}
	}

}
