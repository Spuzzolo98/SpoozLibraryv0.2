//questa classe scrive su un file una linea e va a capo.
package gestionefile;

import java.io.FileWriter;

public class Scrittura {

    public static void Scrivi(String v, String file, boolean aggiungi) throws Exception {
        FileWriter fw = new FileWriter(file, aggiungi);
        //dopo aver scritto una riga nel file il programma va a capo, procurando una linea nuova
        fw.write(v + "\r\n");
        fw.close();
    }
}
