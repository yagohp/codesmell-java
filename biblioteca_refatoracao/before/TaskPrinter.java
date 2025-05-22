package biblioteca_refatoracao.before;

public class TaskPrinter {
    public void printTaskDetails(Task task) {
        // Header
        System.out.println("----- DETALHES DA TAREFA -----");
        
        // Title
        System.out.println("Título: " + task.getTitle());
        
        // Description
        if (task.getDescription() != null && !task.getDescription().isEmpty()) {
            System.out.println("Descrição: " + task.getDescription());
        }
        
        // Priority
        System.out.println("Prioridade: " + task.getPriority());
        System.out.println("Cor: " + task.getPriorityColor());
        
        // Status
        System.out.println("Status: " + (task.isCompleted() ? "Concluída" : "Pendente"));
        
        // Footer
        System.out.println("-----------------------------");
    }
}