package switchstatements.good;

public class Button implements UIComponent {
    private String label;
    private ButtonState state;

    public Button(String label, ButtonState active) {
        this.label = label;
        this.state = active;
    }

    public String getColor() {
        return state.getColor();
    }

    @Override
    public void render() {
        System.out.println("Render Button: " + label);
    }
}