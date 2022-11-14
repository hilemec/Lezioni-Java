package com.adecco.veicoli;

public class VeicoloAMotore {
	private String marca, tipoAlimentazione;
	private int annoImmatricolazione, cilindrata;
	
	public VeicoloAMotore() {
		this(2010, "Suburu", "Benzina",2000);
	}
	public VeicoloAMotore(int annoImmatricolazione, String marca, String tipoAlimentazione, int cilindrata) {
		setAnnoimmatricolazione(annoImmatricolazione);
		setMarca(marca);
		setTipoAlimentazione(tipoAlimentazione);
		setCilindrata(cilindrata);
	}
	public int getAnnoimmatricolazione() {
		return annoImmatricolazione;
	}
	public void setAnnoimmatricolazione(int annoimmatricolazione) {
		this.annoImmatricolazione = annoimmatricolazione;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipoAlimentazione() {
		return tipoAlimentazione;
	}
	public void setTipoAlimentazione(String tipoAlimentazione) {
		switch (tipoAlimentazione) {
		case "benzina":
			this.tipoAlimentazione = "Benzina";
			break;
		case "diesel":
			this.tipoAlimentazione = "Diesel";
			break;
		case "e-tron":
			this.tipoAlimentazione = "E-tron";
			break;
		case "metano":
			this.tipoAlimentazione = "Metano";
			break;
		case "gpl":
			this.tipoAlimentazione = "GPL";
			break;
		default:
			this.tipoAlimentazione = "Benzina";
			break;
		}
	}
	public int getCilindrata() {
		return cilindrata;
	}
	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	@Override
	public String toString() {
		return "\n AnnoImmatricolazione= " + annoImmatricolazione + "\n Marca= " + marca
				+ "\n Tipo Alimentazione= " + tipoAlimentazione + "\n Cilindrata= " + cilindrata;
	}
	
	
}
