package com.thinkworks.techecosystem.sub;

import com.thinkworks.techecosystem.base.Entity;
import com.thinkworks.techecosystem.enums.EntityType;

public class BlockchainEngineer extends Entity {
    public BlockchainEngineer(int id, String name, double salary) {
        super(id, name, EntityType.BLOCKCHAIN_ENGINEER, salary);
    }

    public void blockChaining(){
        System.out.println("BlockchainEngineer is developing block chain solutions");
    }
}
