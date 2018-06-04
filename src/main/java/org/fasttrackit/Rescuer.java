package org.fasttrackit;

public class Rescuer {

    private String name;
    private String gender;
    private int age;

    public Rescuer(String name) {
        this.name = name;
    }

    public void feed(Animals animal, Food food) {
        System.out.println(name + " just gave one " + food.getName() + " to his dog " + animal.getName() +
                "(he is a " + animal.getGender() + " of " + animal.getAge() + " years old).");
    }

    public void entertain(Animals animal, EntertainmentActivity aport) {
        System.out.println(name + " throws a " + aport.getObject() + " to " + animal.getName() + " and he runs happily " +
                "after it because it is his favorite toy.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
