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
}
