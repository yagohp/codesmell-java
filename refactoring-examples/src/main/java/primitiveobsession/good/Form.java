package primitiveobsession.good;

public class Form {
    private final UIText label;
    private final FieldConfig config;

    public Form(UIText label, FieldConfig config) {
        this.label = label;
        this.config = config;
    }

    public void render() {
        System.out.println("Renderizando Form: " + label.getValue());
        // Lógica mais limpa (as validações já estão nos objetos)
    }
}