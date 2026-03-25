import java.time.LocalDateTime;

public class Train {
    static private int nextNumber = 1;

    private int trainNumber = nextNumber;
    private String destination;
    private LocalDateTime departureTime;

    private int commonSeats;
    private int coupeSeats;
    private int reservedSeats;
    private int svSeats;
    public Train(String destination, LocalDateTime departureTime, int commonSeats, int coupeSeats,
                 int reservedSeats, int svSeats) {

        this.destination = destination;
        this.departureTime = departureTime;
        this.commonSeats = commonSeats;
        this.coupeSeats = coupeSeats;
        this.reservedSeats = reservedSeats;
        this.svSeats = svSeats;

        nextNumber++;
    }

    public int getCommonSeats(){
        return commonSeats;
    }

    public String getDestination(){
        return destination;
    }

    public LocalDateTime getDepartureTime(){
        return departureTime;
    }

    @Override
    public String toString() {
        return String.format("Train №%d | Destination: %-10s | Date: %s | Seats (Common/Coupe/Reserved/SV): %d/%d/%d/%d",
                trainNumber, destination, departureTime,
                commonSeats, coupeSeats, reservedSeats, svSeats);
    }
}
