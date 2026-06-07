package entities;

// Parto dalla classe astratta base Multimedia. Contiene l'attributo titolo che è comune a tutti gli elementi (audio, video e immagini) e il costruttore. È astratta perché non ha senso creare un oggetto 'multimedia' generico; serve solo come modello per le classi specifiche. Rappresenta solo l'idea generale di un file multimediale //



public abstract class Multimedia {
    protected String titolo;

    // Costruttore
    public Multimedia(String titolo) {
        this.titolo = titolo;
    }

    // Metodo getter per leggere il titolo
    public String getTitolo() {
        return titolo;
    }
}