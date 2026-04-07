package com.thinkworks.techecosystem.sub;

import com.thinkworks.techecosystem.base.Entity;
import com.thinkworks.techecosystem.enums.EntityType;

public class Manager extends Entity {
    public Manager(int id, String name, double salary) {
        super(id, name, EntityType.MANAGER, salary);
    }

    public void managing(){
        System.out.println("Manager is  managing team");
    }

    @Override
    public void work() {
        System.out.println("Manager is working");
    }

    @Override
    public void performRole() {
        System.out.println("Manager is performing");
    }

    @Override
    public void reportStatus() {
        System.out.println("Manager is reporting");
    }
}
