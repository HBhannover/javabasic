
public class Hauptprogramm {

	public static void main(String[] args) {
		
		System.out.println(Person.getPersonenzaehler());  
		
		Person p = new Person("Franz", "Beckenbauer");
//		p.setVorname("Franz");
//		p.setNachname("Beckenbauer");
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
	    q = new Person(); //"Birgit","Prinz"
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
    Student s = new Student("Bastian", "Schweinsteiger", 1000.0);
//    s.setVorname("Bastian");
//    s.setNachname("Schweinsteiger");
    s.setGroesse(183);
    s.setGeschlecht('m');
    
    Arbeiter a = new Arbeiter("Harry", "Poster", "Geil AG", 100_00_00.0);
    s.setGroesse(176);
    s.setGeschlecht('m');
    
    Freiberufler f = new Freiberufler ("Tom", "Jerry", 100.0);
    s.setGroesse(180);
    s.setGeschlecht('w');
    
 //===
    
//int[] b = new int[10];
//b=new int[] {1,3,4};
//
//System.out.println(b.length);

Hotel h = new Hotel(100);
h.einmieten(q);
h.status();
h.einmieten(p);
h.status();
h.einmieten(s);
h.status();
h.einmieten(a);
h.status();
h.einmieten(f);
h.status();
h.einmieten(p,q,s,a,f);
 
	System.out.println(h.freiezimmer());   
    System.out.println(Person.getPersonenzaehler());  


AdressBuch adb = new AdressBuch();

adb.eintragen(a);
adb.eintragen(s);
adb.eintragen(h);
adb.eintragen(f);

adb.ausgeben();


	}

}
