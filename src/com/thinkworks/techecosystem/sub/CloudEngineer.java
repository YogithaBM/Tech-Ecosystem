package com.thinkworks.techecosystem.sub;

import com.thinkworks.techecosystem.base.Entity;
import com.thinkworks.techecosystem.enums.EntityType;

public class CloudEngineer extends Entity {
    public CloudEngineer(int id, String name, double salary) {
        super(id, name, EntityType.CLOUD_ENGINEER, salary);
    }

    public void manageCloudInfrastructure(){
        System.out.println("CloudEngineer is managing cloud infrastructure");
    }

    @Override
    public void work() {
        System.out.println("CloudEngineer is working");
    }

    @Override
    public void performRole() {
        System.out.println("CloudEngineer is performing");
    }

    @Override
    public void reportStatus() {
        System.out.println("CloudEngineer is reporting");
    }
}
