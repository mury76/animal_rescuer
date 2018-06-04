package org.fasttrackit;

public class Game {

    public void start() {

        Rescuer rescuer = new Rescuer("Mury");

        Dog dog = new Dog("Bruno", "black", "male", 3, 19);

        Cat cat = new Cat("Stripes", "gray", "male", 6, 7);

        Food food = new Food("Bone");

        EntertainmentActivity entertainment = new EntertainmentActivity("stick");

        rescuer.feed(dog, food);
        rescuer.entertain(dog, entertainment);

    }
}
