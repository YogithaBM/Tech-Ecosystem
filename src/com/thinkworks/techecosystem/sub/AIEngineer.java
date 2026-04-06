package com.thinkworks.techecosystem.sub;

import com.thinkworks.techecosystem.base.Entity;
import com.thinkworks.techecosystem.enums.EntityType;

public class AIEngineer extends Entity {
    public AIEngineer(int id, String name, double salary) {
        super(id, name, EntityType.AI_ENGINEER, salary);
    }

    public void trainModel() {
        System.out.println("AI engineer is training the model");
    }


}
