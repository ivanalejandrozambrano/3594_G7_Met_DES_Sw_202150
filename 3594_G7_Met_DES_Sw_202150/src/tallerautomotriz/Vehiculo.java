/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerautomotriz;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Vehiculo {

    private String marca, modelo, color, tipoVehiculo, tipoMotor, tipoTransmision, chasis, materialInterior, placa, tipoLLanta, tipoAros;
    private int cilindraje, numeroPuerta;
    private int añoFabricacion, añoMatricula;
    private float precio;
    private boolean disponibilidad;

    public Vehiculo(String marca, String modelo, String color, String tipoVehiculo, String tipoMotor, String tipoTransmision, 
            String chasis, String materialInterior, String placa, String tipoLLanta, String tipoAros, int cilindraje, int numeroPuerta,
            float precio, boolean disponibilidad, int añoFabricacion, int añoMatricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipoVehiculo = tipoVehiculo;
        this.tipoMotor = tipoMotor;
        this.tipoTransmision = tipoTransmision;
        this.chasis = chasis;
        this.materialInterior = materialInterior;
        this.placa = placa;
        this.tipoLLanta = tipoLLanta;
        this.tipoAros = tipoAros;
        this.cilindraje = cilindraje;
        this.numeroPuerta = numeroPuerta;
        this.añoFabricacion = añoFabricacion;
        this.añoMatricula = añoMatricula;
        this.precio=precio;
        this.disponibilidad = disponibilidad;
    }

    public Vehiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getMaterialInterior() {
        return materialInterior;
    }

    public void setMaterialInterior(String materialInterior) {
        this.materialInterior = materialInterior;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoLLanta() {
        return tipoLLanta;
    }

    public void setTipoLLanta(String tipoLLanta) {
        this.tipoLLanta = tipoLLanta;
    }

    public String getTipoAros() {
        return tipoAros;
    }

    public void setTipoAros(String tipoAros) {
        this.tipoAros = tipoAros;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }

    public void setNumeroPuerta(int numeroPuerta) {
        this.numeroPuerta = numeroPuerta;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public int  getAñoMatricula() {
        return añoMatricula;
    }

    public void setAñoMatricula(int añoMatricula) {
        this.añoMatricula = añoMatricula;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

      
}
