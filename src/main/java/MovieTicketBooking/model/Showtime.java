package MovieTicketBooking.model;

import java.time.LocalDateTime;
import java.util.List;

public record Showtime(
        Movie movie,
        List<Seat> totalSeats,
        LocalDateTime localDateTime
) {
    public List<Seat> availableSeats(){
        return totalSeats.stream()
                .filter(seat -> !seat.isBooked())
                .toList();
    }
}
