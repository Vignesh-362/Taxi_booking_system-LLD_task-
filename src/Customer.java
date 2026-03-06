public class Customer {
    private int customerId;
    private  char pickup;
    private  char drop;
    private int pickup_time;

    public Customer(int customerId, char pickup, char drop, int pickup_time) {
        this.customerId = customerId;
        this.pickup = pickup;
        this.drop = drop;
        this.pickup_time = pickup_time;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public char getPickup() {
        return pickup;
    }

    public void setPickup(char pickup) {
        this.pickup = pickup;
    }

    public char getDrop() {
        return drop;
    }

    public void setDrop(char drop) {
        this.drop = drop;
    }

    public int getPickup_time() {
        return pickup_time;
    }

    public void setPickup_time(int pickup_time) {
        this.pickup_time = pickup_time;
    }
}
