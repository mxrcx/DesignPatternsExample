package abstractfactory.david;

public class FrenchVehicleFactory extends BaseVehicleFactory {
    @Override
    public Car createCar() {
        return new Citroën();
    }

    @Override
    public Boat createBoat() {
        return new Bertram();
    }
}
