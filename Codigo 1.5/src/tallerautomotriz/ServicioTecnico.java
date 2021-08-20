/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerautomotriz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ServicioTecnico {

    private String tipoDaño, localizacionVeh;
    private float cotizaciónDaño;
    private List<Taller> talleres;

    public ServicioTecnico(String tipoDaño, String localizacion, float cotizaciónDaño) {
        this.tipoDaño = tipoDaño;
        this.localizacionVeh = localizacion;
        this.cotizaciónDaño = cotizaciónDaño;
        talleres = new ArrayList<>();
    }

    public ServicioTecnico() {
    }

   public void adicionarVehiculo(Taller t1){
        File archivo = new File ("ArchivoTalleres.txt");
        String aux = t1.getNombre()+t1.getEspecialidad()+t1.getUbicacion();
       try{
        FileWriter fw = new FileWriter(archivo,true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(aux);
        fw.close();
        pw.close();
       }catch (Exception e){
           
       }
    }
    public ArrayList<Taller> obtenerTaller(){
        ArrayList<Taller> listaP = new ArrayList();
        String s;
        try {
            BufferedReader br = new BufferedReader(new FileReader("ArchivoTalleres.txt"));
            while ((s = br.readLine()) != null) {
                String[] datos = s.split(",");
                Taller t1 = new Taller(datos[0],datos[1],datos[2]);
                listaP.add(t1);
            }
            br.close();
        } catch (Exception a){
        }
        return listaP;
    }
    public void pedirServicioTecnico() {

    }
}
