package abstractfactory.david;

public class BMW implements Car {
    public BMW() {
        prepareCar();
    }

    @Override
    public void prepareCar() {
        System.out.println("Constructing BMW");
    }
}
