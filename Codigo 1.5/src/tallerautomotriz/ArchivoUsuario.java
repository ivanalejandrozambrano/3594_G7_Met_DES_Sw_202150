/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerautomotriz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Roberson Constante
 */
public class ArchivoUsuario {
    public void adicionarUsuario(Usuario a) {
        
        SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");
        String fechaNac= "";
         if(a.getFechaNacimiento()==null){
            fechaNac="";
        }else{
            fechaNac = formatter1.format(a.getFechaNacimiento());  
        }
        
       
        
        String aux = a.getApodo()+","+a.getClave()+","+a.getNombre()+","+a.getCorreo()+","+fechaNac+","+a.getCedula();
        FileWriter fw = null;
        PrintWriter pw = null;
        
        try {
            fw = new FileWriter("Usuario.txt", true);
            pw = new PrintWriter(fw);
            pw.println(aux);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public boolean validarUsuario(String apodo) {
        String s;
        boolean b = true;
        
        if(apodo.equals("")){
            return false;
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("Usuario.txt"));
            while ((s = br.readLine()) != null) {
                String[] parte = s.split(",");
                if (apodo.equalsIgnoreCase(parte[0])) {
                   b = false;
                }
            }
            br.close();
        } catch (IOException e) {

        }
        return b;
    }

    public ArrayList obtenerUsuarios() {
        ArrayList<Usuario> listaU = new ArrayList<>();
        String s;
        try {
            BufferedReader br = new BufferedReader(new FileReader("Usuario.txt"));          
            while ((s = br.readLine()) != null) {
                String[] parte = s.split(",");
                Date aux = new SimpleDateFormat("dd-mm-yyyy").parse(parte[4]);
                Usuario usuario1 = new Usuario(parte[0], parte[1], parte[2], parte[3], aux,parte[5]);
                listaU.add(usuario1);
            }
            br.close();
        } catch (IOException e) {

        } catch (ParseException ex) {
            Logger.getLogger(ArchivoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaU;
    }
    
    public boolean verificarClave(String apodo,String clave){
        String s;
        boolean b = false;

        try {
            BufferedReader br = new BufferedReader(new FileReader("Usuario.txt"));
            while ((s = br.readLine()) != null) {
                String[] parte = s.split(",");
                if(apodo.equalsIgnoreCase(parte[0])){
                    if (clave.equalsIgnoreCase(parte[1])) {
                    b = true;
                }
                }
                
            }
            br.close();
        } catch (IOException e) {

        }
        return b;
    }
        public ArrayList eliminarUsuario(Usuario u) {
        ArrayList<Usuario> lista = new ArrayList<>();
        String auxl = "";
        lista = obtenerUsuarios();
        Usuario aux = new Usuario();
        Iterator it = lista.iterator();
        try {
            FileWriter fw = new FileWriter("Usuario.txt");
            PrintWriter pw = new PrintWriter(fw);
            while (it.hasNext()) {
                aux = (Usuario) it.next();
                if (aux.getApodo()!=u.getApodo()) {
                 auxl = aux.getApodo()+","+aux.getClave()+","+aux.getNombre()+","+aux.getCorreo()+","+
                        String.valueOf(aux.getFechaNacimiento())+","+aux.getCedula();   
                        pw.println(auxl);
                }
            }          
            pw.close();
        } catch (IOException e) {
        }
        return lista;
    } 
    
}

