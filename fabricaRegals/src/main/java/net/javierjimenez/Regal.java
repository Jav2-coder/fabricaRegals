package net.javierjimenez;

public class Regal {

	private static String nom;
	private static int total;
	
	public Regal(String n, int v){
	
		nom = n;
		total = v;
	}	
	
	public void contarRegal(){
		total++;
	}
	
	public int getTotal(){
		return total;
	}
	
	public String getNom() {
		return nom;
	}
}
