package builders;

import components.CarType;
import components.Engine;
import components.Transmission;

public interface IBuider {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setTransmission(Transmission transmission);
    void setEngine(Engine engine);
}
