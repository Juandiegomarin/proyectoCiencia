
package main;

import conexion_http.ConexionHTTP;
import java.io.IOException;
import javax.swing.JOptionPane;
import modelo.Emision;
import serviciojson.JsonService;

public class Main {

   
    public static void main(String[] args) throws IOException {
        
        
        String urlUsuario=JOptionPane.showInputDialog("Introduce la url");
        
        String urlBase = "https://api.websitecarbon.com/site?url=https://www.".concat(urlUsuario).concat("/");
            
        String fichero = ConexionHTTP.peticionHttpGet(urlBase);
        
        
        Emision emision= (Emision) JsonService.stringToPojo(fichero, Emision.class);
        
        System.out.println("---------------------------------------");
        
        String resultado="""
                        
                        Url de la Pagina de visita=%s
                        Estado de la pagina:%b 
                        Numero de bytes:%d 
                        
                        
                        
                        """.formatted(emision.getUrl(),emision.getGreen(),emision.getBytes());
        
        System.out.println(resultado);

        
    }
    
}
