package primitiveobsession.good;

public class UIText {
    private final String value;
    private final int maxLength;

    public UIText(String value, int maxLength) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Texto não pode ser vazio");
        }
        if (maxLength <= 0) {
            throw new IllegalArgumentException("Tamanho máximo deve ser positivo");
        }
        this.value = value;
        this.maxLength = maxLength;
    }

    public String getValue() { return value; }
}