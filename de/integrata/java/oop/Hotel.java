package de.integrata.java.oop;

import de.integrata.java.oop.adressen.Adressierbar;
import de.integrata.java.oop.adressen.Aufrufbar;
import de.integrata.java.oop.personen.Person;
import de.integrata.java.oop.personen.Student;

/**
 * Ein Hotel ist ein Container für Personen.
 * Im Hotel kann man Personen einmieten. Die Methode {@code status()} ruft für alle Hotelgäste die Mothode {@link Person.verstellen()} auf
 * @author Hoang Bach Nguyen
 *
 */

public class Hotel implements Adressierbar, Aufrufbar {
	private final int ANZAHL_ZIMMER;
	private Person[] gaeste;

	public Hotel() throws Exception {
		this(5); // ruf den folgenden Konstruktor
	}

	public Hotel(int anzahl) {
		this.ANZAHL_ZIMMER = anzahl;
		this.gaeste = new Person[this.ANZAHL_ZIMMER];
		
	}
	
	//variable Argumentliste (vararg)
	public void einmieten(Person... persons) {
		if (persons == null) {
			return;
		}
		for (int i = 0; i < persons.length; i++) {
			this.einmieten(persons[i]);
			}
		}

	/**
	 * Person, die Hotel einmieten wollte
	 * @param gast
	 */
	public void einmieten(Person gast) {
		if (gast == null) {
			return;
		}
		
		//**** Erweiterung aus Interface zu Objekt:
		if(gast instanceof Student) {
			Student student = (Student) gast;  //Type-Cast
			double foerderung = student.getFoerderung();
			if(foerderung <1000.0) {
				System.out.println("Der Student "+ student.getName() + " ist zu arm");
				return;
			}
		}
						
		for (int i = 0; i < gaeste.length; i++) {
			if (this.gaeste[i] == null) {
				this.gaeste[i] = gast;
				return;
			}
		}
		System.out.println("hotel ist voll!");
	}
	

	public void abreisen(Person ehemaligerGast) {
		for (int i = 0; i < this.gaeste.length; i++) {
			if (this.gaeste[i] == ehemaligerGast) {
				this.gaeste[i] = null;
			}
		}
	}

	public void abreisen(int zimmerNummer) {
		if (zimmerNummer >= 0 && zimmerNummer < this.gaeste.length) {
			this.gaeste[zimmerNummer] = null;
		}
	}

	public int freiezimmer() {
		int anzahlZfrei = 0;
		for (int i = 0; i < this.gaeste.length; i++) {
			if (this.gaeste[i] == null) {
				anzahlZfrei++;
			}
		}
		return anzahlZfrei;
	}

	public void status() {

		for (int i = 0; i < gaeste.length; i++) {
			if (this.gaeste[i] != null) {
				System.out.println(gaeste[i].vorstellen());				
			}
		}
		System.out.println("========================");
	}
	
	@Override
	public String getAdresse() {
		return "Hotel ABCXYZ";
	}
	
	@Override
	public String getTeilNr() {
		return "...";
	}
}
