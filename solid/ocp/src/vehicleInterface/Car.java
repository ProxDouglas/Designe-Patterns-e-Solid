package vehicleInterface;

public class Car implements IVehicle {

    private String color;
    private String year;
    private double engine;
    private int seats;

    public Car(String color, String year, double engine, int seats){

        configureVehicle(color, year, engine, seats);
    }

    @Override
    public void configureVehicle(String color, String year, double engine, int seats){
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;

        System.out.println("Criando um carro: " + color + " " + engine + " " + " com " + seats + " assentos");
        startVehicle();
    }

    @Override
    public void startVehicle(){
        System.out.println("Ligando os motores");
    }


}
