
public class Hotel {
	private final int ANZAHL_ZIMMER;
	private Person[] gaeste;

	public Hotel() {
		this(5); // ruf den folgenden Konstruktor
	}

	public Hotel(int anzahl) {
		this.ANZAHL_ZIMMER = anzahl;
		this.gaeste = new Person[this.ANZAHL_ZIMMER];
	}
	
	public void einmieten(Person gast) {
		if (gast == null) {
			return;
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
	}
}
