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
public class Husband {
    private Integer id;
    private String name;
    private Wife wife;

    public Husband(Integer id, String name) {
        this.id = id;
        this.name = name;
       
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Wife getWife() {
        return wife;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        if(name == null){
            throw new IllegalArgumentException("Husband should has name! =)");
        }
        this.name = name;
    }

    public void setWife(Wife newWife) {
        if(this.wife != newWife){
            this.wife = newWife;
            if(newWife != null) {
                newWife.setHusband(this);
            }
        }
    }
    public void removeWife(Wife wife){
        
    }

    @Override
    public String toString() {
        return "Husband: " + getName() + " has wife: " + (wife != null ? wife.getName(): "") ; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
