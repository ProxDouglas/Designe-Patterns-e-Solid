package aircrafts;

public class Helicopter implements IAircraft{
    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Iniciando a decolagem");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros a bordo, Vôo autorizado!");
    }

    @Override
    public void wind() {
        System.out.println("Ventos a 25 kmk, ventos ok!");
    }
}
