package com.adecco.veicoli;

public class Automobile extends VeicoloAMotore {
	private int numeroPorte;
	
	public int getNumeroPorte() {
		return numeroPorte;
	}
	public void setNumeroPorte(int numeroPorte) {
		this.numeroPorte = numeroPorte;
	}

@Override
	public String toString() {
		return "Automobile"+"\n Numero Porte= " + numeroPorte + super.toString() ;
	}

}
