package director;

import builders.IBuider;
import components.CarType;
import components.Engine;
import components.Transmission;

public class Director {
    public void constructorSedanCar(IBuider builder){
        builder.setCarType(CarType.SEDAN);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(1600));
    }

    public void constructorTruck(IBuider builder){
        builder.setCarType(CarType.TRUCK);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC_SEQUENCIAL);
        builder.setEngine(new Engine(13000));
    }
}
