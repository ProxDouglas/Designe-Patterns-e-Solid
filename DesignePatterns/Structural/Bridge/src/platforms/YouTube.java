package platforms;

public class YouTube implements IPlatform{
    public YouTube() {
        configureRMTO();
        System.out.println("YouTube: Transmissão iniciada");
    }

    @Override
    public void configureRMTO() {
        authToken();
        System.out.println("YouTube: Conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("YouTube: Autorizando aplicação");
    }
}
