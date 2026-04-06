package com.thinkworks.techecosystem.sub;

import com.thinkworks.techecosystem.base.Entity;
import com.thinkworks.techecosystem.enums.EntityType;

public class Developer extends Entity {
    public Developer(int id, String name, double salary) {
        super(id, name, EntityType.DEVELOPER, salary);
    }

    public void writeCode(){
        System.out.println("Developer is writing Code");
    }
}
