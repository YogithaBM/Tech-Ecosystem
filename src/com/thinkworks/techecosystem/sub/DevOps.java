package com.thinkworks.techecosystem.sub;

import com.thinkworks.techecosystem.base.Entity;
import com.thinkworks.techecosystem.enums.EntityType;

public class DevOps extends Entity {
    public DevOps(int id, String name, double salary) {
        super(id, name, EntityType.DEVOPS, salary);
    }

    public void deployApplication(){
        System.out.println("DevOps is deploying the application");
    }

    @Override
    public void work() {
        System.out.println("DevOps is working");
    }

    @Override
    public void performRole() {
        System.out.println("DevOps is performing");
    }

    @Override
    public void reportStatus() {
        System.out.println("DevOps is reporting");
    }
}
