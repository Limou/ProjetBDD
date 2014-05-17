package data;

public class Address {
	private int number;
	private String street;
	private int postalCode;
	private String country;
	
	public Address(){
		this.number = 0;
		this.street = new String();
		this.postalCode = 0;
		this.country = new String();
	}
	public Address(int number, String street, int postalCode, String country){
		this.number = number;
		this.street = street;
		this.postalCode = postalCode;
		this.country = country;
	}
	
	public void setNumber(int number){ this.number = number; }
	public void setStreet(String street){ this.street = street; }
	public void setPostalCode(int postalCode){ this.postalCode = postalCode; }
	public void setCountry(String country){ this.country = country; }
	
	public int getNumber(){ return this.number; }
	public String getStreet(){ return this.street; }
	public int postalCode(){ return this.postalCode; }
	public String getCountry(){ return this.country; }
}
