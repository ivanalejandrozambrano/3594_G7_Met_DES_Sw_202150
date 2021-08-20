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
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Roberson Constante
 */
public class ArchivoRepuestos {
     public void adicionarRepuesto(Repuesto r){
        File archivo = new File ("ArchivoRepuesto.txt");
        String aux = r.getNombreP()+","+r.getMarcaP()+","+r.getPrecioP()+","+r.getCantidad();
       try{
        FileWriter fw = new FileWriter(archivo,true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(aux);
        fw.close();
        pw.close();
       }catch (Exception e){          
       }
    }
    public ArrayList<Repuesto> obtenerRepuesto(){
        ArrayList<Repuesto> listaR = new ArrayList();
        String s;
        try {
            BufferedReader br = new BufferedReader(new FileReader("ArchivoRepuesto.txt"));
            while ((s = br.readLine()) != null) {
                String[] datos = s.split(",");
                Repuesto r1 = new Repuesto(datos[0],datos[1],Double.parseDouble(datos[2]),Long.parseLong(datos[3]));
                listaR.add(r1);
            }
            br.close();
        } catch (Exception a){
        }
        return listaR;
    }
     public boolean  validarRepuesto(String repuesto) {
            String s;
            boolean b = true;
            try {
                BufferedReader br = new BufferedReader(new FileReader("ArchivoRepuesto.txt"));
                while ((s = br.readLine()) != null) {
                    String[] datos = s.split(",");
                    if (repuesto.equalsIgnoreCase(datos[0])) {
                    b = false;
                }
                }
                br.close();
            } catch (IOException e) {
            }
            return b;
        }
        public ArrayList<Repuesto> buscarRepuesto(String repuesto) {
            ArrayList<Repuesto> lista = new ArrayList<>();
            String s;
            boolean b = true;
            try {
                BufferedReader br = new BufferedReader(new FileReader("ArchivoRepuesto.txt"));
                while ((s = br.readLine()) != null) {
                    String[] datos = s.split(",");
                    if (repuesto.equalsIgnoreCase(datos[0]) || repuesto.equalsIgnoreCase(datos[1])) {
                        Repuesto r1 = new Repuesto(datos[0], datos[1], Double.parseDouble(datos[2]), Long.parseLong(datos[3]));
                        lista.add(r1);
                    }
                }
                br.close();
            } catch (IOException e) {
            }
            return lista;
        }
            public Repuesto buscarRepuestoNombre(String chasis) {
            String s;
            Repuesto r1=null;
            try {
                BufferedReader br = new BufferedReader(new FileReader("ArchivoRepuesto.txt"));
                while ((s = br.readLine()) != null) {
                    String[] datos = s.split(",");
                    if (chasis.equalsIgnoreCase(datos[0])) {
                        r1 = new Repuesto(datos[0], datos[1], Double.parseDouble(datos[2]), Long.parseLong(datos[3]));
                    }                
                }
                br.close();
            } catch (IOException e) {
            }       
            return r1;
        }
        public void modificarRepuesto(Repuesto r) {
        ArrayList<Repuesto> lista = new ArrayList<>();
        String auxl = "";
        lista = obtenerRepuesto();
        Repuesto aux = new Repuesto();
        Iterator it = lista.iterator();
        try {
            FileWriter fw = new FileWriter("ArchivoRepuesto.txt");
                PrintWriter pw = new PrintWriter(fw);
                while (it.hasNext()) {
                    aux = (Repuesto) it.next();
                    if (aux.getNombreP().equalsIgnoreCase(r.getNombreP())){
                        auxl = aux.getNombreP()+","+r.getMarcaP()+","+r.getPrecioP()+","+r.getCantidad();
                        pw.println(auxl);
                    } else {
                        auxl = aux.getNombreP()+","+aux.getMarcaP()+","+aux.getPrecioP()+","+aux.getCantidad();
                        pw.println(auxl);
                    }
                }
                pw.close();
            } catch (IOException e) {
            }
        }
        public void eliminarRepuesto(Repuesto r) {
        ArrayList<Repuesto> lista = new ArrayList<>();
        String auxl = "";
        lista = obtenerRepuesto();
        Repuesto aux = new Repuesto();
        Iterator it = lista.iterator();
        try {
            FileWriter fw = new FileWriter("ArchivoRepuesto.txt");
                PrintWriter pw = new PrintWriter(fw);
                while (it.hasNext()) {
                    aux = (Repuesto) it.next();
                    if (aux.getNombreP().equalsIgnoreCase(r.getNombreP())) {
                    } else {
                       auxl = aux.getNombreP()+","+aux.getMarcaP()+","+aux.getPrecioP()+","+aux.getCantidad();
                        pw.println(auxl);
                    }
                }
                pw.close();
            } catch (IOException e) {
            }      
    } 
    }
