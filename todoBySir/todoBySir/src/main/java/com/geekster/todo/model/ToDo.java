package com.geekster.todo.model;

public class ToDo {

    private int id;

    private boolean status;

    private String title;

    public ToDo() {
    }

    public ToDo(int id, String title, boolean status) {
        this.id = id;
        this.status = status;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +"\n"+
                ", title='" + title + '\'' +
                ", status=" + status +
                '}';
    }
}
