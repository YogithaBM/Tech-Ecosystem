package com.thinkworks.techecosystem.sub;

import com.thinkworks.techecosystem.base.Entity;
import com.thinkworks.techecosystem.enums.EntityType;

public class GameDeveloper extends Entity {
    public GameDeveloper(int id, String name, double salary) {
        super(id, name, EntityType.GAME_DEVELOPER, salary);
    }

    public void gaming(){
        System.out.println("GameDeveloper is developing game");
    }
}

