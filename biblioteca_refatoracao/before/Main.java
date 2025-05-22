package biblioteca_refatoracao.before;

public class Main {
    public static void main(String[] args) {
        Task oldTask = new Task("Old task", "Description", "HIGH");
        new TaskPrinter().printTaskDetails(oldTask);
    }
}