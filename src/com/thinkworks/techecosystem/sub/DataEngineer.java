package com.thinkworks.techecosystem.sub;

import com.thinkworks.techecosystem.base.Entity;
import com.thinkworks.techecosystem.enums.EntityType;

public class DataEngineer extends Entity {
    public DataEngineer(int id, String name, double salary) {
        super(id, name, EntityType.DATA_ENGINEER, salary);
    }

    public void buildPipeline(){
        System.out.println("DataEngineer is building data pipelines");
    }

    @Override
    public void work() {
        System.out.println("DataEngineer is working");
    }

    @Override
    public void performRole() {
        System.out.println("DataEngineer is performing");
    }

    @Override
    public void reportStatus() {
        System.out.println("DataEngineer is reporting");
    }
}
