package com.zoo.animals;

/**
 * Created by kisik on 26.08.2017.
 */
public class Tiger extends Animal {
    public Tiger() {
        //super(70);
        super();
    }

    public Tiger(String name, Integer hungerLevel) {
        super(hungerLevel);
        setName(name);

    }
}
