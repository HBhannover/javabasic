
public class AdressBuch {

	Adressierbar eintragen[];

	public AdressBuch() {
		this.eintragen = new Adressierbar[100];
	}

	public void eintragen(Adressierbar adress) {
		for (int i = 0; i < eintragen.length; i++) {
			if (eintragen[i] == null) {
				eintragen[i] = adress;
				return;
			}
		}
		System.out.println("Adressbuch ist voll !!!");
	}

	public void ausgeben() {
		for (int i = 0; i < 100; i++) {
			if (eintragen[i] != null) {
				System.out.println(eintragen[i].getAdresse());
			}
		}

		System.out.println("*************************");
	}

}
