package com.refact.example;

public class Rental {

    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        this._movie = movie;
        this._daysRented = daysRented;
    }

    Movie getMovie() {
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

    double getCharge() {
        return _movie.getCharge(_daysRented);
    }

    int getFrequentRentalPoints() {
        return _movie.getFrequentRentalPoints(_daysRented);

    }
}
