package Movies_Management_System;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Titanic", 9.2, 1997));
        list.add(new Movie("Gorilla", 5.2, 2007));
        list.add(new Movie("Inception", 8.1, 2017));
        list.add(new Movie("Kunfu", 3.2, 2007));
        list.add(new Movie("karate Kid", 6.2, 2000));
        list.add(new Movie("The Boys", 4.6, 1992));

        System.out.println("------------Sorted based on Rating------------");
        RatingCompare rating = new RatingCompare();
        Collections.sort(list, rating);
        for(Movie obj : list){
            System.out.println(obj.getRating() + " " + obj.getName() + " " + obj.getYear());
        }

        System.out.println("------------Sorted based on Name------------");
        NameCompare name = new NameCompare();
        Collections.sort(list, name);
        for(Movie obj : list){
            System.out.println(obj.getName() + " " + obj.getYear() + " " + obj.getRating());
        }

        System.out.println("------------Sorted based on Year------------");
        YearCompare year = new YearCompare();
        Collections.sort(list, year);
        for(Movie obj : list){
            System.out.println(obj.getYear() + " " + obj.getName() + " " + obj.getRating());
        }
    }
}
