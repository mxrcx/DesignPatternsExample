package abstractfactory.david;

import java.util.stream.Stream;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        Stream.of(new FrenchVehicleFactory(), new GermanVehicleFactory()).forEach(f -> {
            f.createCar();
            f.createBoat();
        });
    }
}
