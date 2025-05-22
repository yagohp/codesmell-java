package biblioteca_refatoracao.after;

public enum Priority {
    HIGH("red", "Alta"),
    MEDIUM("yellow", "Média"),
    LOW("green", "Baixa");

    private final String color;
    private final String label;

    Priority(String color, String label) {
        this.color = color;
        this.label = label;
    }

    public String getColor() {
        return color;
    }

    public String getLabel() {
        return label;
    }
}