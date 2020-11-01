package com.awsdemotwo.demo.model;

public class Movie {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String title;
    private String category;
    private String review;

    public Movie(int id, String title, String cateogry, String review) {
        this.id = id;
        this.title = title;
        this.category = cateogry;
        this.review = review;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCateogry() {
        return category;
    }

    public void setCateogry(String cateogry) {
        this.category = cateogry;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
