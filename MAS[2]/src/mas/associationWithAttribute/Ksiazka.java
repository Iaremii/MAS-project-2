package mas.associationWithAttribute;

import java.util.Hashtable;
import java.util.ListIterator;
import java.util.Vector;

public class Ksiazka {

    private String nazwa;
    public static Hashtable przypisanie = new Hashtable(); // niestatyczna 

    public Ksiazka(String nazwa) {
        setNazwa(nazwa);
        przypisanie.put(this, new Vector());
    }

    public void przepis(Biblioteka b, int okres) {
        Vector biblioteki = (Vector) przypisanie.get(this);
        new Przepisanie(this, b, okres);
    }

    public void wypiszBiblioteke() {
        System.out.println("Ksiazka : " + getNazwa());

        ListIterator iter = ((Vector) (getPrzypisanie().get(this))).listIterator();

        while (iter.hasNext()) {
            Przepisanie aktualne = (Przepisanie) iter.next();
            System.out.println("Biblioteka (" + iter.nextIndex() + ") "
                    + aktualne.getBiblioteka().getAdres()
                    + " Okres - " + aktualne.getOkres() + " dni");
        }
        System.out.println();
    }

    public void usunBiblioteke(Biblioteka biblioteka) {
        if (!przypisanie.contains(biblioteka)) {
            przypisanie.remove(biblioteka);
             biblioteka.usunKsiazke(this);
            
           
            System.out.println("Usunuescie biblioteki" + biblioteka.getAdres());
        }

    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public static Hashtable getPrzypisanie() {
        return przypisanie;
    }

    @Override
    public String toString() {
        return getNazwa(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
