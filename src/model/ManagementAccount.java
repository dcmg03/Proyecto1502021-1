package model;

import java.time.LocalDate;
import java.util.ArrayList;


public class ManagementAccount{
 
	public Account account;
	public ArrayList <Account> Accounts;
	public ArrayList <CheckBook> checkBooks;
	
	public ManagementAccount() {
		super();
		Accounts = new ArrayList <>();
	}

	public double deposity (String number, double residue) {
		Account bus = findAccount(number);
		bus.deposti(residue);
		return bus.getResidue();
	}
//	retirar plata
	public boolean retirement(String number, double residue) {
		Account bus = findAccount(number);
		boolean p = bus.retirement(residue);
		if (p) {
			return true;
		}
		return false;
	}
//	
	public Account findAccount(String number) {
		for (Account accs : Accounts) {
            if ( accs.getNumber().equals( number ) ) {
                return accs;
            }
        }
        return null;
	}
	
//	Añadir cuenta nueva
	public boolean addAccount (EtypeAccount etypeAccount ,String data[]) {
		int cont = 0;
		double residue = Double.parseDouble(data[1]);
		String number = data[0];
		Account k = null;
		
		if(etypeAccount.equals(EtypeAccount.CURRENT)) {
			k = new CurrentAccount(number, residue, LocalDate.now(), 2000);
		}else {
			k = new DepositAccount(number, residue, LocalDate.now(), 10000);
		}
//		Añadir cuenta si esta  no existe 
		if(Accounts.isEmpty()) {
			Accounts.add(k);
			System.out.println("AÑADIDO");
		    return true;
		}else 
//			Si la cuenta ya existe no la añade 
		if (findAccount(number) == null) {
			Accounts.add(k);
			System.out.println("AÑADIDO");
		    return true;
		}else {
			return false;
		}
	}
	
	public ArrayList<Account> getAcounts(){
		return Accounts;
	}
	
	public boolean addChaeckBook(String number, String numberFrom, String numberTo) {
		return false;
	}
	
	public double getAverageAccounts () {
		return 0;
	}
	
}
