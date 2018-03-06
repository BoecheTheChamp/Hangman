/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galgeleg;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 *
 * @author mikkel
 */
public class GalgeClient {
    public static void main(String[] args) throws MalformedURLException, Exception {
        
        URL url = new URL("http://localhost:9996/GalgeServer?wsdl");
	QName qname = new QName("http://localhost/Galgeleg/", "Galgelogik");
	Service service = Service.create(url, qname);
	GalgeInterface k = service.getPort(GalgeInterface.class);
       //Logikken fra galgelogik
        Galgelogik spil = new Galgelogik();
        spil.nulstil();
        //scanner
       Scanner sc = new Scanner(System.in);
       int i = sc.nextInt();
                
    boolean aktiv = true;
    while (aktiv)
    {
    //-------------------------------------
    //Gæt et ord til galgeleg
    System.out.println("Indtast et gæt");
    Scanner scanner = new Scanner(System.in);
    String username = scanner.nextLine();
    spil.gætBogstav(username);
    //-----------------------------------------
    }    
    }
    
}
