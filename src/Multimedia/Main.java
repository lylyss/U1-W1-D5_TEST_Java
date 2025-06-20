package Multimedia;

// Classe principale per la gestione del player multimediale
public class Main {
    public static void main(String[] args) {
        
        Audio audio = new Audio("Registrazione1", 3, 5);
        System.out.println("Riproduzione Audio:");
        audio.play();

        System.out.println("Alza volume e riproduci di nuovo:");
        audio.alzaVolume();
        audio.play();
    }
}
