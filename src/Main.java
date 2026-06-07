import entities.Multimedia;
import java.util.Scanner;
import entities.Audio;
import entities.Video;

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

        //test video come per audio, stesso ragionamento. Ho importato nel main il package entities.Video e gli ho passato semplicemente i parametri coi miei valori. Come si può notare dall'esecuzione ottengo il risultato desiderato.
        Video mioVideo= new Video("Video", 6, 5, 1);
       mioVideo.aumentaLuminosita();
       mioVideo.diminuisciLuminosita();
       mioVideo.play();

        //Testo anche la funzionalità dello scanner
        System.out.println("Inserisci il NUMERO del titolo del film che vuoi riprodurre da 1 a 5 ");
        int titoloFilm=scanner.nextInt();

        switch(titoloFilm){
            case 1:
                System.out.println("Harry Potter");
                break;
                case 2:
                    System.out.println("Il Signore degli Anelli");
                    break;
                    case 3:
                        System.out.println("Spider-Man");
                        break;
            case 4:
                System.out.println("Le Cronache di Narnia");
                break;
                case 5:
                    System.out.println("BatMan");
                    break;
                    default:
                        System.out.println("Vuoi riprovare?");
                        System.out.println("Consigliaci un film da inserire: ");
                        String titoloInesistente= scanner.nextLine();
                        String filmConsigliato = scanner.nextLine();
                        System.out.println("Grazie! Prenderemo in considerazione " + filmConsigliato);
                        break;
        }
    }
}

