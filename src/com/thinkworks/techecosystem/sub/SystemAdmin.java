package com.thinkworks.techecosystem.sub;

import com.thinkworks.techecosystem.base.Entity;
import com.thinkworks.techecosystem.enums.EntityType;

public class SystemAdmin extends Entity {
    public SystemAdmin(int id, String name, double salary) {
        super(id, name, EntityType.SYSTEM_ADMIN, salary);
    }

    public void maintainServers(){
        System.out.println("System Admin is maintaining systems");
    }

    @Override
    public void work() {
        System.out.println("SystemAdmin is working");
    }

    @Override
    public void performRole() {
        System.out.println("SystemAdmin is performing");
    }

    @Override
    public void reportStatus() {
        System.out.println("SystemAdmin is reporting");
    }
}
