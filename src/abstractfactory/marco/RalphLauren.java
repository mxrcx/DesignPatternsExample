package abstractfactory.marco;

public class RalphLauren implements Shoes{
    public RalphLauren(){
        orderShoes();
    }

    @Override
    public void orderShoes(){
        System.out.println("Ordering Ralph Lauren shoes");
    }
}
