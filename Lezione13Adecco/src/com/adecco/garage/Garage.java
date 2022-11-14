package com.adecco.garage;

import com.adecco.veicoli.VeicoloAMotore;

public class Garage {
	private VeicoloAMotore[] veicoli;
	
	public Garage() {
		this.veicoli = new VeicoloAMotore[15];
	}
	
	public Garage(int dimensioneParcheggio) {
		if(dimensioneParcheggio>0)
			this.veicoli = new VeicoloAMotore[dimensioneParcheggio];
		else
			this.veicoli = new VeicoloAMotore[15];
	}
		
		public void stampaPosti() {
			for (VeicoloAMotore v : this.veicoli)
				System.out.println(v);
		}
		public int immettiNuovoVeicolo( VeicoloAMotore veicolo) {
			for( int i=0 ; i<veicoli.length ; i++) {
				if(veicoli[i] == null) {
					veicoli[i] = veicolo;
					return i;
					}
			}
			return -1;
		}
		public VeicoloAMotore estraiVeicolo(int postoAuto) {
			if (postoAuto >= this.veicoli.length || postoAuto<0)
				return null;
			VeicoloAMotore tmpAMotore = this.veicoli[postoAuto];
			this.veicoli[postoAuto] = null;
			return tmpAMotore;
		}
}
