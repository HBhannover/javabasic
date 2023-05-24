
public class Arbeiter extends Person {

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
	
	public String vorstellen() {
		return super.vorstellen() +". Ich bin Arbeiter von "+this.getArbeitgeber() + " Monatsgehalt: "+ this.getMonatslohn();
	}
	
}
