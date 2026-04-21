package com.example.umbbmobguide;

public class Faculty {
    private String name;
    private int logo; // drawable

    public Faculty(String name, int logo) {
        this.name = name;
        this.logo = logo;
    }

    public String getName() { return name; }
    public int getLogo() { return logo; }
}