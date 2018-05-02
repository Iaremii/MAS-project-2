/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas.associationWithAttribute;

import java.util.Vector;

/**
 *
 * @author Oleksandr
 */
public class Przepisanie {

    private int okres;
    private Ksiazka ksiazka;
    private Biblioteka biblioteka;

    public Przepisanie(Ksiazka ksiazka, Biblioteka biblioteka, int okres) {
        setKsiazka(ksiazka);
        setBiblioteka(biblioteka);
        setOkres(okres);
        ((Vector) (ksiazka.przypisanie.get(ksiazka))).add(this);
        ((Vector) (biblioteka.przypisanie.get(biblioteka))).add(this);
    }

    public Ksiazka getKsiazka() {
        return ksiazka;
    }

    public Biblioteka getBiblioteka() {
        return biblioteka;
    }

    public int getOkres() {
        return okres;
    }

    public void setBiblioteka(Biblioteka biblioteka) {
        this.biblioteka = biblioteka;
    }

    public void setKsiazka(Ksiazka ksiazka) {
        this.ksiazka = ksiazka;
    }

    public void setOkres(int okres) {
        this.okres = okres;
    }
    
    
}
