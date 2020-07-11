package com.example.hw7;

public class lakers {
    private String name;
    private int image;
    private int rating;

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public int getRating() {
        return rating;
    }

    public lakers(String name, int image, int rating) {
        this.name = name;
        this.image = image;
        this.rating = rating;

    }
}
