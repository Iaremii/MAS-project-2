package mas.qualifiedAssociation;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Oleksandr
 */
public class Samochod {

    private String model;
    private Map<String, Osoba> osobaKwalif = new HashMap<>();

    public Samochod(String model) {
        this.model = model;
    }

    public void dodajOsobeKwalif(Osoba nowaOsoba) {
        if (nowaOsoba == null) {
            throw new IllegalArgumentException("Osoba nie moze byc null");
        }
        if (!osobaKwalif.containsKey(nowaOsoba.getImie())) {
            osobaKwalif.put(nowaOsoba.getImie(), nowaOsoba);
            nowaOsoba.setSamochod(this);
            
        }else{
            System.out.println("Juz jest taka osoba");
        }
    }

    public void usunOsobe(String id) {
        osobaKwalif.remove(id);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public Map<String, Osoba> getOsoba() {
        return osobaKwalif;
    }

    @Override
    public String toString() {
        String info = getModel() + '\n';
        for(String key : osobaKwalif.keySet()){
            info+= "[" + key + "]";
        }
        return info; 
    }
    
    

}
