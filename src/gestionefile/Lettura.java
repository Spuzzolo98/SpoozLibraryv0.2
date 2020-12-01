//questa classe legge un file .txt ed inserisce ogni riga in una lista di stringhe.
package gestionefile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Lettura {

    public static ArrayList<String> Letturalista(String nomefile) throws Exception {
        ArrayList<String> Lista = new ArrayList<String>(); //dichiarazione lista vuota
        FileReader fr = new FileReader(nomefile); //nomefile è preso dal programma usato e determina in che file stiamo lavorando
        BufferedReader br = new BufferedReader(fr);

        String messaggio = ""; //dichiarazione di una stringa vuota, per il .add nella lista

        String riga = br.readLine(); //lettura di una riga da un file
        while (riga != null) {

            messaggio = riga; //inserimento della riga in una stringa
            Lista.add(messaggio); //aggiunta stringa contenente linea nella lista
            riga = br.readLine();
        }
        fr.close();
        return Lista; //a questo punto si ha una lista che come oggetti ha le linee del file
    }
}
