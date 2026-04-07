package com.thinkworks.techecosystem.sub;

import com.thinkworks.techecosystem.base.Entity;
import com.thinkworks.techecosystem.enums.EntityType;

public class MobileDeveloper extends Entity {
    public MobileDeveloper(int id, String name, double salary) {
        super(id, name,EntityType.MOBILE_DEVELOPER, salary);
    }

    public void developMobileApp(){
        System.out.println("MobileDeveloper is developing mobile apps");
    }

    @Override
    public void work() {
        System.out.println("MobileDeveloper is working");
    }

    @Override
    public void performRole() {
        System.out.println("MobileDeveloper is performing");
    }

    @Override
    public void reportStatus() {
        System.out.println("MobileDeveloper is reporting");
    }
}
