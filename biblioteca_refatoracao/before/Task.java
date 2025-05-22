package biblioteca_refatoracao.before;

public class Task {
    private String title;
    private String description;
    private String priority; // "HIGH", "MEDIUM", "LOW"
    private boolean completed;

    public Task(String title, String description, String priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.completed = false;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPriority() {
        return priority;
    }

    public boolean isCompleted() {
        return completed;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    
    public String getPriorityColor() {
        switch (priority) {
            case "HIGH": return "red";
            case "MEDIUM": return "yellow";
            case "LOW": return "green";
            default: return "gray";
        }
    }
}