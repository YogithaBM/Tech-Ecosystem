package com.thinkworks.techecosystem.sub;

import com.thinkworks.techecosystem.base.Entity;
import com.thinkworks.techecosystem.enums.EntityType;

public class FrontendDeveloper extends Entity {
    public FrontendDeveloper(int id, String name, double salary) {
        super(id, name, EntityType.FRONTEND_DEVELOPER, salary);
    }

    public void designUI(){
        System.out.println("FrontendDeveloper is designing UIs");
    }

    @Override
    public void work() {
        System.out.println("FrontendDeveloper is working");
    }

    @Override
    public void performRole() {
        System.out.println("FrontendDeveloper is performing");
    }

    @Override
    public void reportStatus() {
        System.out.println("FrontendDeveloper is reporting");
    }
}
