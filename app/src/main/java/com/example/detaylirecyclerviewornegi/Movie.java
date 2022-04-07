package com.example.detaylirecyclerviewornegi;

import android.widget.ImageView;
import android.widget.TextView;

public class Movie {

     //private int movieID;
     private String movieName, moviePictureName;
     private Double moviePrice;

    public Movie(String movieName, String moviePictureName, Double moviePrice) {
        this.movieName = movieName;
        this.moviePictureName = moviePictureName;
        this.moviePrice = moviePrice;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMoviePictureName() {
        return moviePictureName;
    }

    public void setMoviePictureName(String moviePictureName) {
        this.moviePictureName = moviePictureName;
    }

    public Double getMoviePrice() {
        return moviePrice;
    }

    public void setMoviePrice(Double moviePrice) {
        this.moviePrice = moviePrice;
    }
}
