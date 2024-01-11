package vehicleHeranca;

public class Motocycle extends Vehicle{

    public Motocycle(String color, String year, double engine){
        this.color = color;
        this.year = year;
        this.engine = engine;

        configureMotocycle();
    }

    void configureMotocycle(){
        System.out.println("Criando um moto: " + color + " " + engine + " cilindradas");
        startVehicle();
    }
}
