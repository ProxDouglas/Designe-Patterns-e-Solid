import vehicles.IVehicle;
import vehicles.Motorcycle;

public class MotorcycleTransport extends Transport{

    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
