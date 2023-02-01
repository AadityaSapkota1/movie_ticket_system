package model;

public class Seat {
    String seat_type;
    int seat_number;

    public Seat(String seatType, int seatNumber) {
        this.seat_type = seatType;
        this.seat_number = seatNumber;
    }

    public String getSeatType() {
        return seat_type;
    }

    public void setSeatType(String seatType) {
        this.seat_type = seatType;
    }

    public int getSeatNumber() {
        return seat_number;
    }

    public void setSeatNumber(int seatNumber) {
        this.seat_number = seatNumber;
    }
}