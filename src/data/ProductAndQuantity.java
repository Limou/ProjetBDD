package data;

public class ProductAndQuantity {
	Product product;
	int quantity;
	
	public ProductAndQuantity(Product product, int quantity){
		this.product = product;
		this.quantity = quantity;
	}
	
	public void setProduct(Product product){ this.product = product; }
	public void setQuantity(int quantity){ this.quantity = quantity; }
	
	public Product getProduct(){ return this.product; }
	public int getQuantity(){ return this.quantity; }
}
