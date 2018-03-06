/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galgeleg;
import java.rmi.Naming;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import javax.xml.ws.Endpoint;

/**
 *
 * @author mikkel
 */
public class GalgeServer { 
    public static void main(String[] args) throws RemoteException, MalformedURLException, Exception
    { 
        //java.rmi.registry.LocateRegistry.createRegistry(1500);
    java.rmi.registry.LocateRegistry.createRegistry(1593);
    GalgeInterface gs = new Galgelogik();
     //publisher server, med port:9996 
   //Benytter logikken fra galgelogik. 
   //Endpoint.publish("http://localhost:9996/kontotjeneste", gs);
   Endpoint.publish("http://ubuntu4.saluton.dk:9396/GalgeServer", gs);
    
    System.out.println("Serveren er publiseret");
    
    
    
    }
    
}
