package com.example.umbbmobguide;

public class Faculty {
     String name;
     int logo; // drawable

    public Faculty(String name, int logo) {
        this.name = name;
        this.logo = logo;
    }

   public String getName() { return name; }
    public int getLogo() { return logo; }
}