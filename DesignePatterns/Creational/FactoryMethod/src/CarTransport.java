import vehicles.Car;
import vehicles.IVehicle;

public class CarTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
