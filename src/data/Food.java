package data;

import java.sql.Date;

public class Food extends Product{
	private Date dlc;
	private float temperature;
	
	public Food(){
		super();
		this.dlc = new Date(0);
		this.temperature = 0;
	}
	public Food(String name, Date dlc, float temperature){
		super(name, true);
		this.dlc = dlc;
		this.temperature = temperature;
	}
	
	public void setDate( Date dlc ){ this.dlc=dlc; }
	public void setTemperature( float temperature ){ this.temperature=temperature; }
	
	public Date getDlc(){ return this.dlc; }
	public float getTemperature(){ return this.temperature; }
	
}
