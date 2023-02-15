package com.serenitydojo;

public class Hamster extends Pet {
    private final String favoriteToy;

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public Hamster(String name, int age, String favoriteToy) {
        super(name,age);
        this.favoriteToy = favoriteToy;
    }

    @Override
    public String play() {
        return "runs in wheel";
    }
}
