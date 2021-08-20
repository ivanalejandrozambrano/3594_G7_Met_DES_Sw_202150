package tallerautomotriz;


import java.util.Date;
public class Usuario extends Persona{
    
    
    public Usuario(String apodo, String clave,String nombre, String correo, Date fechaNacimiento, String cedula) {
        super(apodo, clave,nombre, correo, fechaNacimiento, cedula);
    }

    public Usuario() {
   
    }
   
}
