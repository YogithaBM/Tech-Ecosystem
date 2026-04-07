package com.thinkworks.techecosystem.sub;

import com.thinkworks.techecosystem.base.Entity;
import com.thinkworks.techecosystem.enums.EntityType;

public class DataScientist extends Entity {
    public DataScientist(int id, String name, double salary) {
        super(id, name, EntityType.DATA_SCIENTIST, salary);
    }
    public void analyzeData(){
        System.out.println("DataScientist is analyzing data for insights");
    }

}
