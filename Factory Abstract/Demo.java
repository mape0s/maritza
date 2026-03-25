import Config.Application;
import factorys.GUIFabrica;
import factorys.claroFabrica;
import factorys.escuroFabrica;


public class Demo {

    private static Application AppConfig() {
        Application app;
        GUIFabrica factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("esc")) {
            factory = new escuroFabrica();
        } else {
            factory = new claroFabrica();
        }
        app = new Application(factory);
        return app;
    }


    public static void main(String[] args) {
        Application app = AppConfig();
        app.pintar();
    }
}

