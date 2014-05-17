package data;

import java.awt.List;
import java.util.ArrayList;

public class Warehouse {
	private Address address;
	private int capacity;
	private boolean coldChamber;
	private ArrayList<ProductAndQuantity> stored;
	
	public Warehouse(){
		this.address = new Address();
		this.capacity = 0;
		this.coldChamber = false;
		this.stored = new ArrayList();
	}
	public Warehouse(Address address, int capacity, boolean coldChamber, ArrayList<ProductAndQuantity> stored){
		this.address = address;
		this.capacity = capacity;
		this.coldChamber = coldChamber;
		this.stored = stored;
	}
	
	public void setAddress(Address address){ this.address = address; }
	public void setCapacity(int capacity){ this.capacity = capacity; }
	public void setColdchamber(boolean coldchamber){ this.coldChamber = coldchamber; }
	public void setStored(ArrayList stored){ this.stored = stored; }
	
	public void addToStored(Product product, int quantity){
		ProductAndQuantity temp = new ProductAndQuantity(product, quantity);
		for(int i=0; i<= this.stored.size(); i++){
			if(this.stored.get(i).getProduct() == product){
				temp.setQuantity(temp.getQuantity() + this.stored.get(i).getQuantity());
				this.stored.set(i, temp);
			}
			else
				this.stored.add(temp);
		}
	}
	public boolean removeFromStored(Product product, int quantity){
		for(int i=0; i<= this.stored.size(); i++){
			if(this.stored.get(i).getProduct() == product){
				if((this.stored.get(i).getQuantity() - quantity) < 0)
					return false;
				else{
					this.stored.get(i).setQuantity(this.stored.get(i).getQuantity() - quantity);
					return false;
				}
			}
		}
		for(int i=0; i<= this.stored.size(); i++){
			if(this.stored.get(i).getQuantity() <= 0)
				this.stored.remove(i);
		}
		return true;
	}
	
	public Address getAddress(){ return this.address; }
	public int getCapacity(){ return this.capacity; }
	public boolean getColdChamber(){ return this.coldChamber; }
	public ArrayList getStored(){ return this.stored; }
}
