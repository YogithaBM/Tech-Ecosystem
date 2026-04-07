package com.thinkworks.techecosystem.sub;

import com.thinkworks.techecosystem.base.Entity;
import com.thinkworks.techecosystem.enums.EntityType;

public class BusinessAnalyst extends Entity {
    public BusinessAnalyst(int id, String name, double salary) {
        super(id, name, EntityType.BUSINESS_ANALYST, salary);
    }

    public void analyseRequirements(){
        System.out.println("Business Analyst is analyzing requirements");
    }

    @Override
    public void work() {
        System.out.println("BusinessAnalyst is working");
    }

    @Override
    public void performRole() {
        System.out.println("BusinessAnalyst is performing");
    }

    @Override
    public void reportStatus() {
        System.out.println("BusinessAnalyst is reporting");
    }
}

