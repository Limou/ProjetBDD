package data;

public class Cloth extends Product{
	private String size;
	private String color;
	
	public Cloth(){
		super();
		this.size = new String();
		this.color = new String();
	}
	public Cloth(String name, String size, String color){
		super(name, false);
		this.size = size; 
		this.color = color;
	}
	
	public void setSize(String size){ this.size = size; }
	public void setColor(String color){ this.color = color; }
	
	public String getSize(){ return this.size; }
	public String getColor(){ return this.color; }
}
