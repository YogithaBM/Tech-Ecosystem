package com.thinkworks.techecosystem.sub;

import com.thinkworks.techecosystem.base.Entity;
import com.thinkworks.techecosystem.enums.EntityType;

public class QAEngineer extends Entity {
    public QAEngineer(int id, String name, double salary) {
        super(id, name, EntityType.QA_ENGINEER, salary);
    }

    public void ensuringQuality(){
        System.out.println("QA Engineer is ensuring quality");
    }
}
