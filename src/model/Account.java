package model;

import java.time.LocalDate;
import java.util.Calendar;

  public abstract class Account implements ActionsAccount{
    	
    protected String number;
    protected double residue;
    protected LocalDate dateCreation;
    
    public Account(String number, double residue, LocalDate dateCreation){
    this.number=number;
    this.residue=residue;
    this.dateCreation=dateCreation;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public double getResidue() {
        return residue;
    }
}
