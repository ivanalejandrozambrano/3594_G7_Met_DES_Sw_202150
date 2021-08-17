package tallerautomotriz;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Repuesto {

    private String nombreP;
    private String marcaP;
    private double precioP;
    private long cantidad;

    public Repuesto( String nombreP, String marcaP, double precioP, long cantidad) {
        this.nombreP = nombreP;
        this.marcaP = marcaP;
        this.precioP = precioP;
        this.cantidad = cantidad;
    }

    public Repuesto() {

    }


    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getMarcaP() {
        return marcaP;
    }

    public void setMarcaP(String marcaP) {
        this.marcaP = marcaP;
    }

    public double getPrecioP() {
        return precioP;
    }

    public void setPrecioP(double precioP) {
        this.precioP = precioP;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

}
