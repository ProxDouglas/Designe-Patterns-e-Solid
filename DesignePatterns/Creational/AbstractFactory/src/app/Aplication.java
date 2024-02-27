package app;

import aircrafts.IAircraft;
import factories.ITransportFactory;
import landvehicle.ILandVehicle;

public class Aplication {
    private ILandVehicle vehicle;
    private IAircraft aircraft;

    public Aplication(ITransportFactory factory){
        this.vehicle = factory.createTransportVehicle();
        this.aircraft = factory.createTransportAircraft();
    }

    public void startRoute(){
        this.vehicle.startRoute();
        this.aircraft.startRoute();
    }

}
