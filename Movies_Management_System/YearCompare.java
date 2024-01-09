package Movies_Management_System;

import java.util.Comparator;

public class YearCompare implements Comparator<Movie> {

    @Override
    public int compare(Movie m1, Movie m2) {
        if(m1.getYear() < m2.getYear()) return -1;
        if(m1.getYear() > m2.getYear()) return 1;
        else return 0;
    }
    
    
}
