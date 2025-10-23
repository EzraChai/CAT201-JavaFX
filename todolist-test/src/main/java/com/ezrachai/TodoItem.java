package com.ezrachai;

import java.time.LocalDate;

public class TodoItem {
    private int id;
    private String todo;
    private String description;
    private String category;
    private String priority;
    private LocalDate dueDate;

    public TodoItem(int id, String todo, String description, String category, String priority, LocalDate dueDate) {
        this.id = id;
        this.todo = todo;
        this.description = description;
        this.category = category;
        this.priority = priority;
        this.dueDate = dueDate;
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
        this.dueDate = dueDate;
    }
}
