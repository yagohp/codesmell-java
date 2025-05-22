package biblioteca_refatoracao.after;

// Primitive Obsession
public class Task {
    private final String title;
    private final String description;
    private final Priority priority;
    private boolean completed;

    public Task(String title, String description, Priority priority) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    // GETTERS
    public String getTitle() { 
        return title; 
    }

    public String getDescription() {
        return description; 
    }

    public Priority getPriority() { 
        return priority; 
    }

    public boolean isCompleted() { 
        return completed; 
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void markAsComplete() {
        this.completed = true;
    }
}
