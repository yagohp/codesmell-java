import switchstatements.good.*;

public class Main {
    public static void main(String[] args) {
        // switch statements 1
        Button botao1 = new Button("Salvar", ButtonState.ACTIVE);
        Button botao2 = new Button("Cancelar", ButtonState.DISABLED);

        System.out.println(botao1.getColor()); // "azul"
        System.out.println(botao2.getColor()); // "cinza"

        // switch statements 2
        UIComponent component = UIComponentFactory.createComponent("Button", "Login");
        component.render();
    }
}