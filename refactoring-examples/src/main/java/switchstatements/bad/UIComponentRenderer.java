package switchstatements.bad;

public class UIComponentRenderer {
    public void render(String componentType, String props) {
        switch (componentType) {
            case " ":
                System.out.println("Render TextField: " + props);
                break;
            case "Button":
                System.out.println("Render Button: " + props);
                break;
            case "Checkbox":
                System.out.println("Render Checkbox: " + props);
                break;
            default:
                throw new IllegalArgumentException("Tipo inválido");
        }
    }
}