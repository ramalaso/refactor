package com.jalasoft.models;

public class Movie extends Price {
    Price price = new Price();
    private String _title;

    public Movie(String title) {
        _title = title;
    }

    public String getTitle() {
        return _title;
    }
}
