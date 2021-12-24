package abstractfactory.marco;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        BasicOutfitFactory businessOutfitFactory = new BuisnessOutfitFactory();
        businessOutfitFactory.createShoes();
        businessOutfitFactory.createSuit();
        BasicOutfitFactory leisureOutfitFactory = new LeisureOutfitFactory();
        leisureOutfitFactory.createShoes();
        leisureOutfitFactory.createSuit();
    }
}
