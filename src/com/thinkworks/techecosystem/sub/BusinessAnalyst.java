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
}
