package org.fasttrackit;

public class Game {

    public void start() {

        Rescuer rescuer = new Rescuer("Mury");

        Dog dog = new Dog("Codro", "black", "male", 3, 19);

        Cat cat = new Cat("Stripes", "gray", "male", 6, 7);

        Food food = new Food("Bone");

        rescuer.feed(dog, food);
    }
}
