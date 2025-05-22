package duplicatecode.bad;

import switchstatements.good.Button;
import switchstatements.good.TextField;

public class LoginForm {
    private TextField emailField;       // campo de email
    private TextField passwordField;    // campo de senha
    private Button submitButton;        // botao de submissao
    
    // Metodo que inicializa os componentes
    public void initComponents () {
        // Configuracao do campo de email
        emailField = new TextField() ;
        emailField.setPlaceholder("Digite seu email");  // Placeholder do email
        emailField.setMaxLength(100);                   // Tamanho maximo 100 caracteres
        emailField.setWidth("300px");                   // Largura fixa de 300 pixels

        // Configuracao do campo de senha
        passwordField = new TextField();
        passwordField.setPlaceholder("Digite sua senha");   // Placeholder da senha
        passwordField.setMaxLength(50);                     // Tamanho maximo 50 caracteres
        passwordField.setWidth(" 300 px ");                 // Largura fixa de 300 pixels (igual ao email)
    
        // Configuracao do botao
        submitButton = new Button();
        submitButton.setText("Entrar"); // Texto do botao
        submitButton.setWidth("300px"); // Largura fixa de 300 pixels (igual aos campos)
    }
}