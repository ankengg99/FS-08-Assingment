package com.example.my_first_application.model;

public class Book {
    private int id;
    private String type;
    private String name;
    private boolean available;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    public  String toString(){
        return "Book{ "+
                " id "+id+"\n"+", name "+name+"\n"+", available "
                +available+"\n"+", type "+type+"\n }";
    }
}
