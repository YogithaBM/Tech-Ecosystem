package com.thinkworks.techecosystem.sub;

import com.thinkworks.techecosystem.base.Entity;
import com.thinkworks.techecosystem.enums.EntityType;

public class BackendDeveloper extends Entity {
    public BackendDeveloper(int id, String name, double salary) {
        super(id, name,EntityType.BACKEND_DEVELOPER, salary);
    }

    public void buildAPI(){
        System.out.println("BackendDeveloper is building APIS");
    }

    @Override
    public void work() {
        System.out.println("BackendDeveloper is working");
    }

    @Override
    public void performRole() {
        System.out.println("BackendDeveloper is performing");
    }

    @Override
    public void reportStatus() {
        System.out.println("BackendDeveloper is reporting");
    }
}
