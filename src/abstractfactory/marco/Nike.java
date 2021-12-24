package abstractfactory.marco;

public class Nike implements Shoes{
    public Nike(){
        orderShoes();
    }

    @Override
    public void orderShoes(){
        System.out.println("Ordering Nike shoes");
    }
}
