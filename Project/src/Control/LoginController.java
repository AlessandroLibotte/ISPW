package Control;
import Model.Affittuario;
import Model.Locatore;
import Model.Utente;

import java.util.Objects;
import java.util.Vector;

public class LoginController {

    Vector<Utente> utenti;

    public LoginController() {
        utenti = new Vector<Utente>();
    }

    public boolean validate(String username, String password) {

        if(utenti.isEmpty()) return false;

        for(Utente u : utenti) {
            if(u.getUsername().equals(username) && u.getPassword().equals(password)) return true;
        }

        return false;
    }

    public void register(String username, String password, int role) {

        if (role == 0) utenti.add(new Affittuario(username, password));
        else if(role == 1) utenti.add(new Locatore(username, password));

    }

}
