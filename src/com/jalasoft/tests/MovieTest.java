package com.jalasoft.tests;

import com.jalasoft.models.Movie;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {
    Movie movie = new Movie("Grinch");

    @Test
    public void getPriceCode() {
        assertEquals("Grinch", movie.getTitle());
    }

    @Test
    public void getTitle() {
        assertEquals(13, movie.getPriceCode());
    }
}