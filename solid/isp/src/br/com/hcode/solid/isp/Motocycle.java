package br.com.hcode.solid.isp;

public class Motocycle implements IVhicle, IVehicleMotocycle{
    private String color;
    private String year;
    private double engine;

    public Motocycle(String color, String year, double engine){

        configureMotocycle(color, year, engine);
    }

    @Override
    public void configureMotocycle(String color, String year, double engine){
        this.color = color;
        this.year = year;
        this.engine = engine;

        System.out.println("Criando um carro: " + color + " " + engine + "cilindradas");
        startVehicle();
    }

    @Override
    public void startVehicle(){
        System.out.println("Ligando os motores");
    }
}
