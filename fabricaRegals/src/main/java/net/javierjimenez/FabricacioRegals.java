package net.javierjimenez;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class FabricacioRegals {

	private static HashMap<String, Regal> fabricacio = new HashMap<String, Regal>();
	private static List<Regal> regals = new ArrayList<Regal>();

	public FabricacioRegals() {

	}

	public void llistarRegals(String llista) {

		if (llista.contains(":")) {

			String[] desitjos = llista.split(": ");

			if (desitjos[1].contains(",")) {

				String[] regals = desitjos[1].split(",");

				for (int i = 0; i < regals.length; i++) {

					if (fabricacio.containsKey(regals[i])) {

						fabricacio.get(regals[i]).contarRegal();

					} else {

						fabricacio.put(regals[i], new Regal(regals[i], 1));

					}
				}

			} else {

				String regals = desitjos[1];

				if (fabricacio.containsKey(regals)) {

					fabricacio.get(regals).contarRegal();

				} else {

					fabricacio.put(regals, new Regal(regals, 1));

				}
			}
		}
	}

	public void fabricarRegals() {

		for (Regal r : fabricacio.values()) {

			regals.add(r);
		}

		Collections.sort(regals, new comparatorRegal());

		int numLinia = 1;
		String linia = numLinia + "-";

		for (int i = 0; i < regals.size(); i++) {

			linia = linia + regals.get(i).getNom() + "[" + regals.get(i).getTotal() + "] ";

			if ((i + 1) % 5 == 0) {
				System.out.println(linia);
				numLinia++;
				linia = numLinia + "-";
			}
		}
	}
}
