package com.thinkworks.techecosystem.sub;

import com.thinkworks.techecosystem.base.Entity;
import com.thinkworks.techecosystem.enums.EntityType;

public class SystemAdmin extends Entity {
    public SystemAdmin(int id, String name, double salary) {
        super(id, name, EntityType.SYSTEM_ADMIN, salary);
    }

    public void maintainServers(){
        System.out.println("System Admin is maintaining systems");
    }
}
