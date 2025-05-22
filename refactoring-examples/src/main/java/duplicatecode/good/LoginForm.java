package duplicatecode.good;

import switchstatements.good.Button;
import switchstatements.good.TextField;

public class LoginForm {
    private TextField emailField; // campo de email
    private TextField passwordField; // campo de senha
    private Button submitButton; // botao de submissao

    private TextField createTextField(String placeholder, int maxLength) {
        TextField field = new TextField();
        field.setPlaceholder(placeholder);
        field.setMaxLength(maxLength);
        field.setWidth("300px");
        return field;
    }

    private static final String FORM_WIDTH = " 300 px ";
    private static final int MAX_EMAIL_LENGTH = 100;
    private static final int MAX_PASSWORD_LENGTH = 50;

    public void initComponents () {
        emailField = createTextField ( "Digite seu email", MAX_EMAIL_LENGTH);
        passwordField = createTextField ( "Digite sua senha", MAX_PASSWORD_LENGTH);
        submitButton = new Button ();
        submitButton.setText ("Entrar");
        submitButton.setWidth (FORM_WIDTH);
    }
}