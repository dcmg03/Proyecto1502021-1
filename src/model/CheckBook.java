package model;

public class CheckBook {
	
	private String numberFrom; 
	private String numberTo;
	
	
	public CheckBook(String numberFrom, String numberTo) {
		super();
		this.numberFrom = numberFrom;
		this.numberTo = numberTo;
	}


	/**
	 * @return the numberFrom
	 */
	public String getNumberFrom() {
		return numberFrom;
	}


	/**
	 * @param numberFrom the numberFrom to set
	 */
	public void setNumberFrom(String numberFrom) {
		this.numberFrom = numberFrom;
	}


	/**
	 * @return the numberTo
	 */
	public String getNumberTo() {
		return numberTo;
	}


	/**
	 * @param numberTo the numberTo to set
	 */
	public void setNumberTo(String numberTo) {
		this.numberTo = numberTo;
	}
	
	
}