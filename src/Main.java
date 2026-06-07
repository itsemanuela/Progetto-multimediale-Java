import entities.Multimedia;
import java.util.Scanner;
import entities.Audio;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


// L'array di tipo Multimedia[] (che è il papà comune),può ospitare contemporaneamente oggetti diversi (Audio, Video e Immagini). (Polimorfismo)
        Multimedia[] elementi = new Multimedia[5];

        System.out.println("CONFIGURAZIONE LETTORE MULTIMEDIALE");

        //Test audio
        Audio mioAudio = new Audio("Canzone", 3, 4);
        mioAudio.alzaVolume();
        mioAudio.play();

        //Funziona correttamente percè ho stampato il titolo per 3 volte che sarebbe la durata, mi stampa 5 punti escalamtivi perchè ho incrementato di 1 nella class Audio.

    }
}