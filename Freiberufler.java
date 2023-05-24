
public class Freiberufler extends Person {
 
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
	
	public String vorstellen() {
		return super.vorstellen() +". Ich bin Freibefuler";
	}
}
