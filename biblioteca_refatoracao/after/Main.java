package biblioteca_refatoracao.after;

public class Main {
    public static void main(String[] args) {
        // Before refactoring
        //Task oldTask = new Task("Old task", "Description", "HIGH");
        //new TaskPrinter().printTaskDetails(oldTask);

        // After refactoring
        Task newTask = new Task("New task", "Description", Priority.HIGH);
        new TaskPrinter().print(newTask);
    }
}