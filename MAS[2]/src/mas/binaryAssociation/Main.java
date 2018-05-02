package mas.binaryAssociation;

/**
 * s14454 Oleksandr Iaremii
 *
 * @author Oleksandr
 */
public class Main {

    public static void main(String[] args) throws Exception {
    
        PenDrive f1 = new PenDrive("Toshiba");
        PenDrive f2 = new PenDrive("Dell");

        File p1 = new File("Exam", "pdf");
        File p2 = new File("Material[Mas]", "doc");
        File p3 = new File("Exam[mas]", "pdf");
        File p4 = new File("Wyklad1", "pdf");
        File p5 = new File("Wyklad2", "pdf");
        
        f1.addFile(p5);
        f1.addFile(p3);
        f1.addFile(p4);
        p1.addPenDrive(f2);
        p1.addPenDrive(f1);
        
        System.out.println(f1 + "PRzed");
        f1.removeFile(p5);
        
        System.out.println(f1 + "PO");
        System.out.println(f2);
        System.out.println(p5);
        System.out.println(p1);
    }

}
