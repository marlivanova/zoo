package com.zoo.animals;

/**
 * Created by kisik on 26.08.2017.
 */
public class Tiger extends Animal {
    public Tiger() {
        this("srt", 3);
        System.out.println("hello from Tiger() constructor");
        //super(70);

    }

    public Tiger(String name, Integer hungerLevel) {
        super(hungerLevel);
        System.out.println("hello from Tiger(name, hungerLevel) constructor");
    }

    public Tiger(String name) {
        super();
        setName(name);
    }

    @Override
    public void move() {
        //super.move();
        System.out.println("I'm a Tiger - moving very fast!");
    }

    @Override
    public void makeSound() {
        //super.makeSound();
        System.out.println("Roooooar!");
    }
}
