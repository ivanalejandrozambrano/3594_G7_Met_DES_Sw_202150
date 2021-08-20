package tallerautomotriz;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.Console;
import java.util.Scanner;

public class VentaVehiculo {

    private String nombreComprador;
    private long nombreCuenta;
    private float precioVenta;
    private String fechaEntrega;
    private String fechaFactura;
    private String codigo;

    public VentaVehiculo(String codigo,String nombreComprador, long nombreCuenta,  float precioVenta, String fechaEntrega, String fechaFactura) {
        this.codigo=codigo;
        this.nombreComprador = nombreComprador;
        this.nombreCuenta = nombreCuenta;
        this.precioVenta = precioVenta;
        this.fechaEntrega = fechaEntrega;
        this.fechaFactura = fechaFactura;
        
    }

    public VentaVehiculo() {
    }
    

    public String getNombreComprador() {
        return nombreComprador;
    }

    public void setNombreComprador(String nombreComprador) {
        this.nombreComprador = nombreComprador;
    }

    public long getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(long nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

}
