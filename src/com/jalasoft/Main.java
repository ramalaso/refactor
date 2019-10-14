package com.jalasoft;

import com.jalasoft.controllers.CustomerController;
import com.jalasoft.models.Movie;
import com.jalasoft.models.Rental;

public class Main {
    public static void main(String[] args) {
        CustomerController customer = new CustomerController();
        customer.addRental(new Rental(new Movie("The Revenant", 1), 2));
        customer.addRental(new Rental(new Movie("Terminator", 0), 2));
        System.out.println(customer.statement());
    }
}
