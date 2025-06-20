package Multimedia;

import Interface.Play;

import java.util.Scanner;

// Classe principale per la gestione del player multimediale
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Multimedia[] elementi = new Multimedia[5];

        // Inserimento dei 5 elementi multimediali da tastiera
        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci tipo elemento (1=Audio, 2=Video, 3=Immagine): ");
            int tipo = Integer.parseInt(scanner.nextLine());
            System.out.print("Titolo: ");
            String titolo = scanner.nextLine();

            switch (tipo) {
                case 1:
                    // Creazione Audio
                    System.out.print("Durata: ");
                    int durataA = Integer.parseInt(scanner.nextLine());
                    System.out.print("Volume: ");
                    int volumeA = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new Audio(titolo, durataA, volumeA);
                    break;
                case 2:
                    // Creazione Video
                    System.out.print("Durata: ");
                    int durataV = Integer.parseInt(scanner.nextLine());
                    System.out.print("Volume: ");
                    int volumeV = Integer.parseInt(scanner.nextLine());
                    System.out.print("Luminosità: ");
                    int lumV = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new Video(titolo, durataV, volumeV, lumV);
                    break;
                case 3:
                    // Creazione Immagine
                    System.out.print("Luminosità: ");
                    int lumI = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new Immagine(titolo, lumI);
                    break;
                default:
                    System.out.println("Tipo non valido, riprova.");
                    i--;
            }
        }

        // Ciclo per eseguire gli elementi scelti dall'utente
        int scelta = -1;
        while (scelta != 0) {
            System.out.println("\nQuale elemento vuoi eseguire? (1-5, 0 per uscire): ");
            scelta = Integer.parseInt(scanner.nextLine());
            if (scelta >= 1 && scelta <= 5) {
                Multimedia elem = elementi[scelta - 1];
                // Se è un'immagine, mostra l'immagine
                if (elem instanceof Immagine) {
                    ((Immagine) elem).show();
                    // Se è riproducibile, avvia la riproduzione
                } else if (elem instanceof Play) {
                    ((Play) elem).play();
                }
            } else if (scelta != 0) {
                System.out.println("Scelta non valida.");
            }
        }
        scanner.close();
    }
}
