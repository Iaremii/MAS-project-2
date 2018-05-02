package mas.binaryAssociation;

import java.util.ArrayList;

public class PenDrive {

    private String name;
    private ArrayList<File> pliks = new ArrayList<>();

    public PenDrive(String name) {
        setName(name);
    }

    public void setName(String name) {
        if (name == null) {
            throw new NullPointerException("Name does not exists!");
        }
        this.name = name;
    }

    public void addFile(File plik) throws Exception {
        if (plik == null) {
            throw new Exception("Plik does not exist");
        }
        if (!pliks.contains(plik)) {
            this.pliks.add(plik);
            plik.addPenDrive(this);
        }
    }

    public void removeFile(File plik) {
        if (pliks.contains(plik)) {
            pliks.remove(plik);
            plik.removePenDrive(this);
        }

    }
    /// вертаєм нову лісту а не нашу
    public ArrayList<File> getPliks() {
        return new ArrayList(pliks);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String info = "Pendrive: " + getName() + "\n" + "Files: \n";
        for (File f : getPliks()) {
            info += "   " + f.getFileName() + "." + f.getFileType() + "\n";
        }
        return info;

    }

}
