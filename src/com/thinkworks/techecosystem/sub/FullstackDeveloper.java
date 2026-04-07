package com.thinkworks.techecosystem.sub;

import com.thinkworks.techecosystem.base.Entity;
import com.thinkworks.techecosystem.enums.EntityType;

public class FullstackDeveloper extends Entity {
    public FullstackDeveloper(int id, String name, double salary) {
        super(id, name, EntityType.FULL_STACK_DEVELOPER, salary);
    }

    public void handleFrontendAndBackend(){
        System.out.println("FullstackDeveloper is handing frontend and backend");
    }

    @Override
    public void work() {
        System.out.println("FullstackDeveloper is working");
    }

    @Override
    public void performRole() {
        System.out.println("FullstackDeveloper is performing");
    }

    @Override
    public void reportStatus() {
        System.out.println("FullstackDeveloper is reporting");
    }
}
