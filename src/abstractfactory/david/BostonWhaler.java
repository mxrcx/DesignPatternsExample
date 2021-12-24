package abstractfactory.david;

public class BostonWhaler implements Boat {
    public BostonWhaler() {
        prepareBoat();
    }

    @Override
    public void prepareBoat() {
        System.out.println("Constructing Boston Whaler");
    }
}
