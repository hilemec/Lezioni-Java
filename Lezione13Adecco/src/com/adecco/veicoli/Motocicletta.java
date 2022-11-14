package com.adecco.veicoli;

public class Motocicletta extends VeicoloAMotore {
private String tipologia;
private int numeroTempiMotore;

	public Motocicletta() {
		super();
		setTipologia("corsa");
		setNumeroTempiMotore(3);
	}
	public Motocicletta(int annoImmatricolazione, String marca, String tipoAlimentazione, int cilindrata, String tipologia,int numeroTempiMotore) {
		super(annoImmatricolazione, marca, tipoAlimentazione, cilindrata);
		this.tipologia = tipologia;
		this.numeroTempiMotore = numeroTempiMotore;
	}

	public String getTipologia() {
		return tipologia;
		}
	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
		}
	public int getNumeroTempiMotore() {
		return numeroTempiMotore;
		}
	public void setNumeroTempiMotore(int numeroTempiMotore) {
		this.numeroTempiMotore = numeroTempiMotore;
		}
@Override
	public String toString() {
		return "Motocicletta: "+ "\n Numero Tempi Motore= " + numeroTempiMotore +
				"\n Tipologia= " + tipologia + super.toString() ;
	}
}
