package com.zoo.animals;

/**
 * Created by kisik on 26.08.2017.
 */
public class Animal {
    private String color;
    private Integer legCount;
    private Integer weight;
    private String name;
    private Integer hungerLevel; // = 50;

    public Animal() {
        hungerLevel = 50;
        name = " unnamed animal ";
        System.out.println("hello from Animal(hungerLevel) constructor");
    }

    public Animal(Integer hungerLevel) {
        this.hungerLevel = hungerLevel;
        System.out.println("hello from Animal(name, hungerLevel) constructor");
    }

    public Integer getHungerLevel() {
        return hungerLevel;
    }

    public String getColor() {
        return color;

        //Integer myNum = new Integer(23);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getLegCount() {
        return legCount;
    }

    public void setLegCount(Integer legCount) {
        this.legCount = legCount;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void move() {
        if (hungerLevel < 100) {
            hungerLevel += 10;
            System.out.println("I'm an animal - I'm moving");
        } else
            System.out.println("I'm exhausted and starving! Can't move!");
    }

    public void makeSound() {
        if (hungerLevel < 100) {
            hungerLevel += 1;
            System.out.println("I'm making noise!");
        } else
            System.out.println("I'm exhausted and starving! Can't make noise!");
    }

    public void feed() {
        System.out.println("I'm an animal - I'm eating");
        if (hungerLevel > 0)
            hungerLevel = hungerLevel - 1;
        else System.out.println("I don't need more food");
    }

    @Override
    public String toString() {
        //return super.toString();
        return "I'm Animal and my name is: " + name;
    }
}
