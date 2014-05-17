package data;

import java.util.ArrayList;

public class Fournisseur extends Human{
	private ArrayList<Product> products;
	
	public Fournisseur(){
		super();
		this.products = new ArrayList();
	}
	public Fournisseur(String name, Address address, String phone, ArrayList<Product> products){
		super(name, address, phone);
		this.products = products;
	}
	
	public void setProducts(ArrayList<Product> products){ this.products = products; }
	public boolean addProduct(Product product){
		if(this.products.indexOf(product) != -1)
			return false;
		else
			this.products.add(product);
		return true;
	}
	public boolean removeProduct(Product product){
		if(this.products.indexOf(product) != -1)
			this.products.remove(this.products.indexOf(product));
		else
			return false;
		return true;
	}
	
	public ArrayList<Product> getProducts(){ return this.products; }
}
