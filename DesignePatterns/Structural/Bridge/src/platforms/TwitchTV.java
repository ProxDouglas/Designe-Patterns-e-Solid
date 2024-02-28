package platforms;

public class TwitchTV implements IPlatform{
    public TwitchTV() {
        configureRMTO();
        System.out.println("TwitchTV: Transmissão iniciada");
    }

    @Override
    public void configureRMTO() {
        authToken();
        System.out.println("TwitchTV: Conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("TwitchTV: Autorizando aplicação");
    }
}
