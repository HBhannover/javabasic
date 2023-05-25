
public class Student extends Person implements Adressierbar {

	private double foerderung;
	
	 
	public Student(String neuerVorname, String neuerNachname, double foerderung) {
		super(neuerVorname, neuerNachname); // oder this() ???
		this.foerderung = foerderung;
	}

	public double getFoerderung() {
		return foerderung;
	}

	public void setFoerderung(double foerderung) {
		this.foerderung = foerderung;
	}
	
	@Override
	public String vorstellen() {
		return super.vorstellen() +". Ich bin Student";
	}
	@Override
	public String getAdresse() {
		return this.getVorname() + " "+ this.getNachname() +" Wohnheim ABC";
	}
	
	
}
