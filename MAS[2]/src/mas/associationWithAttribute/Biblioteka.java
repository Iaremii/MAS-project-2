package mas.associationWithAttribute;

import java.util.Hashtable;
import java.util.ListIterator;
import java.util.Vector;

public class Biblioteka {

    private String adres;
    public static Hashtable przypisanie = new Hashtable();

    public Biblioteka(String adres) {
        setAdres(adres);
        przypisanie.put(this, new Vector());
    }

    public void przepis(Ksiazka nowa, int czas) {
        Vector ksiazki = (Vector) przypisanie.get(this);
        new Przepisanie(nowa, this, czas);
    }

    public void wypiszKsiazki() {
        System.out.println("Biblioteka : " + getAdres());

        ListIterator iter = ((Vector) (getPrzypisanie().get(this))).listIterator();

        while (iter.hasNext()) {
            Przepisanie aktualne = (Przepisanie) iter.next();
            System.out.println("Ksiazka (" + iter.nextIndex() + ") "
                    + aktualne.getKsiazka().getNazwa()
                    + " czas - " + aktualne.getOkres() + " dni");
        }

        System.out.println();
    }

    public void usunKsiazke(Ksiazka ksiazka) {
        if (!przypisanie.contains(ksiazka)) {
            przypisanie.remove(ksiazka);
            //ksiazka.usunBiblioteke(this);
            ksiazka.usunBiblioteke(this);
            System.out.println(ksiazka.getNazwa() + " byla usunietta");
        }

    }

    public static Hashtable getPrzypisanie() {
        return przypisanie;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Override
    public String toString() {
        return getAdres(); //To change body of generated methods, choose Tools | Templates.
    }

}
