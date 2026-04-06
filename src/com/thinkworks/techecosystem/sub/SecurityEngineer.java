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
}
