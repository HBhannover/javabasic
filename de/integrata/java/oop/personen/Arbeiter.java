package de.integrata.java.oop.personen;

import de.integrata.java.oop.adressen.Adressierbar;

public class Arbeiter extends Person implements Adressierbar {

	private String arbeitgeber; 
	private double monatslohn;
	
	public Arbeiter(String vorname, String nachname, String arbeitgeber, double monatslohn) {
		super(vorname, nachname);
		this.arbeitgeber = arbeitgeber;
		this.monatslohn = monatslohn;
	}
	
	public String getArbeitgeber() {
		
		return arbeitgeber;
	}
	public void setArbeitgeber(String arbeitgeber) {
		this.arbeitgeber = arbeitgeber;
	}
	public double getMonatslohn() {
		return monatslohn;
	}
	public void setMonatslohn(double monatslohn) {
		this.monatslohn = monatslohn;
	}
	@Override
	public String vorstellen() {
		return super.vorstellen() +". Ich bin Arbeiter von "+this.getArbeitgeber() + " Monatsgehalt: "+ this.getMonatslohn();
	}
	@Override
	public String getAdresse() {
		return this.getVorname() + " "+ this.getNachname() +" Wohnung XYZ";
	}
}
