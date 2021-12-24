package abstractfactory.marco;

public class BuisnessOutfitFactory extends BasicOutfitFactory {

    @Override
    public Suit createSuit() {
        return new HugoBoss();
    }

    @Override
    public Shoes createShoes() {
        return new RalphLauren();
    }
    
}
