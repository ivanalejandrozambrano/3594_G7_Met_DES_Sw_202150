package tallerautomotriz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Byron
 */
public class ArchivoAdmin {
    public void adicionarAdministrador(Administrador a) {
        String aux = a.getApodo()+","+a.getClave()+","+a.getNombre()+","+a.getCorreo()+","+a.getCedula();
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("Administrador.txt", true);
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

    public boolean validarAdministrador(String apodo) {
        String s;
        boolean b = true;

        try {
            BufferedReader br = new BufferedReader(new FileReader("Administrador.txt"));
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

    public Administrador BuscarAdministrador(String apodo) {

        String s;
        Administrador a1 = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader("Administrador.txt"));
            while ((s = br.readLine()) != null) {
                String[] parte = s.split(",");
                if (apodo.equalsIgnoreCase(parte[0])) {
                    a1 = new Administrador(parte[0], parte[1], parte[2], parte[3], parte[4]);
                }
            }
            br.close();
        } catch (IOException e) {

        }
        return a1;
    }

    public ArrayList obtenerAdministradores() {
        ArrayList<Administrador> listaA = new ArrayList<Administrador>();
        String s;
        try {
            BufferedReader br = new BufferedReader(new FileReader("Administrador.txt"));
            while ((s = br.readLine()) != null) {
                String[] parte = s.split(",");
                Administrador admin1 = new Administrador(parte[0], parte[1], parte[2], parte[3], parte[4]);
                listaA.add(admin1);
            }
            br.close();
        } catch (IOException e) {

        }
        return listaA;

    }
    
    public boolean verificarClave(String apodo,String clave){
        String s;
        boolean b = false;

        try {
            BufferedReader br = new BufferedReader(new FileReader("Administrador.txt"));
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
    
}
