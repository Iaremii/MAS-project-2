package mas.qualifiedAssociation;

import java.util.Vector;

/**
 *
 * @author Oleksandr
 */
public class Osoba {

    private String imie;
    private Samochod samochod;
    
    //private Vector <String> samochodyOsoby = new Vector<>();

    public Osoba(String imie) {
        setImie(imie);
    }

    public String getImie() {
        return imie;
    }

    public Samochod getSamochod() {
        return samochod;
    }

    public void setImie(String imie) {
        if (imie == null) {
            throw new IllegalArgumentException("Imie nie moze byc null");
        }
        this.imie = imie;
    }

    public void setSamochod(Samochod nowySamochod) {
        //na null treba prowiryry i maju to *-*
        this.samochod = nowySamochod;
        nowySamochod.dodajOsobeKwalif(this);
    }

    @Override
    public String toString() {
        return "Osoba: " + getImie() + " ma samochod: " + samochod.getModel(); //To change body of generated methods, choose Tools | Templates.
    }

}
