package entities;

import Interfaces.Riproducibile;

public class Audio extends Multimedia implements Riproducibile {
    private int durata;
    private int volume;

// qui ho costruito l'oggetto passandogli tre parametri (titolo, durata e volumeiniziale), con la keyword super ho preso il titolo e l'ho "spedito" a Multimedia in modo da salvarlo in memoria in quanto avevo già costruito in Multimedia la variabile per contenere quel "titolo".
    public Audio(String titolo, int durata, int volumeIniziale) {
        super(titolo);
        this.durata = durata;
        this.volume = volumeIniziale;
    }

    public void alzaVolume() {
        volume = volume + 1;
    }

    public void abbassaVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }


    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.print(titolo + " ");
            for (int v = 0; v < volume; v++) {
                // incremento di stampa, infatti sout mi restituisce cinque punti esclamativi.
                System.out.print("!");
            }

            System.out.println();
        }
    }
}