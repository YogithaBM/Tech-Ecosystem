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

    public void reportStatus(){
        System.out.println("Entity is reposting status");
    }

    public void work(){
        System.out.println("Entity is working");
    }

    public void performRole(){
        System.out.println("Entity is performing its role");
    }

    public void displayDetails(){

        System.out.println("Entity Details");
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Entity type : "+entityType);
        System.out.println("Salary : "+salary);
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
