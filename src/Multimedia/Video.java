package Multimedia;

import Interface.Luminosita;
import Interface.Play;
import Interface.Volume;

// Classe che rappresenta un video riproducibile con volume e luminosità regolabili
public class Video extends Multimedia implements Play, Volume, Luminosita {
    private int durata;
    private int volume;
    private int luminosita;

    // Costruttore
    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.durata = Math.max(1, durata);
        this.volume = Math.max(1, volume);
        this.luminosita = Math.max(1, luminosita);
    }

    // Riproduce il video stampando il titolo seguito + punti esclamativi (volume) +  asterischi (luminosità)
    @Override
    public void play() {
        String puntiEsclamativi = "!".repeat(volume);
        String asterischi = "*".repeat(luminosita);
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + puntiEsclamativi + asterischi);
        }
    }

    // Aumenta il volume
    @Override
    public void alzaVolume() {
        volume++;
    }

    // Diminuisce il volume
    @Override
    public void abbassaVolume() {
        if (volume > 1) volume--;
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

    // Getter per la durata
    public int getDurata() {
        return durata;
    }

    // Getter per il volume
    public int getVolume() {
        return volume;
    }

    // Getter per la luminosità
    public int getLuminosita() {
        return luminosita;
    }
}
