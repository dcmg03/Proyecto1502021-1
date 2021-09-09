package model;

import java.util.ArrayList;

public class ManagementAccount{
 
	public Account account;
	public ArrayList <Account> Accounts;
	
    private int consignarCorriente;
    private boolean cuenta;
	private int consignarAhorros;
	
	EtypeAccount actual = EtypeAccount.CURRENT;
	EtypeAccount deposito = EtypeAccount.DEPOSIT;
	
	public ManagementAccount() {
		super();
		Accounts = new ArrayList <>();
	}

	/**
	 * @return the consignarCorriente
	 */
	public int getConsignarCorriente() {
		return consignarCorriente;
	}

	/**
	 * @param consignarCorriente the consignarCorriente to set
	 */
	public void setConsignarCorriente(int consignarCorriente) {
		this.consignarCorriente = consignarCorriente;
	}

	/**
	 * @return the cuentaR0739
	 */
	public boolean isCuenta() {
		return cuenta;
	}

	/**
	 * @param cuentaR0739 the cuentaR0739 to set
	 */
	public void setCuenta(boolean cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * @return the consignarAhorros
	 */
	public int getConsignarAhorros() {
		return consignarAhorros;
	}

	/**
	 * @param consignarAhorros the consignarAhorros to set
	 */
	public void setConsignarAhorros(int consignarAhorros) {
		this.consignarAhorros = consignarAhorros;
	}

	public double deposity (String number, double residue) {
		
		if (account  )
		
		return 0;
	}
	
	public boolean retirement(String number, double residue) {
		return false;
	}
	
	public Account findAccount(String number) {
		return null;
	}
	
	
	public boolean addAccount (EtypeAccount etypeAccount ,String number) {
		int cont = 0;
		
		ArrayList <Account> cuenta = Accounts;
		
		for (Account a : cuenta) {
			if (a.getNumber().equals(ManagementAccount.this))cont ++;
		}
		
		if (cont == 1) {
			account.add(new Account(number, residue, localDate));
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
