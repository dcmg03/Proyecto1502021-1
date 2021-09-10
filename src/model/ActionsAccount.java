package model;

public interface ActionsAccount {
	
	public abstract void deposti(double residue);
	
	public abstract boolean retirement(double retiro);
	
	public static void main(String[] args)  {
		
		ManagementAccount h = new ManagementAccount();
		EtypeAccount a = EtypeAccount.CURRENT;
		EtypeAccount b = EtypeAccount.DEPOSIT;
		
		String [] j = new String[2];
		j [0] = "dfghjkl";
		j [1] = "456";
		
		String [] l = new String[2];
//		# de cuenta
		l [0] = "plkjhgfd";
//		Saldo
		l [1] = "0987";
		
		String [] p = new String[2];
		p [0] = "zdfvbhyjmk";
		p [1] = "6458593";
		
		System.out.println("AÑADIR " + h.addAccount(a, j));
		System.out.println("AÑADIR " + h.addAccount(b, l));
		System.out.println("AÑADIR " + h.addAccount(b, p));
	    System.out.println("BUSCAR" + h.findAccount("plkjhgfd"));
	}
}
