package net.javierjimenez;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FabricacioRegals {

	private static HashMap<String, Regal> fabricacio = new HashMap<String, Regal>();
	private static List<Regal> regals = new ArrayList<Regal>();
	
	public FabricacioRegals() {
		
	}
	
	public void llistarRegals(String llista) {
		
		String [] desitjos = llista.split(": ");
		
		String [] regals = desitjos[1].split(",");
		
		for(int i = 0; i < llista.length(); i++){
		
			if(fabricacio.containsKey(regals[i])){
			
				fabricacio.get(regals[i]).contarRegal();
				
			} else {
				
				fabricacio.put(regals[i], new Regal(regals[i], 1));
				
			}
		}
	}
	
	public void fabricarRegals() {
		
		for (Regal r : fabricacio.values()){
			
			regals.add(r);
			
		}
		
		
	}
}
