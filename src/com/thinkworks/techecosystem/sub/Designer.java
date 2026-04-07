package com.thinkworks.techecosystem.sub;

import com.thinkworks.techecosystem.base.Entity;
import com.thinkworks.techecosystem.enums.EntityType;

public class Designer extends Entity {
    public Designer(int id, String name, double salary) {
        super(id, name, EntityType.DESIGNER, salary);
    }

    public void creatingDesign(){
        System.out.println("Designer is designing the application");
    }

    @Override
    public void work() {
        System.out.println("Designer is working");
    }

    @Override
    public void performRole() {
        System.out.println("Designer is performing");
    }

    @Override
    public void reportStatus() {
        System.out.println("Designer is reporting");
    }
}
