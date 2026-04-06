package com.thinkworks.techecosystem.sub;

import com.thinkworks.techecosystem.base.Entity;
import com.thinkworks.techecosystem.enums.EntityType;

public class BackendDeveloper extends Entity {
    public BackendDeveloper(int id, String name, double salary) {
        super(id, name,EntityType.BACKEND_DEVELOPER, salary);
    }

    public void buildAPI(){
        System.out.println("BackendDeveloper is building APIS");
    }
}
