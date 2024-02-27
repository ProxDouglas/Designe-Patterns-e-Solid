package builders;

import cars.Truck;
import components.CarType;
import components.Engine;
import components.Transmission;

public class TruckBuilder implements IBuider{
    private CarType carType;
    private int seats;
    private Transmission transmission;
    private Engine engine;
    @Override
    public void setCarType(CarType type) {
        this.carType = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Truck getResult(){
        return new Truck(this.carType, this.seats, this.engine, this.transmission);
    }
}
