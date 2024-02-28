package platforms;

public class Facebook implements IPlatform{
    public Facebook() {
        configureRMTO();
        System.out.println("Facebook: Transmissão iniciada");
    }

    @Override
    public void configureRMTO() {
        authToken();
        System.out.println("Facebook: Conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("Facebook: Autorizando aplicação");
    }
}
