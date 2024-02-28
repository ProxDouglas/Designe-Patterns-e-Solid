package middlewares;

import server.Server;

public class CheckUserMiddleware extends Middleware {
    private Server server;

    public CheckUserMiddleware(Server server){
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if(!server.hasEmail(email)){
            System.out.print("Email invalido");
            return false;
        }

        if(!server.isValidadPassword(email, password)){
            System.out.println("E-mail ou senha Invalidos");
            return false;
        }

        return checkNext(email, password);
    }
}
