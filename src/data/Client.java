package data;

import java.awt.List;
import java.util.ArrayList;

public class Client extends Human{
	private ArrayList deliveryAddressList;
	
	public Client(){
		super();
		this.deliveryAddressList = new ArrayList();
	}
	public Client(String name, Address address, String phone, ArrayList deliveryAddressList){
		super(name, address, phone);
		this.deliveryAddressList = deliveryAddressList;
	}
	
	public void setDeliveryAddressList(ArrayList deliveryAddressList){ this.deliveryAddressList = deliveryAddressList; }
	public boolean addDeliveryAddress(Address address){
		if(this.deliveryAddressList.indexOf(address) != -1)
			return false;
		else
			this.deliveryAddressList.add(address);
		return true;
	}
	public boolean removeDeliveryAddress(Address address){
		if(this.deliveryAddressList.indexOf(address) == -1)
			return false;
		else
			this.deliveryAddressList.add(this.deliveryAddressList.indexOf(address), address);
		return true;
	}
}
