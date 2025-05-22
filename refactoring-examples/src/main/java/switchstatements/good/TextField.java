package switchstatements.good;

public class TextField implements UIComponent {
    private String placeholder;

    public TextField(String placeholder) {
        this.placeholder = placeholder;
    }

    @Override
    public void render() {
        System.out.println("Render TextField: " + placeholder);
    }
}