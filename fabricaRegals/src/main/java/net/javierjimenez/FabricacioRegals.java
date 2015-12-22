package net.javierjimenez;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * 
 * @author Surrui
 *
 */
public class FabricacioRegals {

	/**
	 * HashMap que conte tots els objectes Regal
	 */
	private static HashMap<String, Regal> fabricacio = new HashMap<String, Regal>();
	
	/**
	 * List que conté els objectes Regal ordenats
	 */
	private static List<Regal> regals = new ArrayList<Regal>();

	/**
	 * Constructor de l'objecte FabricacioRegals
	 */
	public FabricacioRegals() {

	}

	/**
	 * Metode per poder omplir un HashMap amb els
	 * objectes Regal, els quals els creem a partir
	 * de les dades que anem obtenint al llegir 
	 * l'arxiu de text.
	 * 
	 * @param llista String que conté el contingut
	 * del text fila a fila
	 */
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

	/**
	 * Metode encarregat d'ordenar els objectes Regal i on
	 * imprimim per pantalla els objectes de 5 en 5 en ordre
	 * ascendent.
	 */
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
