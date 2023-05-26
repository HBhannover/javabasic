package de.integrata.java.oop.personen;

import de.integrata.java.oop.adressen.Adressierbar;

public class Freiberufler extends Person implements Adressierbar{
 
	private double honorar;
	
	public Freiberufler (String vorname, String nachname, double honorar) {
		super(vorname, nachname);
		this.honorar = honorar;
	}

	public double getHonorar() {
		return honorar;
	}

	public void setHonorar(double honorar) {
		this.honorar = honorar;
	}
	@Override
	public String vorstellen() {
		return super.vorstellen() +". Ich bin Freiberufler";
	}
	@Override
	public String getAdresse() {
		return this.getVorname() + " "+ this.getNachname() +" Haus XXX";
	}
}
