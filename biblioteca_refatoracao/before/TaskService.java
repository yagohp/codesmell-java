package biblioteca_refatoracao.before;

import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private List<Task> tasks = new ArrayList<>();
    
    public void addTask(Task task) {
        if (task.getTitle() == null || task.getTitle().isEmpty()) {
            throw new IllegalArgumentException("Título inválido");
        }
        tasks.add(task);
    }
    
    public void completeTask(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Título inválido");
        }
        
        // do something
    }
}
