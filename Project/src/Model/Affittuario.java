package Model;

public class Affittuario extends Utente{

    private Prenotazione[] prenotazioni;

    public Affittuario(String username, String password) {
        super(username, password);
    }

    public Prenotazione[] getPrenotazioni() {
        return prenotazioni;
    }

}
