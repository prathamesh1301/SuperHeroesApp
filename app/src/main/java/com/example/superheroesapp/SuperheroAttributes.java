package com.example.superheroesapp;

public class SuperheroAttributes {
    private String name;
    private String des;
    private int image;

    public SuperheroAttributes(String name, String des, int image) {
        this.name = name;
        this.des = des;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDes() {
        return des;
    }

    public int getImage() {
        return image;
    }
}
