package main;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import data.Wholesaler;
import networking.DatabaseInterface;

class main {
	private static DatabaseInterface databaseInterface;
	
	public static void main (String[] args){
		try {
			databaseInterface = new DatabaseInterface(args[0], args[1], args[2]);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Wholesaler me = dataLoad();
		
		
		Scanner sc = new Scanner(System.in);
		int ans = -1;
		boolean continuer = true;
		while(continuer == true){
			System.out.println("Que voulez-vous faire ?");
			System.out.println("1.Commander un produit � un fournisseur.");
			System.out.println("2.Saisir la commande d'un client.");
			System.out.println("3.Etat du stock d'un produit donn�.");
			System.out.println("4.Etat de la capacit� d'un entrepot.");
			do{
				System.out.println("Veuillez saisir un nombre entre 1 et 4");
				ans = sc.nextInt();
			} while(ans < 1 || ans > 4);
			if(ans == 1)
				me.orderToFournisseur();
			else if(ans == 2)
				me.orderFromClient();
			else if(ans == 3)
				me.getCapacityOf();
			else if(ans == 4)
				me.getAmountOf();
			
			System.out.println("voulez-vous continuer ? (0 : non, autre : oui)");
			ans = sc.nextInt();
			if(ans == 0)
				continuer = false;
		}
		
		dataSave();
	}
	public static Wholesaler dataLoad(){
		Wholesaler owner = new Wholesaler();
		Client clientbdd = new Client();
		try {
			ResultSet addresses = databaseInterface.readDb("Select * from adresselivraison");
			while (addresses.next()) {
			    String name = addresses.getString("adresse");
			    name[i++] = name;
			}
			for (i=0, i=name.length, i++) 
			{
			clientbdd.deliveryAddressList[i] = name;	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// ici on charge en m�moire les donn�es de la base de donn�es selim
		return owner;
	}
	public static void dataSave(){
		// ici on sauvegarde toutes les donn�es sur la BDD selim
	}
}
