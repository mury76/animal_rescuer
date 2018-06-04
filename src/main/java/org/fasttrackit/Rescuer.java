package org.fasttrackit;

public class Rescuer {

    String name;
    String gender;
    int age;

    public Rescuer(String name) {
        this.name = name;
    }

    public void feed(Animals animal, Food food) {
        System.out.println(name + " just gave one " + food.name + " to his dog " + animal.name +
                "(he is a " + animal.gender + " of " + animal.age + " years old).");
    }

    public void entertain(Animals animal, EntertainmentActivity aport) {
        System.out.println(name + " throws a " + aport.object + " to " + animal.name + " and he runs happily " +
                "after it because he is his favorite toy.");
    }

}
