
public class Student extends Person {

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
	
	public String vorstellen() {
		return super.vorstellen() +". Ich bin Student";
	}
	
	
}
