package net.javierjimenez;

public class Regal {

	private String nom;
	private int total;
	
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

	@Override
	public String toString() {
		return "Regal [getTotal()=" + getTotal() + ", getNom()=" + getNom() + "]";
	}

	
}
