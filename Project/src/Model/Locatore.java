package Model;

public class Locatore extends Utente{

    Annuncio[] annunci;

    public Locatore(String username, String password) {
        super(username, password);
    }

    public Annuncio[] getAnnunci(){
        return annunci;
    }

}
