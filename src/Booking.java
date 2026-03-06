
import java.util.List;

public class Booking {
    private int bookingId;
    private Customer customer;
    private int droptime;
    private int charges;


    public Booking(int id, Customer customer, int droptime, int charges) {
        this.bookingId = id;
        this.customer = customer;
        this.droptime = droptime;
        this.charges = charges;
    }

    public int getId() {
        return bookingId;
    }

    public void setId(int id) {
        this.bookingId = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getDroptime() {
        return droptime;
    }

    public void setDroptime(int droptime) {
        this.droptime = droptime;
    }

    public int getCharges() {
        return charges;
    }

    public void setCharges(int charges) {
        this.charges = charges;
    }
}
