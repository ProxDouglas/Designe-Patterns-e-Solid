import vehicleHeranca.Car;
import vehicleHeranca.Motocycle;
//import classeSobrecarregada.Vehicle;


public class Main {
    private static TypeVehicle typeVehicle;
    public static void main(String[] args) {
        typeVehicle = TypeVehicle.CAR;

//          Classe sobrecarregada
//        if(typeVehicle == TypeVehicle.CAR){
//            Vehicle vehicle = new Vehicle("Amarelo", "2021", 2.0, 4);
//        } else if(typeVehicle == TypeVehicle.MOTOCYCLE) {
//            Vehicle vehicle = new Vehicle("", "2022", 250, 1);
//        }

        if(typeVehicle == TypeVehicle.CAR){
            Car car = new Car("Amarelo", "2021", 2.0, 4);
        } else if(typeVehicle == TypeVehicle.MOTOCYCLE){
            Motocycle motocycle = new Motocycle("", "2022", 250);
        }
    }
}