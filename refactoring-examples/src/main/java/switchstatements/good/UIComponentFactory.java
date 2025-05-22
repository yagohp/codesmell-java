package switchstatements.good;

public class UIComponentFactory {
    public static UIComponent createComponent(String type, String props) {
        return switch (type) {
            case "TextField" -> new TextField(props);
            case "Button" -> new Button(props, ButtonState.ACTIVE);
            default -> throw new IllegalArgumentException("Tipo inválido");
        };
    }
}
