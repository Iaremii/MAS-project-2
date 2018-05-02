/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas.composition;

/**
 *
 * @author Oleksandr
 */
public class Main {

    public static void main(String[] args) throws Exception {

        Ksiazka harryPoter = new Ksiazka("J. K. Rowling", "HarryPoter");
        harryPoter.stworzRozdzial("A", "200");
        harryPoter.stworzRozdzial("B", "300");
        System.out.println(harryPoter);
        harryPoter.usunRozdzial(0);
        System.out.println(harryPoter);
        System.out.println(harryPoter.znajdzRozdzialPoNazwie("C"));

    }
}
