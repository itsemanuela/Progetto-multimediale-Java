package entities;
import Interfaces.RegolaLuminosita;

public class Immagine extends Multimedia implements RegolaLuminosita {
    private int luminosita;

    // Costruttore solito con parametri
    public Immagine(String titolo, int luminositaIniziale) {
        super(titolo);
        this.luminosita = luminositaIniziale;
    }

    // Gestione Luminosità con l'interfaccoa
    @Override
    public void aumentaLuminosita() {
        luminosita = luminosita + 1;
    }

    @Override
    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita = luminosita - 1;
        }
    }

    // Metodo specifico per le immagini: stampa il titolo seguito dagli asterischi (*) della luminosità
    public void show() {
        System.out.print(titolo + " ");
        for (int l = 0; l < luminosita; l++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
