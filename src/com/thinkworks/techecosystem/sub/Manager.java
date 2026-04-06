package com.thinkworks.techecosystem.sub;

import com.thinkworks.techecosystem.base.Entity;
import com.thinkworks.techecosystem.enums.EntityType;

public class Manager extends Entity {
    public Manager(int id, String name, double salary) {
        super(id, name, EntityType.MANAGER, salary);
    }

    public void manager(){
        System.out.println("Manager is  managing team");
    }
}
