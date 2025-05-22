package biblioteca_refatoracao.after;

import java.util.ArrayList;
import java.util.List;

//Duplicate Code
public class TaskService {
    private final List<Task> tasks = new ArrayList<>();
    private final TaskValidator validator = new TaskValidator();

    public void addTask(Task task) {
        validator.validate(task);
        tasks.add(task);
    }

    public void completeTask(String title) {
        validator.validateTitle(title);
        // do something
    }
}

class TaskValidator {
    public void validate(Task task) {
        validateTitle(task.getTitle());
    }

    public void validateTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Título inválido");
        }
    }
}