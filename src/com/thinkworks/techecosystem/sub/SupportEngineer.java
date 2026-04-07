package com.thinkworks.techecosystem.sub;

import com.thinkworks.techecosystem.base.Entity;
import com.thinkworks.techecosystem.enums.EntityType;

public class SupportEngineer extends Entity {
    public SupportEngineer(int id, String name, double salary) {
        super(id, name, EntityType.SUPPORT_ENGINEER, salary);
    }

    public void solvingIssues(){
        System.out.println("Support Engineer is resolving issues");
    }

    @Override
    public void work() {
        System.out.println("SupportEngineer is working");
    }

    @Override
    public void performRole() {
        System.out.println("SupportEngineer is performing");
    }

    @Override
    public void reportStatus() {
        System.out.println("SupportEngineer is reporting");
    }
}
