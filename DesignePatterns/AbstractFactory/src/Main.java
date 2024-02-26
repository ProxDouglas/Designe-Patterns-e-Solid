import app.Aplication;
import factories.ITransportFactory;
import factories.NineNineTransport;
import factories.UberTransport;

public class Main {
    public static Aplication configureAplication(){
        Aplication app;
        ITransportFactory factory;

        String company = "uber";

        if(company == "uber"){
            factory = new UberTransport();
        } else {
            factory = new NineNineTransport();
        }

        app = new Aplication(factory);

        return app;
    }

    public static void main(String[] args) {
        Aplication app = configureAplication();
        app.startRoute();

    }
}