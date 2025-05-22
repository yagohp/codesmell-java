package longmethod.bad;

import switchstatements.good.*;

public class Form {
    private TextField name;
    private TextField email;
    private Button submitButton;

    public void renderForm() {
        if (name.getText().isEmpty()) {
            System.out.println(" Nome nao pode ser vazio ! ");
            return;
        }
        if (!email.getText().contains(" @ ")) {
            System.out.println("E - mail invalido ! ");
            return;
        }

        System.out.println(" Renderizando formulario ... ");
        System.out.println(" Nome : " + name.getText());
        System.out.println("E - mail : " + email.getText());
        System.out.println(" B o t o : " + submitButton.getLabel());

        submitButton.setOnClick(() -> {
            if (validateForm()) {
                sendToServer();
            }
        });
    }

    private boolean validateForm() { /* ... */ }

    private void sendToServer() { /* ... */ }
}