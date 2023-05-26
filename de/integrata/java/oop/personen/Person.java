package de.integrata.java.oop.personen;

import java.util.Objects;

public class Person {

	private String vorname;
	private String nachname;
	private double groesse;
	private char geschlecht;
	private String fStand;
	private Person partner;
	private static int personenZaehler;

	public Person() {
		personenZaehler++;
	}

	public Person(String vorname, String nachname) {
		this(); // personenZaehler++; --> ruf den selbsten Konstruktor
		this.vorname = vorname;
		this.nachname = nachname;
	}

	public Person(String vorname, String nachname, double groesse, char geschlecht) {
		this(vorname, nachname); // personenZaehler++; -> ruf den 2. Konstruktor
		this.groesse = groesse;
		this.geschlecht = geschlecht;
	}

	public String getName() {
		return (this.vorname + " " + this.nachname);
	}

	public static int getPersonenzaehler() {
		return personenZaehler;
	}

	public void setVorname(String vorname) throws Exception {
		if (this.vorname == null) {
			this.vorname = vorname;
		} else {
			throw new Exception ("Ungültig, Vorhanden");
		}
		
		assert this.vorname != null: "Falsch!!"; // assert <Vergleich> : <"Messages">
	}

	public String getVorname() {
		return this.vorname;
	}

	public void setNachname(String nachname) {
		if (this.nachname == null) {
			this.nachname = nachname;
		} else {
			System.out.println("Ungültig");
		}
	}

	public String getNachname() {
		return this.nachname;
	}

	public double getGroesse() {
		return groesse;
	}

	public void setGroesse(double groesse) {
		if (groesse > 0) {
			this.groesse = groesse;
		} else {
			System.out.println("Ungültig");
		}
	}

	public char getGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(char geschlecht) {
		switch (geschlecht) {
		case 'm':
		case 'M':
			this.geschlecht = 'm';
			break;
		case 'w':
		case 'W':
			this.geschlecht = 'w';
			break;
		case 'd':
		case 'D':
			this.geschlecht = 'd';
			break;
		default:
			System.out.println("Ungültig");
		}
	}

	public Person getPartner() {
		return partner;
	}

	public String getfStand() {
		return fStand;
	}

	public void setfStand(String fStand) {
		this.fStand = fStand;
	}

	public void heiraten(Person neuerPartner) {
		if (this.partner == null && neuerPartner != null && neuerPartner.partner == null && neuerPartner != this) {
			this.partner = neuerPartner;
			neuerPartner.partner = this;
		}
	}

//	public void heiraten(Person partner, String fStand) {
//		this.partner = partner;
//		this.fStand = fStand;
//		
//	}

	public void scheiden() {
		if (this.partner != null) {
			this.partner.partner = null;
			this.partner = null;
		}
	}

//	public String getInfo() {
//		return this.getNachname() + " " + this.getVorname() +  " " +this.getGroesse() + " "  +this.getfStand() + " "
//			 + this.getPartner().vorname + " " +this.getPartner().nachname + " " +this.getPartner().groesse;
//	}

	public String getInfo() {
		String ergebnis = this.getName() + ", " + this.groesse + "cm, ";
		switch (this.geschlecht) {
		case 'm':
			ergebnis += "männlich, ";
			break;
		case 'w':
			ergebnis += "weiblich, ";
			break;
		case 'd':
			ergebnis += "divers, ";
			break;
		}
		if (this.partner != null) {
			ergebnis += "verheiratet mit " + this.partner.getName();
		} else {
			ergebnis += "unverheiratet";
		}

		return ergebnis;
	}
	
	// Alterlative für getInfo() mit der Nutzung von toString() und append()
	public String getInfo2() {
		StringBuilder sb = new StringBuilder(255);
		sb.append(this.getName())
		  .append(", ")
		  .append(this.groesse)
		  .append("cm");
		
		switch (this.geschlecht) {
		case 'm':
			sb.append("männlich, ");
			break;
		case 'w':
			sb.append("weiblich, ");
			break;
		case 'd':
			sb.append("divers, ");
			break;
		}
		if (this.partner != null) {
			sb.append("verheiratet mit ").append(this.partner.getName());
		} else {
			sb.append("unverheiratet");
		}

		return sb.toString();
		
	}

	public String vorstellen() {
		return "Mein Name ist " + this.nachname + " " + this.vorname;
	}
	
	//generate durch [Source --> Generate hashCode() and equals()]
	@Override
	public int hashCode() {
		return Objects.hash(fStand, geschlecht, groesse, nachname, vorname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(fStand, other.fStand) && geschlecht == other.geschlecht
				&& Double.doubleToLongBits(groesse) == Double.doubleToLongBits(other.groesse)
				&& Objects.equals(nachname, other.nachname) && Objects.equals(vorname, other.vorname);
	}

	@Override
	public String toString() {
		return "Person [vorname=" + vorname + ", nachname=" + nachname + ", groesse=" + groesse + ", geschlecht="
				+ geschlecht + ", fStand=" + fStand + ", partner=" + partner + "]";
	}
	
	


}
