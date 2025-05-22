package biblioteca_refatoracao.after;

// Long Method
public class TaskPrinter {
    private static final String HEADER = "----- DETALHES DA TAREFA -----";
    private static final String FOOTER = "-----------------------------";

    public void print(Task task) {
        printHeader();
        printField("Título", task.getTitle());
        printOptionalField("Descrição", task.getDescription());
        printPriority(task.getPriority());
        printStatus(task.isCompleted());
        printFooter();
    }

    private void printHeader() { System.out.println(HEADER); }
    private void printFooter() { System.out.println(FOOTER); }

    private void printField(String label, String value) {
        System.out.printf("%s: %s%n", label, value);
    }

    private void printOptionalField(String label, String value) {
        if (value != null && !value.isEmpty()) {
            printField(label, value);
        }
    }

    private void printPriority(Priority priority) {
        printField("Prioridade", priority.getLabel());
        printField("Cor", priority.getColor());
    }

    private void printStatus(boolean completed) {
        printField("Status", completed ? "Concluída" : "Pendente");
    }
}