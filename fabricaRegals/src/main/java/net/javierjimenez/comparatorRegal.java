package net.javierjimenez;

import java.util.Comparator;

public class comparatorRegal implements Comparator<Regal> {

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
