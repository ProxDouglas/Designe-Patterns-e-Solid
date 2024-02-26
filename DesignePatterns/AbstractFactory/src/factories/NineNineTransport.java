package factories;

import aircrafts.Helicopter;
import aircrafts.IAircraft;
import landvehicle.ILandVehicle;
import landvehicle.Motocycle;

public class NineNineTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motocycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }
}
