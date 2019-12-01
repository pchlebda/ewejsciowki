package pl.fluent;

import java.util.List;

class Venue { // represents particular theater
    private String city;
    private String venueName;
    List<Show> shows;

    public List<Show> getShows() {
        return shows;
    }
}