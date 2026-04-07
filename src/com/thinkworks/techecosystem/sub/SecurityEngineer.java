package com.thinkworks.techecosystem.sub;

import com.thinkworks.techecosystem.base.Entity;
import com.thinkworks.techecosystem.enums.EntityType;

public class SecurityEngineer extends Entity {
    public SecurityEngineer(int id, String name, double salary) {
        super(id, name, EntityType.SECURITY_ENGINEER, salary);
    }

    public void performSecurityAudit(){
        System.out.println("Security Engineer is performing security checks");
    }


    @Override
    public void work() {
        System.out.println("SecurityEngineer is working");
    }

    @Override
    public void performRole() {
        System.out.println("SecurityEngineer is performing");
    }

    @Override
    public void reportStatus() {
        System.out.println("SecurityEngineer is reporting");
    }
}
