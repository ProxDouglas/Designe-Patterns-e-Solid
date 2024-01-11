import br.com.hcode.solid.isp.Car;
import br.com.hcode.solid.isp.Motocycle;

public class Main {
    private static String type;
    public static void main(String[] args) {
        type = "Car";
        if(type == "Car"){
            Car car = new Car("Amarelo", "2021", 2.0, 4);
        } else {
            Motocycle motocycle = new Motocycle("", "2022", 250);
        }
    }
}