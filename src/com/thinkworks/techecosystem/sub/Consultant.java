package com.thinkworks.techecosystem.sub;

import com.thinkworks.techecosystem.base.Entity;
import com.thinkworks.techecosystem.enums.EntityType;

public class Consultant extends Entity {
    public Consultant(int id, String name, double salary) {
        super(id, name, EntityType.CONSULTANT, salary);
    }

    public void provideSolution(){
        System.out.println("Consultant is providing solution");
    }

    @Override
    public void work() {
        System.out.println("Consultant is working");
    }

    @Override
    public void performRole() {
        System.out.println("Consultant is performing");
    }

    @Override
    public void reportStatus() {
        System.out.println("Consultant is reporting");
    }


}
