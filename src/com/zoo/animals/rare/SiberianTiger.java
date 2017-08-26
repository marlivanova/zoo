package com.zoo.animals.rare;

import com.zoo.animals.Tiger;

/**
 * Created by kisik on 26.08.2017.
 */
public class SiberianTiger extends Tiger {
    @Override
    public void makeSound() {
        super.makeSound();
    }

    public SiberianTiger(String name, Integer hungerLevel) {
        super(name, hungerLevel);
        System.out.println("...");
    }
}
