package Control;
import Model.Affittuario;
import Model.Locatore;
import Model.Utente;

import java.util.Vector;

public class LoginController {

    Vector<Utente> utenti;

    public LoginController() {
        utenti = new Vector<Utente>();
    }

    public int validate(String username, String password) {

        if(utenti.isEmpty()) return 0;

        for(Utente u : utenti) {
            if(u.getUsername().equals(username) && u.getPassword().equals(password)) {
                if (u instanceof Affittuario) {
                    return 1;
                }
                if (u instanceof Locatore) {
                    return 2;
                }
                return 0;
            }
        }

        return 0;
    }

    public void register(String username, String password, int role) {

        if (role == 0) utenti.add(new Affittuario(username, password));
        else if(role == 1) utenti.add(new Locatore(username, password));

    }

}
