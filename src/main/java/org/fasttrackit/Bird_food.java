package org.fasttrackit;

public class Bird_food extends Food {

    private String favoriteFoodName = "Grains";

    public Bird_food(String name) {
        super(name);
    }

    public String getFavoriteFoodName() {
        return favoriteFoodName;
    }

    public void setFavoriteFoodName(String favoriteFoodName) {
        this.favoriteFoodName = favoriteFoodName;
    }
}
