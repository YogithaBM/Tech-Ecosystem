package com.thinkworks.techecosystem.sub;

import com.thinkworks.techecosystem.base.Entity;
import com.thinkworks.techecosystem.enums.EntityType;

public class Intern extends Entity {
    public Intern(int id, String name, double salary) {
        super(id, name, EntityType.INTERN, salary);
    }

    public void assistTeam(){
        System.out.println("Intern is assisting the team");
    }

    @Override
    public void work() {
        System.out.println("Intern is working");
    }

    @Override
    public void performRole() {
        System.out.println("Intern is performing");
    }

    @Override
    public void reportStatus() {
        System.out.println("Intern is reporting");
    }
}
