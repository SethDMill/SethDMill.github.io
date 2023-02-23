import java.util.Date;
import java.util.List;

public class ChecklistController extend checklist extend ChecklistView{
    private Checklist model;
    private ChecklistView view;

    public ChecklistController(Checklist model, ChecklistView view) {
        this.model = model;
        this.view = view;
        
        //Implement here 
    }

    public void setChecklistName(String name) {
        model.setName(name);
        
    }

    public String getChecklistName() {
        return model.getName();
    }

    public void setChecklistDueDate(Date dueDate) {
        model.setDueDate(dueDate);
    }

    public Date getChecklistDueDate() {
        return model.getDueDate();
    }

    public void regulations() {
        // implemntations of restrictions depending on employee or employer
    }
    
public class ChecklistView {
    public void displayChecklist(Checklist checklist) {
        // logic to display the checklist to the user
    }

    public void displayTasks(List<Task> tasks) {
        // logic to display the tasks to the user
    }

    public void displayError(String message) {
        // logic to display an error message to the user
    }
}
   
import java.util.Date;
import java.util.List;

public class Checklist {
    private int id;
    private String name;
    private Date dueDate;
    private String regulations;
    private List<Task> tasks;

    public Checklist(int id, String name, Date dueDate, String regulations, List<Task> tasks) {
        this.id = id;
        this.name = name;
        this.dueDate = dueDate;
        this.regulations = regulations;
        this.tasks = tasks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public String getRegulations() {
        return regulations;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}

public class Task {
    private int id;
    private String description;
    private List<String> requiredDocs;
    private boolean completed;

    public Task(int id, String description, List<String> requiredDocs) {
        this.id = id;
        this.description = description;
        this.requiredDocs = requiredDocs;
        this.completed = false;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getRequiredDocs() {
        return requiredDocs;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String toString()
    {
        
    }
}

public class Schedule {
    private int id;
    private int checklistId;
    private int userId;
    private Date assignedDate;

    public Schedule(int id, int checklistId, int userId, Date assignedDate) {
        this.id = id;
        this.checklistId = checklistId;
        this.userId = userId;
        this.assignedDate = assignedDate;
    }

    public String toString()
    {
        
    }
    
}

public class Report {
    private int id;
    private int checklistId;
    private float completionRate;
    private List<String> complianceIssues;

    public Report(int id, int checklistId, float completionRate, List<String> complianceIssues) {
        this.id = id;
        this.checklistId = checklistId;
        this.completionRate = completionRate;
        this.complianceIssues = complianceIssues;
    }

    public String toString()
    {
        
    }

}
    
