/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas.associationWithAttribute;

import java.util.Hashtable;
import java.util.ListIterator;
import java.util.Vector;

/**
 *
 * @author Oleksandr
 */
public class Main {

    public static void main(String[] args) {

        Biblioteka koszykowa = new Biblioteka("koszykowa");
        Biblioteka mlynarska = new Biblioteka("mlynarska");

        //tworzymy ksiazke
        Ksiazka harryPoter = new Ksiazka("Harry poter");
        harryPoter.przepis(mlynarska, 200);
        harryPoter.przepis(koszykowa, 100);
        
        mlynarska.wypiszKsiazki();
        koszykowa.wypiszKsiazki();
        
        mlynarska.usunKsiazke(harryPoter);
        System.out.println("Po usunieciu");
         mlynarska.wypiszKsiazki();
        
        
//
//        //przypisujemy ksiazki do biblotek
//        koszykowa.przepis(new Ksiazka("TAMADA"), 20);
//        mlynarska.przepis(new Ksiazka("Jan"), 30);
//        mlynarska.przepis(new Ksiazka("Piotr"), 40);
//        mlynarska.przepis(new Ksiazka("Mateusz"), 50);
//
//        koszykowa.wypiszKsiazki();
//        mlynarska.wypiszKsiazki();
//        //Wypisz wszystkich biblioteki w ktorych jest dana ksiazka
//        harryPoter.wypiszBiblioteke();

    }
}




