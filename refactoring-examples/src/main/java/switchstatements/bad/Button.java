package switchstatements.bad;

public class Button {
    private String label;
    private boolean isDisabled;

    public String getColor() {
        if (isDisabled) {
            return "cinza";
        } else {
            return "azul";
        }
    }
}