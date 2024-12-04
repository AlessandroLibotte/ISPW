package View.ViewTTY;

import View.View;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ViewTTYLogin {

    boolean quit;
    BufferedReader br;
    loginBean lb;
    View vm;

    public ViewTTYLogin() {

        quit = false;
        br = new BufferedReader(new InputStreamReader(System.in));
        lb = new loginBean();

    }

    public void loginMenu() throws IOException {

        String username = "";
        String password = "";

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
                    int res = lb.validate(username, password);
                    if (res == 1) {
                        vm = new ViewTTYAffittuario();
                        vm.mainMenu();
                    } else if (res == 2) {
                        vm = new ViewTTYLocatore();
                        vm.mainMenu();
                    } else System.out.println("Invalid Username or Password");
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

    void registerMenu() throws IOException {

        String username = "";
        String password = "";
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
                    if (lb.validate(username, password, role)) return;
                    else System.out.println("Invalid Username or Password");
                    break;
                case "5":
                    return;
            }
        }

    }

}
