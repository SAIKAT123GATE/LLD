import strategy.CreditCardPayStrategy;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Booking booking=new Booking(new CreditCardPayStrategy());
        booking.pay();
    }
}