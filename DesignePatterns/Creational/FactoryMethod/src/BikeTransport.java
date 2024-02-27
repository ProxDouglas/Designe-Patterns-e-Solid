
import vehicles.Bike;
import vehicles.IVehicle;

public class BikeTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}
