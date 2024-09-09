package MovieTicketBooking.model;

import java.util.List;

public record Booking(
        User user,
        Movie movie,
        Showtime showtiming,
        List<Seat> bookedSeats
) {
}
