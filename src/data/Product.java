package data;

public class Product {
	protected String name;
	boolean type;
	
	public Product(){}
	public Product(String name, boolean type){
		this.name = name;
		this.type = type;
	}
	
	public void setName( String name ){ this.name = name; }
	public void setType( boolean type ){ this.type = type; }
	
	public String getName(){ return this.name; }
	public boolean getType(){ return this.type; }
}