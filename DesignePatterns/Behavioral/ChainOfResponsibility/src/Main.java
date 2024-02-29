import middlewares.CheckPermissionMiddleware;
import middlewares.CheckUserMiddleware;
import middlewares.Middleware;
import server.Server;

import java.io.IOException;

public class Main {
    private static Server server;

    public static void init() {
        server = new Server();
        server.registerUser("master@hcode.com.br", "87trbcki");
        server.registerUser("ventus@hcode.com.br", "87trbcki2");
        server.registerUser("grey@hcode.com.br", "87trbcki3");

        Middleware middleware = new CheckUserMiddleware(server);
        Middleware middleware2 = middleware.linkWith(new CheckPermissionMiddleware());
        Middleware middleware3 = middleware2.linkWith(new CheckPermissionMiddleware());
        Middleware middleware4 = middleware3.linkWith(new CheckPermissionMiddleware());

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        String email = "";
        String password = "";
        init();

        boolean done;

        email = "ventus@hcode.com.br";
        password = "87trbcki2";

//        email = "master@hcode.com.br";
//        password = "87trbcki";

        done = server.login(email, password);
    }
}