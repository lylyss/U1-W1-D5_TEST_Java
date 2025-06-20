package Multimedia;

import Interface.Luminosita;

// Classe che rappresenta un'immagine con luminosità regolabile
public class Immagine extends Multimedia implements Luminosita {
    private int luminosita;

    // Costruttore
    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = Math.max(1, luminosita);
    }

    // Mostra l'immagine stampando il titolo seguito da asterischi
    public void show() {
        String asterischi = "*".repeat(luminosita);
        System.out.println(titolo + asterischi);
    }

    // Aumenta la luminosità
    @Override
    public void aumentaLuminosita() {
        luminosita++;
    }

    // Diminuisce la luminosità
    @Override
    public void diminuisciLuminosita() {
        if (luminosita > 1) luminosita--;
    }

    // Getter per la luminosità
    public int getLuminosita() {
        return luminosita;
    }
}
