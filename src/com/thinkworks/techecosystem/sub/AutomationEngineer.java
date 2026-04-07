package com.thinkworks.techecosystem.sub;

import com.thinkworks.techecosystem.base.Entity;
import com.thinkworks.techecosystem.enums.EntityType;

public class AutomationEngineer extends Entity {
    public AutomationEngineer(int id, String name ,double salary) {
        super(id, name, EntityType.AUTOMATION_ENGINEER, salary);
    }

    public void writeScripts(){
        System.out.println("AutomationEngineer is writing automation scripts");
    }

    @Override
    public void work() {
        System.out.println("is working");
    }

    @Override
    public void performRole() {
        System.out.println("is performing");
    }

    @Override
    public void reportStatus() {
        System.out.println("is reporting");
    }
}
