/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.mechanic.controller;

/**
 *
 * @author ELEN
 */
public class Cambios {
    
    public String cambioDatos(String data){
        String cambio;
        
        switch(data){
            case "Año":
                return "Year";
            case "Marca":
                return "Trademark";
            case "Modelo":
                return "Model";   
        }  
        return null;
    }
            
}
