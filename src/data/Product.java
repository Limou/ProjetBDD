package data;

public class Product {
	protected String name;
	protected float price;
	protected int pack;
	boolean type;
	
	public Product(){
		this.name = new String();
		this.price = 0;
		this.pack = 0;
	}
	public Product(String name, float price, int pack, boolean type){
		this.name = name;
		this.price = price;
		this.pack = pack;
		this.type = type;
	}
	
	public void setName( String name ){ this.name = name; }
	public void setPrice( float price ){ this.price = price; }
	public void setPack( int pack ){ this.pack = pack; }
	public void setType( boolean type ){ this.type = type; }
	
	public String getName(){ return this.name; }
	public float getPrice(){ return this.price; }
	public int getPack(){ return this.pack; }
	public boolean getType(){ return this.type; }
}