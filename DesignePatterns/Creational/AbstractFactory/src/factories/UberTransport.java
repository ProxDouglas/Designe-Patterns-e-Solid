package factories;

import aircrafts.Airplane;
import aircrafts.IAircraft;
import landvehicle.Car;
import landvehicle.ILandVehicle;

public class UberTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }
}
