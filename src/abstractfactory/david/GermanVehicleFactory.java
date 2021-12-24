package abstractfactory.david;

public class GermanVehicleFactory extends BaseVehicleFactory {
    @Override
    public Car createCar() {
        return new BMW();
    }

    @Override
    public Boat createBoat() {
        return new BostonWhaler();
    }
}
