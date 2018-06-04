package org.fasttrackit;

public class Dog_food extends Food {

    private String favoriteFoodName = "Bone";

    public Dog_food(String name) {
        super(name);
    }

    public String getFavoriteFoodName() {
        return favoriteFoodName;
    }

    public void setFavoriteFoodName(String favoriteFoodName) {
        this.favoriteFoodName = favoriteFoodName;
    }
}
