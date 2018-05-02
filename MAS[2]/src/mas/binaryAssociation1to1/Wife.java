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
public class Wife {

    private Integer id;
    private String name;
    private Husband husband;

    public Wife(Integer id, String name, Husband husband) {
        this.id = id;
        this.name = name;
        this.husband = husband;
    }

    public Husband getHusband() {
        return husband;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        if(name == null){
            throw new IllegalArgumentException("Wife should has a husband!");
        }
        this.name = name;
    }

    public void setHusband(Husband husband) {
       if(husband == null){
            throw new IllegalArgumentException("Husband can't be null");
        }
        if(this.husband != husband){
            this.husband = husband;
            husband.setWife(this);
        }
    }

    @Override
    public String toString() {
        return "Wife: " + getName() + " has husband: " + getHusband().getName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    

}
