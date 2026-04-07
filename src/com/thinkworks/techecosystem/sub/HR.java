package com.thinkworks.techecosystem.sub;

import com.thinkworks.techecosystem.base.Entity;
import com.thinkworks.techecosystem.enums.EntityType;

public class HR extends Entity {
    public HR(int id, String name, double salary) {
        super(id, name, EntityType.HR, salary);
    }

    public void conductInterviews(){
        System.out.println("HR is conducting interviews");
    }

    @Override
    public void work() {
        System.out.println("HR is working");
    }

    @Override
    public void performRole() {
        System.out.println("HR is performing");
    }

    @Override
    public void reportStatus() {
        System.out.println("HR is reporting");
    }
}
