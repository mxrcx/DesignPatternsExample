package abstractfactory.marco;

public class Adidas implements Suit{
    public Adidas(){
        orderSuit();
    }

    @Override
    public void orderSuit(){
        System.out.println("Ordering Adidas suit");
    }
}
