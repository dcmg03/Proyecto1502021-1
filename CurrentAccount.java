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
	public void deposti(double residue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean retirement() {
		// TODO Auto-generated method stub
		return false;
	}

}
