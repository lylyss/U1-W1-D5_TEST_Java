package Multimedia;

import Interface.Play;
import Interface.Volume;

// Classe che rapresenta una registrazione audio riproducibil con volume regolable
public class Audio extends Multimedia implements Play, Volume {
    private int durata;
    private int volume;

    // Costruttore
    public Audio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = Math.max(1, durata);
        this.volume = Math.max(1, volume);
    }

    // Riproduce audio stampando il titolo seguito da punti esclamativi per il volume, per ogni unita di durata
    @Override
    public void play() {
        String puntiEsclamativi = "!".repeat(volume);
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + puntiEsclamativi);
        }
    }

    // Aumenta il volume
    @Override
    public void alzaVolume() {
        volume++;
    }

    // Diminuisce il volume (min 1)
    @Override
    public void abbassaVolume() {
        if (volume > 1) volume--;
    }

    // Getter per la durata
    public int getDurata() {
        return durata;
    }

    // Getter per il volume
    public int getVolume() {
        return volume;
    }
}
