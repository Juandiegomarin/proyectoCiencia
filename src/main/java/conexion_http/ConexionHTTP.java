
package conexion_http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConexionHTTP {

    // Este método obtiene en un String la respuesta html completa
    public static String peticionHttpGet(String urlParaVisitar) throws IOException {
        // Aquí se guardará la respuesta (texto del json)
        //String textoResultado = "";
        StringBuilder lineas = new StringBuilder();
        URL url = new URL(urlParaVisitar);

        // Abrir la conexión e indicar que será de tipo GET
        HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
        conexion.setRequestMethod("GET");
        
        // Flujo de lectura
        try (BufferedReader flujoEntrada = new BufferedReader(new InputStreamReader(conexion.getInputStream()))) {
            String linea;
            // Mientras el BufferedReader se pueda leer, agregar contenido a resultado
            while ((linea = flujoEntrada.readLine()) != null) {
                System.out.println(linea);
                lineas.append(linea);
                //textoResultado+=linea;
            }
        }
        return lineas.toString();
    }
}
