package net.javierjimenez;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author Surrui
 *
 */
public class App {

	/**
	 * String que conte el nom del fitxer per llegir
	 */
	private static String NOM_FITXER = "/desitjos.txt";

	/**
	 * Metode principal del programa, on llegim l'arxiu i
	 * on inicialitzem l'arxiu FabricacioRegals.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		BufferedReader llista = null;

		try {

			String llistaNens;

			llista = new BufferedReader(new FileReader(App.class.getResource(
					NOM_FITXER).getFile()));

			FabricacioRegals FR = new FabricacioRegals();

			while ((llistaNens = llista.readLine()) != null) {
				FR.llistarRegals(llistaNens);
			}

			FR.fabricarRegals();

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (llista != null)
					llista.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}
	}
}
