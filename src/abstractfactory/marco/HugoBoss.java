package abstractfactory.marco;

public class HugoBoss implements Suit{
    public HugoBoss(){
        orderSuit();
    }

    @Override
    public void orderSuit(){
        System.out.println("Ordering Hugo Boss suit");
    }
}
