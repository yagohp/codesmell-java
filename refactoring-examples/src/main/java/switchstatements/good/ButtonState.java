package switchstatements.good;

public enum ButtonState {
    ACTIVE("azul"),
    DISABLED("cinza"),
    HOVER("azul-claro");

    private final String color;

    ButtonState(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
