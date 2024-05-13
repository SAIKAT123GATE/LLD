import strategy.PayStrategy;

public class Booking {
   PayStrategy payStrategy;
   Booking(PayStrategy payStrategy){
       this.payStrategy=payStrategy;
   }
   public void pay(){
       payStrategy.pay();
   }
}
