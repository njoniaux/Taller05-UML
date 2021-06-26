
package ec.edu.espol.models;

import java.util.Date;

/**
 *
 * @author joaqu
 */
public class Persona {
    private String usuario;
    private String clave;
    private String nombre;
    private String apellido;
    private String cedula;
    private String direccion;
    private Date fechaNac;
    
    public boolean logIn(){
        return true;
    }
    
    public boolean logOut(){
        return true;
    }
}
