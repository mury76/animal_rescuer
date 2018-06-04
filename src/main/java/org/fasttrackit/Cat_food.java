package org.fasttrackit;

public class Cat_food extends Food {

    private String favoriteFoodName = "Milk";

    public Cat_food(String name) {
        super(name);
    }

    public String getFavoriteFoodName() {
        return favoriteFoodName;
    }

    public void setFavoriteFoodName(String favoriteFoodName) {
        this.favoriteFoodName = favoriteFoodName;
    }
}
