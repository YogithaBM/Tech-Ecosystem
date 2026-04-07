package com.thinkworks.techecosystem.sub;

import com.thinkworks.techecosystem.base.Entity;
import com.thinkworks.techecosystem.enums.EntityType;

public class Tester extends Entity {

    public Tester(int id, String name, double salary) {
        super(id, name, EntityType.TESTER, salary);
    }

    public void testerSoftware(){
        System.out.println("Tester is testing application");
    }

    @Override
    public void work() {
        System.out.println("Tester is working");
    }

    @Override
    public void performRole() {
        System.out.println("Tester is performing");
    }

    @Override
    public void reportStatus() {
        System.out.println("Tester is reporting");
    }
}
