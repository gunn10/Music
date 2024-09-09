package MovieTicketBooking.model;

import java.util.List;


public record Movie (
        String genre,
        String title,
        String description,
        double rating,
        long duration,
        List<Showtime>showtimingsList){}
