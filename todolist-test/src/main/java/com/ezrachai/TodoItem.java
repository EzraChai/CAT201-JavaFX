package com.ezrachai;

import java.time.LocalDate;

public class TodoItem {
    private int id;
    private String todo;
    private String description;
    private String category;
    private String priority;
    private LocalDate dueDate;
    private String status;

    public TodoItem(int id, String todo, String description, String category, String priority, LocalDate dueDate) {
        this.id = id;
        this.todo = todo;
        this.description = description;
        this.category = category;
        this.priority = priority;
        this.dueDate = dueDate;
        this.status = "Not Started";
    }

    public int getId() {
        return id;
    }

    public String getTodo() {
        return todo;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getPriority() {
        return priority;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setDueDate(LocalDate dueDate) {
        if (dueDate.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Due date cannot be in the past");
        }
        this.dueDate = dueDate;
    }

    public void setNextStatus() {
        switch (status) {
            case "Not Started":
                status = "In Progress";
                break;
            case "In Progress":
                status = "Completed";
            default:
                break;
        }
    }
}
