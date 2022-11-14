package com.adecco.veicoli;

public class Furgone extends VeicoloAMotore {
private int capacitaCarico;

	public Furgone() {
	super();
	setCapacitaCarico(1000);
	}
	public Furgone (int capacitaCarico, int annoImmatricolazione, String marca, String tipoAlimentazione, int cilindrata) {
		super(annoImmatricolazione, marca, tipoAlimentazione, cilindrata);
		setCapacitaCarico(capacitaCarico);
	}

	public int getCapacitaCarico() {
		return capacitaCarico;
	}
	public void setCapacitaCarico(int capacitaCarico) {
		this.capacitaCarico = capacitaCarico <= 1000 ? capacitaCarico : 1000;
	}

@Override
	public String toString() {
		return "Furgone" + "\n Capacita di Carico= " + capacitaCarico + super.toString() ;
    }

}
