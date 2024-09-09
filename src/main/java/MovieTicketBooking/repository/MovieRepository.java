package MovieTicketBooking.repository;

import MovieTicketBooking.config.SeatType;
import MovieTicketBooking.model.Movie;
import MovieTicketBooking.model.Seat;
import MovieTicketBooking.model.Showtime;

import java.time.LocalDateTime;
import java.util.List;

public class MovieRepository {

    Movie movie1;
    List<Movie> movies;
    List<Showtime>showtimeList;



    public MovieRepository(){
         movie1 = new Movie("Romantic", "It ends with us", "Good", 3.4, 5, showtimeList);
        List<Showtime> showtimingList = List.of(
                new Showtime(movie1, List.of(new Seat(1, 1000, SeatType.BASIC, false)), LocalDateTime.now()),
                new Showtime(movie1, List.of(new Seat(2,1000,SeatType.GOLD,true)),LocalDateTime.now())
        );
    }
    void addMovie(){
     movies.add(movie1);
    }

}
