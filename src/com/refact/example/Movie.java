package com.refact.example;

public class Movie {

    static final int CHILDRENS = 2;
    static final int REGULAR = 0;
    static final int NEW_RELEASE = 1;

    private String _title;
    private Price _price;

    public Movie(String title, int priceCode) {
        this._title = title;
        setPriceCode(priceCode);
    }

    String getTitle() {
        return _title;
    }

    public void setTitle(String title) {
        this._title = title;
    }

    public int getPriceCode() {
        return _price.getPriceCode();
    }

    private void setPriceCode(int priceCode) {
        switch (priceCode) {
            case REGULAR:
                _price = new RegularPrice();
                break;
            case CHILDRENS:
                _price = new ChildrenPrice();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incortect Price Code");
        }
    }

    double getCharge(int daysRented) {
        return _price.getCharge(daysRented);

    }

    int getFrequentRentalPoints(int daysRented) {
        return _price.getFrequentRentalPoints(daysRented);
    }
}
