package data;

public class FoodPackage extends Food{
	private int packageNumber;
	private float price;
	
	public void setPackageNumber(int packageNumber){ this.packageNumber = packageNumber; }
	public void setPrice(long price){ this.price = price; }
	
	public int getpackageNumber(){ return this.packageNumber; }
	public float getPrice(){ return this.price; }
}
