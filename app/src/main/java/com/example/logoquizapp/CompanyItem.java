package com.example.logoquizapp;

public class CompanyItem {

    String name;
    int image;

    public CompanyItem(String name, int image)
    {
        this.name = name;
        this.image = image;

    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }
}
