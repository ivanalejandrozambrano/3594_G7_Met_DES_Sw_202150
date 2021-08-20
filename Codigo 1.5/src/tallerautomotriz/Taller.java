/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerautomotriz;

/**
 *
 * @author Roberson Constante
 */
public class Taller {
    private String nombre,especialidad,ubicacion;
    private long numeroTel;

    public Taller(String nombre, String especialidad, String ubicacion) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.ubicacion = ubicacion;
    }

   public Taller() {
   }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

 
    
    
}
