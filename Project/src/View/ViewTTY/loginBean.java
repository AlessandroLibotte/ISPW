package View.ViewTTY;

import Control.LoginController;

public class loginBean {

    LoginController lc;

    public loginBean() {
        lc = new LoginController();
    }

    public int validate(String username, String password) {

        if (username == null || password == null) return 0;
        if (username.isEmpty() || username.length() > 26) return 0;
        if (password.isEmpty() || password.length() > 26) return 0;

        return lc.validate(username, password);
    }

    public boolean validate(String username, String password, int role) {

        if (username == null || password == null) return false;
        if (username.isEmpty() || username.length() > 26) return false;
        if (password.isEmpty() || password.length() > 26) return false;

        lc.register(username, password, role);
        return true;
    }

}
