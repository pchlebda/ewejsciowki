package pl.fluent;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class ShowService {

    public List<Show> getShows(Venue v, LocalDateTime givenDate) {
       return v.getShows().stream()
               .filter(show-> show.getEvents() != null && show.getEvents()
                       .stream()
                       .anyMatch(event -> givenDate.isEqual(event.getDateTime())))
               .limit(5)
               .collect(Collectors.toList());
    }
}
