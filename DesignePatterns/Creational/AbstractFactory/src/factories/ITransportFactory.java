package factories;

import aircrafts.IAircraft;
import landvehicle.ILandVehicle;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();
}
