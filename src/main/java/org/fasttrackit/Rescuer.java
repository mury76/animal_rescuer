package org.fasttrackit;

public class Rescuer {

    private String name;
    private String gender;
    private int age;

    public Rescuer(String name) {
        this.name = name;
    }

    public void feed(Animals animal, Food food) {
//        System.out.println(name + " just gave one " + food.getName() + " to his dog " + animal.getName() +
//                "(he is a " + animal.getGender() + " of " + animal.getAge() + " years old).");
        System.out.println(animal.getName() + " has just been saved by " + name + " so he has a hunger level of: "
            + animal.getHunger());
        int newHungerLevel = animal.getHunger() - food.getNutritionValue();
            animal.setHunger(newHungerLevel);
        System.out.println(name + " fed " + animal.getName() + " with a " + food.getName() + " so " + animal.getName()
             + " have now a hunger level of: " + animal.getHunger());

    }

 //   public void entertain(Animals animal, EntertainmentActivity aport) {
 //       System.out.println(name + " throws a " + aport.getObject() + " to " + animal.getName() + " and he runs happily " +
 //               "after it because it is his favorite toy.");
 //   }

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
