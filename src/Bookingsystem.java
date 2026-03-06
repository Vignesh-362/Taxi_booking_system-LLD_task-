import java.util.ArrayList;
import java.util.List;

public class Bookingsystem {
    private List<Taxi> taxis = new ArrayList<>();

    Bookingsystem(int taxicount)
    {
        for(int i=1;i<=taxicount;i++) {
             taxis.add(new Taxi(i));
        }
    }

    Taxi findtaxi(char pickup,int pickupTime) {
        List<Taxi> freeTaxis = new ArrayList<>();
        for (Taxi t : taxis)
            if (t.isFree(pickup, pickupTime)) freeTaxis.add(t);

        if(freeTaxis.isEmpty()) return null;

        int min = Integer.MAX_VALUE;

        List<Taxi> closestTaxi = new ArrayList<>();
        for (Taxi t : freeTaxis) {
            int distance = t.closestDistance(pickup, pickupTime);
            if (distance < min) min = distance;
        }

        for (Taxi t : freeTaxis) {
            int distance = t.closestDistance(pickup, pickupTime);
            if (distance == min) closestTaxi.add(t);
        }

        min = Integer.MAX_VALUE;

        List<Taxi> lessEarnings = new ArrayList<>();
        for(Taxi t:closestTaxi){
            if(t.getEarnings() < min) min = t.getEarnings();
        }

        for(Taxi t:closestTaxi){
            if(t.getEarnings() == min) lessEarnings.add(t);
        }

        return lessEarnings.get(0);
    }

    void BookTaxi(Customer c)
    {
         Taxi t = findtaxi(c.getPickup(),c.getPickup_time());
         if(t== null) System.out.println("No taxi is available");

         int bookingId =1;
         int droptime = c.getPickup_time()+ Math.abs(c.getPickup() - c.getDrop());
         int charges = t.calculateCharges(c.getPickup(),c.getDrop());
         Booking booking = new Booking(bookingId,c,droptime,charges);
         t.assignBookings(booking);
         System.out.println("Taxi - " + t.getTaxiId() + " is allocated");
         bookingId++;
         t.setCspot(c.getDrop());
         t.setEarnings(t.calculateCharges(c.getPickup(),c.getDrop()));
         t.setFtime(droptime);
    }

    public void DisplayTaxi()
    {
        for(Taxi t: taxis){

            if(t.getEarnings() > 0) {
                System.out.println("Taxi -" + t.getTaxiId() + "    TotalEarnings : Rs" + t.getEarnings());
                System.out.println("BookingId   CustomerId  From    To  PickupTime  Droptime    Charge");
                for (Booking b : t.getBooking()) {
                    System.out.println(b.getId() + "            " + b.getCustomer().getCustomerId() + "           " + b.getCustomer().getPickup() + "       " + b.getCustomer().getDrop() + "   " + b.getCustomer().getPickup_time() + "           " + b.getDroptime() + "          Rs." + b.getCharges());
                }
                System.out.println("");
            }
        }
    }

}
