package server;

import middlewares.Middleware;

import java.util.HashMap;
import java.util.Map;

public class Server {

    private Map<String, String> users = new HashMap<>();
    private Middleware middleware;

    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    public boolean login(String email, String password){
        if(middleware.check(email, password) == true){
            System.out.println("Usuario autenticado com sucesso!");
            System.out.println("Seja bem vindo!");
            return true;
        }
        return false;
    }

    public void registerUser(String email, String password){
        users.put(email, password);
    }

    public boolean hasEmail(String email){
        return users.containsKey(email);
    }

    public boolean isValidadPassword(String email, String password){
        return users.get(email).equals(password);
    }

}
