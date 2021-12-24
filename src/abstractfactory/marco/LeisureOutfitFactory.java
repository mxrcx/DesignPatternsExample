package abstractfactory.marco;

public class LeisureOutfitFactory extends BasicOutfitFactory {

    @Override
    public Suit createSuit() {
        return new Adidas();
    }

    @Override
    public Shoes createShoes() {
        return new Nike();
    }
    
}
