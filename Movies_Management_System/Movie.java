package Movies_Management_System;

import java.util.Comparator;
public class Movie implements Comparator<Movie>{

    private String name;
    private double rating;
    private int year;

    public Movie(String name, double rating, int year){
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    @Override
    public int compare(Movie o1, Movie o2){
        return o1.year - o2.year;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }
    
    
}
