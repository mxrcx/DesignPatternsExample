package abstractfactory.david;

public class Citroën implements Car {
    public Citroën() {
        prepareCar();
    }

    @Override
    public void prepareCar() {
        System.out.println("Constructing Citroën");
    }
}
