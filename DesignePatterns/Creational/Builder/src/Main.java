import builders.CarBuilder;
import builders.TruckBuilder;
import cars.Car;
import cars.Truck;
import director.Director;

public class Main {
    public static void main(String[] args) {

        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructorSedanCar(builder);

        Car car = builder.getResult();
        System.out.println(car.getCarType() + " produzido com sucesso!");

        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructorTruck(truckBuilder);

        Truck truck = truckBuilder.getResult();
        System.out.println(truck.getCarType() + " produzido com sucesso!");
    }
}