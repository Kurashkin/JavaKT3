import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public void viewAllTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void sortByCreationDate() {
        tasks.sort((task1, task2) -> task1.getCreationDate().compareTo(task2.getCreationDate()));
    }
}