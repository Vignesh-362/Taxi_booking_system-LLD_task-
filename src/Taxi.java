import java.util.ArrayList;
import java.util.List;

public class Taxi {
    private int taxiId;
    private char cspot ;
    private  int ftime ;
    private int earnings ;
    private List<Booking> booking = new ArrayList<>();

    public int getTaxiId() {
        return taxiId;
    }

    public List<Booking> getBooking() {
        return booking;
    }

    public void setBooking(List<Booking> booking) {
        this.booking = booking;
    }

    public void setTaxiId(int taxiId) {
        this.taxiId = taxiId;
    }

    public char getCspot() {
        return cspot;
    }

    public void setCspot(char cspot) {
        this.cspot = cspot;
    }

    public int getFtime() {
        return ftime;
    }

    public void setFtime(int ftime) {
        this.ftime = ftime;
    }

    public int getEarnings() {
        return earnings;
    }

    public void setEarnings(int earnings) {
        this.earnings += earnings;
    }

    Taxi(int taxiId)
    {
        this.taxiId = taxiId;
        this.cspot = 'A';
        this.ftime = 0;
        this.earnings=0;
    }

    public boolean isFree(char pickup,int pickupTime)
    {
          int Traveltime = Math.abs(this.cspot - pickup);
          return Traveltime + this.ftime <= pickupTime;
    }

    public int closestDistance(char pickup,int pickupTime)
    {
        int Traveltime = Math.abs(this.cspot - pickup);
        return  Traveltime;
    }

    public int calculateCharges (char pickup ,char drop)
    {
        int charges = 100;
        int distance = Math.abs(pickup - drop) * 15 -5;
        charges += distance * 10;
        return charges;
    }
    public void assignBookings(Booking b)
    {
        booking.add(b);
    }
}
