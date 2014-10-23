package ar.com.ceiucaweb.qtt.config;

/**
 * Proveedor de valores de configuración dependientes del ambiente
 * Created by juanmougan@gmail.com on 23/10/14.
 */
public class SettingsProvider {

    // TODO - aca se deberia usar un framework de inyeccion de dependencias
    // por ahora queda todo static
    private static final String GENYMOTION_ENDPOINT = "http://192.168.56.1:8080";

    public static String getEndpoint() {
        return GENYMOTION_ENDPOINT;
    }

}
