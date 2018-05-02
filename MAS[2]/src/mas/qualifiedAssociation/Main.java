package mas.qualifiedAssociation;

/**
 *
 * @author Oleksandr
 */
public class Main {

    public static void main(String[] args) {
        Osoba o = new Osoba("Oleg");
        Osoba o2 = new Osoba("Nazar");
        Samochod m1 = new Samochod("mazda");
        Samochod m2 = new Samochod("opel");
        m1.dodajOsobeKwalif(o2);
        m1.dodajOsobeKwalif(o);
        o.setSamochod(m1);
        o2.setSamochod(m2);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(o);
        
    }
    
}
