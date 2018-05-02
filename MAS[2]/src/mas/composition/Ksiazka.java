package mas.composition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ksiazka {

    private String autor;
    private String tytul;
    private Map<Integer, Rozdzial> rozdzialy = new HashMap<>();
    public static int licznik;

    public Ksiazka(String autor, String tytul) {
        setAutor(autor);
        setTytul(tytul);
    }

    public void stworzRozdzial(String rozdzial, String liczbaStron) {
        Rozdzial nowyRozdzial = new Rozdzial(rozdzial, liczbaStron);
        rozdzialy.put(licznik, nowyRozdzial);
        licznik++;
    }
    //усунути по іншому не по id або хочаб висвітлити всі і вибрати кого хочем видалити
    public void usunRozdzial(int id) {
        rozdzialy.remove(id);
        if (id >= licznik) {
            licznik--;
        }
    }

    public List<Rozdzial> znajdzRozdzialPoNazwie(String Rozdzial) throws Exception {
        List<Rozdzial> rozdzialList = new ArrayList<>();
        for (Map.Entry<Integer, Rozdzial> entry : rozdzialy.entrySet()) {
            if (entry.getValue().getRozdzial() == Rozdzial) {
                rozdzialList.add(entry.getValue());
            } else {
                throw new Exception("Niema takiego rozdzialu");
            }
        }
        return rozdzialList;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor == null) {
            throw new IllegalArgumentException("Autor nie moze byc null!");
        }
        this.autor = autor;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        if (tytul == null) {
            throw new IllegalArgumentException("Tytul nie moze byc null");
        }
        this.tytul = tytul;
    }

    private class Rozdzial {

        private String rozdzial;
        private String liczbaStron;

        public Rozdzial(String rozdzial, String liczbaStron) {
            setLiczbaStron(liczbaStron);
            setRozdzial(rozdzial);
        }

        public String getLiczbaStron() {
            return liczbaStron;
        }

        public void setLiczbaStron(String liczbaStron) {
            if (liczbaStron == null) {
                throw new IllegalArgumentException("LiczbaStron nie moze byc null!");
            }
            this.liczbaStron = liczbaStron;
        }

        public String getRozdzial() {
            return rozdzial;
        }

        public void setRozdzial(String rozdzial) {
            if (rozdzial == null) {
                throw new IllegalArgumentException("Rozdzial nie moze byc null");
            }
            this.rozdzial = rozdzial;
        }

        public String toString() {
            return getRozdzial() + " " + getLiczbaStron() + " stron";
        }
    }

    public String toString() {
        String info = "Ksiazka: " + getAutor() + "-" + getTytul() + ", Rozdzial: ";
        for (Map.Entry<Integer, Rozdzial> entry : rozdzialy.entrySet()) {
            info += "[" + entry.getKey() + entry.getValue() + "]";
        }
        return info;
    }
}
