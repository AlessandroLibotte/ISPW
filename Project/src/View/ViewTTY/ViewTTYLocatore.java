package View.ViewTTY;

import View.View;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ViewTTYLocatore implements View {

    boolean quit;
    BufferedReader br;

    public ViewTTYLocatore() {
        quit = false;
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public void mainMenu() throws IOException {

        String indirizzo = "Roma";
        boolean[] filtri = new boolean[6];

        while(!quit) {

            System.out.println("Welcome to EasyRent Locatore");
            System.out.println("\t1) Set search parameters [" + indirizzo + Arrays.toString(filtri) +"]");
            System.out.println("\t2) Search");
            System.out.println("\t3) View Profile Info");
            System.out.println("\t4) Visualizza i tuoi Annunci");
            System.out.println("\t4) Log off");

            String action = br.readLine();

            switch(action) {
                case "1":
                case "2":
                case "3":
                    break;
                case "4":
                    return;
            }
        }
    }

    public void cercaAnnuncio(){
        return;
    }
}
