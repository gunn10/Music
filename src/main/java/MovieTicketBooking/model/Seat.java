package MovieTicketBooking.model;

import MovieTicketBooking.config.SeatType;

public record Seat (
        int seatNo,
        double price,
        SeatType seatType,
        boolean isBooked
){}



