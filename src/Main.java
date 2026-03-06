//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
              Customer c1 = new Customer(1,'A','B',9);
              Customer c2 = new Customer(2,'B','D',9);
              Customer c3 = new Customer(3,'B','C',12);

              Bookingsystem b1 = new Bookingsystem(4);
              b1.BookTaxi(c1);
              b1.BookTaxi(c2);
              b1.BookTaxi(c3);
              System.out.println("");
              b1.DisplayTaxi();
        }
    }
