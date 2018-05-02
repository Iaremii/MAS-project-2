/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas.binaryAssociation1to1;

/**
 *
 * @author Oleksandr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Husband h1 = new Husband(1, "Damian");
        Husband h2 = new Husband(2, "Jan");
        Wife w1 = new Wife(1, "JULIa", h1);
        Wife w2 = new Wife(2, "NASTIA", h2);
        
        
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(w1);
        System.out.println(w2);
        w1.setHusband(h2);
        w2.setHusband(h1);
        h1.setWife(null);
        h2.setWife(null);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(w1);
        System.out.println(w2);

    }

}
