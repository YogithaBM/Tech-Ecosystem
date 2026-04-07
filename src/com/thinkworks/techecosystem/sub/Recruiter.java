package com.thinkworks.techecosystem.sub;

import com.thinkworks.techecosystem.base.Entity;
import com.thinkworks.techecosystem.enums.EntityType;

public class Recruiter extends Entity {
    public Recruiter(int id, String name, double salary) {
        super(id, name, EntityType.RECRUITER, salary);
    }

    public void hireCandidate(){
        System.out.println("Recruiter is hiring candidates");
    }

    @Override
    public void work() {
        System.out.println("Recruiter is working");
    }

    @Override
    public void performRole() {
        System.out.println("Recruiter is performing");
    }

    @Override
    public void reportStatus() {
        System.out.println(" Recruiteris reporting");
    }
}
