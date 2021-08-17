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
public class ArchivoVentaVehiculo {
    public void adicionarVenta(VentaVehiculo a) {
        String aux = a.getCodigo()+","+a.getNombreComprador()+","+a.getNombreCuenta()+","+a.getPrecioVenta()+","+a.getFechaEntrega()+","+a.getFechaFactura();
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("VentaVehiculo.txt", true);
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
    
    public ArrayList obtenerVentasVehiculos() {
        ArrayList<VentaVehiculo> listaA = new ArrayList<VentaVehiculo>();
        String s;
        try {
            BufferedReader br = new BufferedReader(new FileReader("VentaVehiculo.txt"));
            while ((s = br.readLine()) != null) {
                String[] parte = s.split(",");
                VentaVehiculo vv1 = new VentaVehiculo(parte[0],parte[1], Long.parseLong(parte[2]),Float.parseFloat(parte[3]), parte[4],parte[5]);
                listaA.add(vv1);
            }
            br.close();
        } catch (IOException e) {

        }
        return listaA;

    }
    
    public VentaVehiculo BuscarVenta(String codigo) {

        String s;
        VentaVehiculo a1 = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader("Administrador.txt"));
            while ((s = br.readLine()) != null) {
                String[] parte = s.split(",");
                if (codigo.equalsIgnoreCase(parte[0])) {
                    a1 = new VentaVehiculo(parte[0],parte[1], Long.parseLong(parte[2]),Float.parseFloat(parte[3]), parte[4],parte[5]);
                }
            }
            br.close();
        } catch (IOException e) {

        }
        return a1;
    }
    
}

