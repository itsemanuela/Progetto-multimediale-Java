package entities;
import Interfaces.Riproducibile;

// Anche Video, come Audio estende Multimedia (per il titolo) e implementa Riproducibile (per il play) che però andrò a sovrascrivere in quanto qui ho un ulteriore parametro.
public class Video extends Multimedia implements Riproducibile {
    private int durata;
    private int volume;
    private int luminosita;

    //metto questi "dati sensibili" private per la "legge dell'incapsulamento" (sicurezza).

    // COSTRUTTORE: passo 4 parametri come per Audio
    public Video(String titolo, int durata, int volumeIniziale, int luminositaIniziale) {
        // anche qui prendo titolo e lo mando a multimedia
        super(titolo);
        this.durata = durata;
        this.volume = volumeIniziale;
        this.luminosita = luminositaIniziale;
    }

    // stessa cosa fatta per audio
    public void alzaVolume() {
        volume = volume + 1;
    }

    public void abbassaVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }

    //  gestione Luminosità solo per video al momento
    public void aumentaLuminosita() {
        luminosita = luminosita + 1;
    }

    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita = luminosita - 1;
        }
    }

    // Il metodo play() del Video deve stampare sia il volume (!) che la luminosità (*), per cui riscrivo il metodo play personalizzandolo
    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.print(titolo + " ");
            for (int v = 0; v < volume; v++) {
                System.out.print("!");
            }

            // ciclo for per la luminosità
            for (int l = 0; l < luminosita; l++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}