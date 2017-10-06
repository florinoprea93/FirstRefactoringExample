package com.refact.example;

public class Rental {

    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        this._movie = movie;
        this._daysRented = daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public void setMovie(Movie movie) {
        this._movie = movie;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public void setDaysRented(int daysRented) {
        this._daysRented = daysRented;
    }
}
