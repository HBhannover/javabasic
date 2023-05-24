
public class Hauptprogramm {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.setVorname("Franz");
		p.setNachname("Beckenbauer");
		p.setGeschlecht('m');
		p.setGroesse(186);
		p.setfStand("ledig");
	    System.out.println(p.getName());
//=====	    
	    
//	    Person p2 = new Person();
//	    p2.setVorname("Sisi");
//		p2.setNachname("Beckenbauer");
//		p2.setGeschlecht('f');
//		p2.setGroesse(180);
//		p2.setfStand("ledig");	 
//		
//	    p.heiraten(p2, "heiratet");
//	    System.out.println(p.getInfo());
//	    
////=====	    
	    
	    Person q;
	    q = new Person();
	    q.setVorname("Birgit");
	    q.setNachname("Prinz");
	    q.setGroesse(180);
	    q.setGeschlecht('w');
	    System.out.println(q.getInfo());
	    System.out.println(p.getInfo());
	    
	p.heiraten(q);
	
    System.out.println(q.getInfo());
    System.out.println(p.getInfo());
    
    p.scheiden();
    
    System.out.println(q.getInfo());
    System.out.println(p.getInfo());
	  
//=====
	    

	    

	}

}
