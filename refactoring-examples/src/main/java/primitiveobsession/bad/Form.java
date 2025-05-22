package primitiveobsession.bad;

public class Form {
    private String labelText;   // String para label
    private int maxLength;      // int para tamanho máximo
    private String placeholder; // String para placeholder
    private boolean isRequired; // boolean para campo obrigatório

    public Form(String labelText, int maxLength, String placeholder, boolean isRequired) {
        this.labelText = labelText;
        this.maxLength = maxLength;
        this.placeholder = placeholder;
        this.isRequired = isRequired;
    }

    public void render() {
        System.out.println("Renderizando Form: " + labelText);

        if (isRequired && labelText.isEmpty()) {
            throw new IllegalArgumentException("Label não pode ser vazio!");
        }
    }
}