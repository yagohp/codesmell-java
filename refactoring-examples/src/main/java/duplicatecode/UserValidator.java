package duplicatecode;

public class UserValidator {
    public boolean validateEmail(String email) {
        return isEmailValid(email);
    }

    public boolean validateLogin(String email, String password) {
        return isEmailValid(email) && password != null && !password.isEmpty();
    }

    private boolean isEmailValid(String email) {
        return email != null && !email.isEmpty() && email.contains("@") && email.contains(".");
    }
}