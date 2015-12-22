package net.javierjimenez;

import java.util.Comparator;

/**
 * 
 * @author Surrui
 *
 */
public class comparatorRegal implements Comparator<Regal> {

	/**
	 * Metode per comparar objectes Regal i 
	 * ordenar-los de forma ascendent
	 */
	public int compare(Regal a, Regal b) {

		int total1 = a.getTotal();
		int total2 = b.getTotal();

		if (total1 > total2) {
			return 1;
		} else if (total1 < total2) {
			return -1;
		}
		return 0;
	}
}
