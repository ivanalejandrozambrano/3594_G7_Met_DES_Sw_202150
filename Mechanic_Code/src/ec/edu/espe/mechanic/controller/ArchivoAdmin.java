package ec.edu.espe.mechanic.controller;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import static ec.edu.espe.mechanic.utils.Connection.createConnection;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArchivoAdmin {

    public boolean validarUser(String apodo) {
        MongoClient mongo = createConnection();
        DBCursor cursor = null;
        DB db = mongo.getDB("Mechanic");
        DBCollection dbCollection = db.getCollection("Users");
        cursor = dbCollection.find();
        String users[] = null;
        while (cursor.hasNext()) {
            DBObject obj = cursor.next();
            String user = (String) obj.get("Usuario");
            
            if(apodo == user){
                return true;
            }
            
            users = new String[]{user}; 
        }
        
        cursor.close();
        return false;
    }

    public boolean validarID(String apodo) {
        MongoClient mongo = createConnection();
        DBCursor cursor = null;
        DB db = mongo.getDB("Mechanic");
        DBCollection dbCollection = db.getCollection("Users");
        cursor = dbCollection.find();
        String users[] = null;
        while (cursor.hasNext()) {
            DBObject obj = cursor.next();
            String user = (String) obj.get("Cedula");
            users = new String[]{user}; 
        }
        
        for(int i = 0; i< users.length;i++){
            if(apodo == users[i]){
                return true;
            }
        }
        cursor.close();
        return false;
    }

    public boolean verificarClave(String apodo, String clave) {
        String s;
        boolean b = false;

        try {
            BufferedReader br = new BufferedReader(new FileReader("Administrador.txt"));
            while ((s = br.readLine()) != null) {
                String[] parte = s.split(",");
                if (apodo.equalsIgnoreCase(parte[0])) {
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
