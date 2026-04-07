package com.thinkworks.techecosystem.sub;

import com.thinkworks.techecosystem.base.Entity;
import com.thinkworks.techecosystem.enums.EntityType;

public class TechnicalWriter extends Entity {
    public TechnicalWriter(int id, String name, double salary) {
        super(id, name, EntityType.TECHNICAL_WRITER, salary);
    }

    public void writeDocumentation(){

        System.out.println("TechnicalWriter is writing Documentation");
    }

    @Override
    public void work() {
        System.out.println("TechnicalWriter is working");
    }

    @Override
    public void performRole() {
        System.out.println("TechnicalWriter is performing");
    }

    @Override
    public void reportStatus() {
        System.out.println("TechnicalWriter is reporting");
    }
}
