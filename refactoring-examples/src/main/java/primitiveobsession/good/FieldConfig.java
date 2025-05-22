package primitiveobsession.good;

public class FieldConfig {
    private final UIText placeholder;
    private final boolean isRequired;

    public FieldConfig(UIText placeholder, boolean isRequired) {
        this.placeholder = placeholder;
        this.isRequired = isRequired;
    }
}