package service;

public class LoginService {
    public boolean authenticate(String userName, String password) {
        if (password == null || password.trim().equals("")) {
            return false;
        }
        return true;
    }
}
