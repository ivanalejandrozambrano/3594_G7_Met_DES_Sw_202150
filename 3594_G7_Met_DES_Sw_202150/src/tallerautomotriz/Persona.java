package tallerautomotriz;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Persona {
    private String nombre;
    private String correo;
    private Date fechaNacimiento;
    private String cedula;
    private String apodo;
    private String clave;

    public Persona(String apodo, String clave,String nombre, String correo, Date fechaNacimiento, String cedula) {
        this.nombre = nombre;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
        this.cedula = cedula;
        this.apodo = apodo;
        this.clave = clave;
    }

    public Persona(String apodo, String clave,String nombre, String correo, String cedula ) {
        this.nombre = nombre;
        this.correo = correo;
        this.cedula = cedula;
        this.apodo = apodo;
        this.clave = clave;
    }

    public Persona() {
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
}
