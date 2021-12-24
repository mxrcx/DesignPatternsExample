package abstractfactory.david;

public class Bertram implements Boat {
    public Bertram() {
        prepareBoat();
    }

    @Override
    public void prepareBoat() {
        System.out.println("Constructing Bertram");
    }
}
