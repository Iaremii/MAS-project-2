package mas.binaryAssociation;

import java.util.ArrayList;

public class File {

    private String fileName;
    private String fileType;
    private ArrayList<PenDrive> penDrives = new ArrayList<>();

    public File(String fileName, String fileType) {
        setFileName(fileName);
        setFileType(fileType);
    }

    public void setFileName(String fileName) {
        if (fileName == null) {
            throw new NullPointerException("Title does not exists!");
        }
        this.fileName = fileName;
    }

    public void setFileType(String fileType) {
        if (fileType == null) {
            throw new NullPointerException("Description does not exist!");
        }
        this.fileType = fileType;
    }

    public void addPenDrive(PenDrive pendrive) throws Exception {
        if (pendrive == null) {
            throw new Exception("Folder does not exists!");
        }
        if (!penDrives.contains(pendrive)) {
            this.penDrives.add(pendrive);
            pendrive.addFile(this);
        }
    }
    public void removePenDrive(PenDrive pendrive){
        if(penDrives.contains(pendrive)){
            penDrives.remove(pendrive);
            pendrive.removeFile(this);
        }
        
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public ArrayList<PenDrive> getPenDrives() {
        return penDrives;
    }

    @Override
    public String toString() {
        String info = "File: " + getFileName() + "." + getFileType() + "\n" + "On Pendrive(s):\n";
        for (PenDrive f : getPenDrives()) {
            info += "   " + f.getName() + "\n";
        }
        return info;
    }

}
