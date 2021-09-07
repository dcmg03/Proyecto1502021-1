package model;

import java.time.LocalDate;

public class CurrentAccounnt extends Account{
    private double overdraft;
    public CurrentAccounnt(String number, double residue, LocalDate dateCreation, double overdraft) {
        super(number, residue, dateCreation);
        this.overdraft=overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
    public void addCheckBook(String message, String message1){
        //boolean
    }
}
