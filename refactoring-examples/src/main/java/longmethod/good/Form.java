package longmethod.good;

public class Form {
    private TextField name;
    private TextField email;
    private Button submitButton;

    public void render() {
        if (!validateFields())
            return;
        renderFields();
        setupEvents();
    }

    private boolean validateFields() {
        if (name.getText().isEmpty()) {
            System.out.println(" Nome nao pode ser vazio ! ");
            return false;
        }
        if (!email.getText().contains(" @ ")) {
            System.out.println("E - mail invalido ! ");
            return false;
        }
        return true;
    }

    private void setupEvents() {
        submitButton.setOnClick(() -> {
            if (validateForm()) {
                sendToServer();
            }
        });
    }

    private boolean validateForm() { /* ... */ }

    private void sendToServer() { /* ... */ }
}