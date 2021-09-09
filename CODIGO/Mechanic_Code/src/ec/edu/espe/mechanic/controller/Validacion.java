package ec.edu.espe.mechanic.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import static ec.edu.espe.mechanic.utils.Connection.createConnection;

public class Validacion {

    DB db;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject();
    MongoClient mongo = createConnection();
    
    public boolean validarUser(String user){
        DBCursor cursor = null;
        
        DB db = mongo.getDB("Mechanic");
        DBCollection dbCollection = db.getCollection("Users");
        
        cursor = dbCollection.find();
        
        while (cursor.hasNext()) {
            
            
            DBObject obj = cursor.next();
            String name = (String) obj.get("Usuario");

            if(name.equals(user) ){
               return true;
               
            }
        } 
        return false;
        
    }

    public boolean validarID(String user,String colecction){
        DBCursor cursor = null;
        
        DB db = mongo.getDB("Mechanic");
        DBCollection dbCollection = db.getCollection(colecction);
        
        cursor = dbCollection.find();
        
        while (cursor.hasNext()) {
            
            DBObject obj = cursor.next();
            String name = (String) obj.get("Cedula");

            if(name.equals(user) ){
               return true;
            }
        } 
        return false;  
    }
    
    public boolean validarPlate(String plate){
        DBCursor cursor = null;
        
        DB db = mongo.getDB("Mechanic");
        DBCollection dbCollection = db.getCollection("Cars");
        
        cursor = dbCollection.find();
        
        while (cursor.hasNext()) {
            
            DBObject obj = cursor.next();
            String name = (String) obj.get("Plate");

            if(name.equals(plate) ){
               return true;
            }
        } 
        return false;  
    }
    
    public boolean validarMatricula(String plate){
        DBCursor cursor = null;
        
        DB db = mongo.getDB("Mechanic");
        DBCollection dbCollection = db.getCollection("Cars");
        
        cursor = dbCollection.find();
        
        while (cursor.hasNext()) {
            
            DBObject obj = cursor.next();
            String name = (String) obj.get("Registration");

            if(name.equals(plate) ){
               return true;
            }
        } 
        return false;  
    }
    
    public boolean validarCode(String code){
        DBCursor cursor = null;
        
        DB db = mongo.getDB("Mechanic");
        DBCollection dbCollection = db.getCollection("Parts");
        
        cursor = dbCollection.find();
        
        while (cursor.hasNext()) {
            
            DBObject obj = cursor.next();
            String name = (String) obj.get("Codigo");

            if(name.equals(code) ){
               return true;
            }
        } 
        return false;  
    }
}
