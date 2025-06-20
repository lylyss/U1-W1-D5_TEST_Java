package Multimedia;

// Classe astratta base per tutti gli elementi multimediali
public abstract class Multimedia {
    protected String titolo;

    // Costruttore
    public Multimedia(String titolo) {
        this.titolo = titolo;
    }

    // Getter per il titolo
    public String getTitolo() {
        return titolo;
    }

    // Setter per il titolo
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
}
