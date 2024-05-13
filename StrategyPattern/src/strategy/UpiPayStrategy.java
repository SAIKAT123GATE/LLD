package strategy;

public class UpiPayStrategy implements PayStrategy{
    @Override
    public void pay() {
        System.out.println("Upi Pay Strategy");
    }
}
