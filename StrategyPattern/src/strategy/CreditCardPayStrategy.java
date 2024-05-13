package strategy;

public class CreditCardPayStrategy implements PayStrategy{
    @Override
    public void pay() {
        System.out.println("Credit Card Pay Strategy");
    }
}
