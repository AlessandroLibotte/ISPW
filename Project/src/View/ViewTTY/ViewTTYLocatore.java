package View.ViewTTY;

import View.View;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ViewTTYLocatore implements View {

    boolean quit;
    BufferedReader br;

    public ViewTTYLocatore() {
        quit = false;
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public void mainMenu() throws IOException {

        while(!quit) {

            System.out.println("Welcome to EasyRent Locatore");
            System.out.println("\t1) Visualizza i tuoi annunci");
            System.out.println("\t2) Crea nuovo annuncio");
            System.out.println("\t3) Cerca compagnia");
            System.out.println("\t4) View Profile Info");
            System.out.println("\t5) Log off");
            System.out.println("\t6) Quit");

            String action = br.readLine();

            switch(action) {
                case "1":
                case "2":
                case "3":
                case "4":
                    break;
                case "5":
                    return;
                case "6":
                    quit = true;
                    break;
            }
        }
    }

}
