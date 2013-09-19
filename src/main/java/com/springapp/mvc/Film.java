package com.springapp.mvc;


import javax.persistence.*;

@Entity(name = "movie")
public class Film {
    @Id
    private String title;

    @Basic
    private int votes;

    @Basic
    private float rating;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
