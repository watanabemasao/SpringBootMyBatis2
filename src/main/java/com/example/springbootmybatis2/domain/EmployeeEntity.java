package com.example.springbootmybatis2.domain;

public class EmployeeEntity {
    private int id;
    private String name;

    public EmployeeEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
