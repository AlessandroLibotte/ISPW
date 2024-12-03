package ViewTTY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import Control.LoginController;

public class ViewAffittuario {

    Boolean quit;
    BufferedReader br;
    LoginController lc;

    public ViewAffittuario() {

        quit = false;
        br = new BufferedReader(new InputStreamReader(System.in));
        lc = new LoginController();

    }

    public void loginMenu() throws IOException {

        String username = null;
        String password = null;

        while(!quit) {

            System.out.println("EasyRent Login");
            System.out.println("\t1) Enter Username [" + username + "]");
            System.out.println("\t2) Enter Password [" + password + "]");
            System.out.println("\t3) Login");
            System.out.println("\t4) Register");
            System.out.println("\t5) Quit");
            System.out.print(": ");

            String action = br.readLine();

            switch(action) {
                case "1":
                    System.out.println("Enter Username");
                    System.out.print("\t: ");
                    username = br.readLine();
                    break;
                case "2":
                    System.out.println("Enter Password");
                    System.out.print("\t: ");
                    password = br.readLine();
                    break;
                case "3":
                    if(lc.validate(username, password)) mainMenu();
                    else System.out.println("Invalid Username or Password");
                    break;
                case "4":
                    registerMenu();
                    break;
                case "5":
                    quit = true;
                    break;
            }

        }

    }

    void mainMenu() throws IOException {

        String indirizzo = "Roma";
        Boolean[] filtri = new Boolean[6];

        while(!quit) {

            System.out.println("Welcome to EasyRent");
            System.out.println("\t1) Set search parameters [" + indirizzo + Arrays.toString(filtri) +"]");
            System.out.println("\t2) Search");
            System.out.println("\t3) View Profile Info");
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

    void

    void registerMenu() throws IOException {

        String username = null;
        String password = null;
        int role = 0;

        while(!quit) {

            System.out.println("Register");
            System.out.println("\t1) Enter Username [" + username + "]");
            System.out.println("\t2) Enter Password [" + password + "]");
            System.out.print("\t3) Select Role [");
            switch (role){
                case 0:
                    System.out.print("Affittuario");
                    break;
                case 1:
                    System.out.print("Locatore");
                    break;
            }
            System.out.println("]");
            System.out.println("\t4) Register");
            System.out.println("\t5) Back");

            String action = br.readLine();

            switch(action) {
                case "1":
                    System.out.println("Enter Username");
                    System.out.print("\t: ");
                    username = br.readLine();
                    break;
                case "2":
                    System.out.println("Enter Password");
                    System.out.print("\t: ");
                    password = br.readLine();
                    break;
                case "3":
                    System.out.println("Select Role [0: affittuario, 1: locatore]");
                    System.out.print("\t: ");
                    role = Integer.parseInt(br.readLine());
                    break;
                case "4":
                    lc.register(username, password, role);
                    return;
                case "5":
                    return;
            }
        }

    }

}
