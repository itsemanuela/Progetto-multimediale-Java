import entities.Immagine;
import entities.Multimedia;
import java.util.Scanner;
import entities.Audio;
import entities.Video;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


// L'array di tipo Multimedia[] (che è il papà comune),può ospitare contemporaneamente oggetti diversi (Audio, Video e Immagini). (Polimorfismo, userò alla fine)
        //Multimedia[] elementi = new Multimedia[5];

        System.out.println("CONFIGURAZIONE LETTORE MULTIMEDIALE");

        //Test audio
        Audio mioAudio = new Audio("Canzone", 3, 4);
        mioAudio.alzaVolume();
        mioAudio.play();

        //Funziona correttamente percè ho stampato il titolo per 3 volte che sarebbe la durata, mi stampa 5 punti escalamtivi perchè ho incrementato di 1 nella class Audio.

        //Test video come per audio, stesso ragionamento. Ho importato nel main il package entities.Video e gli ho passato semplicemente i parametri coi miei valori. Come si può notare dall'esecuzione ottengo il risultato desiderato.
        Video mioVideo= new Video("Video", 6, 5, 1);
       mioVideo.aumentaLuminosita();
       mioVideo.diminuisciLuminosita();
       mioVideo.play();

        //Testo anche la funzionalità dello scanner ma questo switch non era richiesto, solo PROVA
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


        //Immagini
        Immagine immagine = new Immagine("Mare", 5);
        Immagine immagine2 = new Immagine("Natale", 2);
        immagine.show();
        immagine2.show();



        //ora per popolare l'array ripredno la riga iniziale
        System.out.println("\n--- INIZIO ESERCIZIO ARRAY ---");
        Scanner scannerLettore = new Scanner(System.in);

        // 1. Creazione dell'array vuoto da 5 posti che ho iniziaato prima
        Multimedia[] elementi = new Multimedia[5];

        // con ciclo for chiedo all'utente i dati per 5 volte come richiesto
        for (int i = 0; i < 5; i++) {
            System.out.println("Elemento " + (i + 1) + " di 5");
            System.out.print("Scegli il tipo (1 = Audio, 2 = Video, 3 = Immagine): ");
            int tipo = scannerLettore.nextInt();
            scannerLettore.nextLine();

            System.out.print("Inserisci il titolo: ");
            String titolo = scannerLettore.nextLine();

            if (tipo == 1) { //per audio
                System.out.print("Inserisci durata: ");
                int durata = scannerLettore.nextInt();
                System.out.print("Inserisci volume: ");
                int volume = scannerLettore.nextInt();
                elementi[i] = new Audio(titolo, durata, volume);
            }
            else if (tipo == 2) { //per video
                System.out.print("Inserisci durata: ");
                int durata = scannerLettore.nextInt();
                System.out.print("Inserisci volume: ");
                int volume = scannerLettore.nextInt();
                System.out.print("Inserisci luminosità: ");
                int luminosita = scannerLettore.nextInt();
                elementi[i] = new Video(titolo, durata, volume, luminosita);
            }
            else if (tipo == 3) { // se la scelta è foto
                System.out.print("Inserisci luminosità: ");
                int luminosita = scannerLettore.nextInt();
                elementi[i] = new Immagine(titolo, luminosita);
            }
            System.out.println("Salvato!");
        }

        //  while perchè non so fino a quando utente scriverà, cioè finche non preme 0, devo continuare a richiedere informazioni
        int scelta = 1; //devo insierire un numero diverso da 0  altrimetni non entrerò nel ciclo while
        while (scelta != 0) {
            System.out.print("\nScegli un numero da 1 a 5 per riprodurre (0 per uscire): ");
            scelta = scannerLettore.nextInt();

            if (scelta >= 1 && scelta <= 5) { //con operatore AND && verifico se entrambe le condizioni nelle parentesi sono vere
                Multimedia elementoScelto = elementi[scelta - 1];

                // controllo
                if (elementoScelto instanceof Audio) {
                    ((Audio) elementoScelto).play();
                }
                else if (elementoScelto instanceof Video) {
                    ((Video) elementoScelto).play();
                }
                else if (elementoScelto instanceof Immagine) {
                    ((Immagine) elementoScelto).show();
                }
            }
            else if (scelta != 0) {
                System.out.println("Scelta non valida! Solo numeri da 1 a 5.");
            }
        }

        System.out.println("Fine esercizio!");
    }





    }




