package classeSobrecarregada;

public class Vehicle {
    private String color;
    private String year;
    private double engine;
    private int seats;

    public Vehicle(String color, String year, double engine, int seats){
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
    }

    void car(){
        System.out.println("Criando um carro: " + color + " " + engine + " " + " com " + seats + " assentos");
        startVehicle();
    }

    void motocycle(){
        System.out.println("Criando um moto: " + color + " " + engine + " cilindradas");
        startVehicle();
    }

    void startVehicle(){
        System.out.println("Ligando os motores");
    }
}
