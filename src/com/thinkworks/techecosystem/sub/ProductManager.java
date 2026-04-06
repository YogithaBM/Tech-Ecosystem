package com.thinkworks.techecosystem.sub;

import com.thinkworks.techecosystem.base.Entity;
import com.thinkworks.techecosystem.enums.EntityType;

public class ProductManager extends Entity {
    public ProductManager(int id, String name, double salary) {
        super(id, name, EntityType.PRODUCT_MANAGER, salary);
    }

    public void defineProductStrategy(){
        System.out.println("ProductManager is defining product strategy");
    }
}
