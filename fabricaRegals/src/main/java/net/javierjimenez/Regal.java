package net.javierjimenez;

/**
 * 
 * @author Surrui
 *
 */
public class Regal {

	/**
	 * String que conte la variable nom de l'objecte Regal
	 */
	private String nom;
	
	/**
	 * int que conté el numero total de Strings nom
	 */
	private int total;
	
	/**
	 * Constructor de l'objecte Regal
	 *  
	 * @param n String variable que conté el nom de l'objecte Regal
	 * @param v int variable que conte el total de Strings nom
	 */
	public Regal(String n, int v){
		nom = n;
		total = v;
	}	
	
	/**
	 * Metode per augmentar el valor de la variable total
	 */
	public void contarRegal(){
		total++;
	}
	
	/**
	 * Metode per obtenir el valor total
	 * 
	 * @return int
	 */
	public int getTotal(){
		return total;
	}
	
	/**
	 * Metode per obtenir el String nom
	 * 
	 * @return String
	 */
	public String getNom() {
		return nom;
	}
}
