package data;

import java.util.ArrayList;
import java.util.Scanner;
import data.ProductAndQuantity;

public class Wholesaler {
	private ArrayList<Fournisseur> fournisseurList;
	private ArrayList<Client> clientList;
	private ArrayList<Warehouse> warehouseList;
	
	public Wholesaler(){}
	public Wholesaler(ArrayList<Fournisseur> fournisseurList, ArrayList<Client> clientList, ArrayList<Warehouse> warehouseList){
		this.fournisseurList = fournisseurList;
		this.clientList = clientList;
		this.warehouseList = warehouseList;
	}
	
	public void setFournisseurList(ArrayList<Fournisseur> fournisseurList){ this.fournisseurList = fournisseurList; }
	public boolean addFournisseur(Fournisseur fournisseur){
		if(this.fournisseurList.indexOf(fournisseur) != -1)
			return false;
		else
			this.fournisseurList.add(fournisseur);
		return true;
	}
	public boolean removeFournisseur(Fournisseur fournisseur){
		if(this.fournisseurList.indexOf(fournisseur) != -1)
			this.fournisseurList.remove(this.fournisseurList.indexOf(fournisseur));
		else
			return false;
		return true;
	}
	
	public void setClientList(ArrayList<Client> clientList){ this.clientList = clientList; }
	public boolean addClient(Client client){
		if(this.clientList.indexOf(client) != -1)
			return false;
		else
			this.clientList.add(client);
		return true;
	}
	public boolean removeClient(Client client){
		if(this.clientList.indexOf(client) != -1)
			this.clientList.remove(this.clientList.indexOf(client));
		else
			return false;
		return true;
	}
	
	public void setWarehouseList(ArrayList<Warehouse> warehouseList){ this.warehouseList = warehouseList; }
	public boolean addWarehouse(Warehouse warehouse){
		if(this.warehouseList.indexOf(warehouse) != -1)
			return false;
		else
			this.warehouseList.add(warehouse);
		return true;
	}
	public boolean removeWarehouse(Warehouse warehouse){
		if(this.warehouseList.indexOf(warehouse) != -1)
			this.warehouseList.remove(this.warehouseList.indexOf(warehouse));
		else
			return false;
		return true;
	}
	
	public ArrayList<Fournisseur> getFournisseurList(){ return this.fournisseurList; }
	public ArrayList<Client> getClientList(){ return this.clientList; }
	public ArrayList<Warehouse> getWarehouseList(){ return this.warehouseList; }
	
	public void orderToFournisseur(){
		/*
		Scanner sc;
		int limit = 0;
		int ans;
		int fournisseurID;
		int productID;
		int quantity;
		int warehouseID;
		
		sc = new Scanner(System.in);
		ans = -1;
		System.out.println("A quel fournisseur voulez-vous commander ?");
		for(int i=0; i<=this.fournisseurList.size(); i++){
			System.out.println(i+". "+this.fournisseurList.get(i).getName());
			limit = i;
		}
		do{
			System.out.println("Veuillez entrer un nombre entre 0 et "+limit);
			ans = sc.nextInt();
		}while(ans < 0 || ans > limit);
		fournisseurID = ans;
		
		sc = new Scanner(System.in);
		ans = -1;
		System.out.println("Quel produit voulez-vous commander ?");
		for(int i=0; i<=this.fournisseurList.get(fournisseurID).getProducts().size(); i++){
			System.out.println(i+" ."+this.fournisseurList.get(fournisseurID).getProducts().get(i).getName());
			limit = i;
		}
		do{
			System.out.println("Veuillez entrer un nombre entre 0 et "+limit);
			ans = sc.nextInt();
		}while(ans < 0 || ans > limit);
		productID = ans;
		
		sc = new Scanner(System.in);
		ans = -1;
		System.out.println("Quelle quantitŽ de ce produit voulez-vous commander ?");
		do{
			System.out.println("Veuillez entrer un nombre suppŽrieur ˆ 1");
			ans = sc.nextInt();
		}while(ans < 1);
		quantity = ans;
		
		sc = new Scanner(System.in);
		ans = -1;
		System.out.println("Dans quel entrepot voulez-vous stocker ce produit ?");
		for(int i=0; i<=this.warehouseList.size(); i++){
			System.out.println(i+" ."+this.warehouseList.get(i).getAddress());
			limit = i;
		}
		do{
			System.out.println("Veuillez entrer un nombre entre 0 et "+limit+". L'entrepot doit �tre adaptŽ ˆ ce produit et avoir la capacitŽ de stockage nŽcessaire.");
			ans = sc.nextInt();
		}while(ans < 0 || ans > limit || this.fournisseurList.get(fournisseurID).getProducts().get(productID).getType() == this.warehouseList.get(ans).getColdChamber() || quantity > this.warehouseList.get(ans).getCapacity());
		warehouseID = ans;
		
		System.out.println("Vous avez commandŽ "+quantity+" "+this.fournisseurList.get(fournisseurID).getProducts().get(productID).getName()+" ˆ "+this.fournisseurList.get(fournisseurID).getName()+" ˆ recevoir au "+this.warehouseList.get(warehouseID).getAddress());
		this.warehouseList.get(warehouseID).addToStored(this.fournisseurList.get(fournisseurID).getProducts().get(productID), quantity);
		this.warehouseList.get(warehouseID).setCapacity(this.warehouseList.get(warehouseID).getCapacity() - quantity);
		System.out.println("Commande re�ue !");
		*/
	}
	
	public void orderFromClient(){
		
	}
	public void getCapacityOf(){
		/*
		Scanner sc = new Scanner(System.in);
		int limit = 0;
		int ans = -1;
		for(int i=0; i<=this.warehouseList.size(); i++){
			System.out.println(i+" ."+this.warehouseList.get(i).getAddress());
			limit = i;
		}
		do{
			System.out.println("Veuillez entrer un nombre entre 0 et "+limit);
			ans = sc.nextInt();
		}while(ans < 0 || ans > limit);
		System.out.println("L'entrepot "+this.warehouseList.get(ans).getAddress()+" comporte "+this.warehouseList.get(ans).getCapacity()+" espaces libres.");
		*/
	}
	public void getAmountOf(){
		/*
		Scanner sc = new Scanner(System.in);
		int limit = 0;
		int ans = -1;
		ArrayList<Product> productList = new ArrayList();
		ProductAndQuantity current = null;
		for(Warehouse w : this.warehouseList){
			for(int i=0; i<= w.getStored().size(); i++){
				current = (ProductAndQuantity) w.getStored().get(i);
				if(productList.indexOf(current.getProduct()) != -1)
					productList.add(current.getProduct());
			}
		}
		
		System.out.println("De quel produit voulez-vous connaitre le stock ?");
		for(Product p : productList)
			System.out.println(productList.indexOf(p)+". "+p.getName());
		limit = productList.size() - 1;
		do{
			System.out.println("Veuillez entrer un nombre entre 0 et "+limit);
			ans = sc.nextInt();
		}while(ans < 0 || ans > limit);
		
		int cpt = 0;
		for(Warehouse w : this.warehouseList){
			for(int i=0; i<= w.getStored().size(); i++){
				current = (ProductAndQuantity) w.getStored().get(i);
				if(current.getProduct() == productList.get(ans))
					cpt = cpt + current.getQuantity();
			}
		}
		System.out.println("Le produit : "+productList.get(ans)+" est disponible en "+cpt+" exemplaires.");
		*/
	}
}
