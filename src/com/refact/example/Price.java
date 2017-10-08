package com.refact.example;

abstract class Price {
    abstract int getPriceCode();

    abstract double getCharge(int daysRented);

    int getFrequentRentalPoints(int daysRented) {
        return 1;

    }
}

class ChildrenPrice extends Price {

    @Override
    int getPriceCode() {
        return Movie.CHILDRENS;
    }

    @Override
    protected double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3) {
            result += (daysRented - 3) * 1.5;
        }

        return result;
    }
}


class NewReleasePrice extends Price {

    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }


    @Override
    protected double getCharge(int daysRented) {

        return (double) (daysRented * 3);
    }

    int getFrequentRentalPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }

}


class RegularPrice extends Price {

    @Override
    int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    protected double getCharge(int daysRented) {
        double result = 2;
        if (daysRented > 2) {
            result += (daysRented - 2) * 1.5;
        }

        return result;
    }
}


