package com.thinkworks.techecosystem.sub;

import com.thinkworks.techecosystem.base.Entity;
import com.thinkworks.techecosystem.enums.EntityType;

public class NetworkEngineer extends Entity {
    public NetworkEngineer(int id, String name, double salary) {
        super(id, name, EntityType.NETWORK_ENGINEER, salary);
    }

    public void configureNetwork(){
        System.out.println("Network Engineer is configuring network");
    }
}
