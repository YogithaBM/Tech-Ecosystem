package com.thinkworks.techecosystem.base;

import com.thinkworks.techecosystem.enums.EntityType;

public class Entity {
    private int id;
    private String name;
    private EntityType entityType;
    private double salary;

    public Entity(int id, String name, EntityType entityType, double salary) {
        this.id = id;
        this.name = name;
        this.entityType = entityType;
        this.salary = salary;
    }

    public Entity(){

    }

    public void displayDetails(){
        System.out.println("Entity Details");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
