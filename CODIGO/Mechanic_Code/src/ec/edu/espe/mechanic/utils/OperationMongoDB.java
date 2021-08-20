/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.mechanic.utils;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

/**
 *
 * @author SigmaProgramers
 */
public class OperationMongoDB {

   
    public static void createCar(MongoClient mongo, String dataBase, String collection, int year, String registration, String plate, String trademark, String model, String mileage) {
        DB db = mongo.getDB(dataBase);
        DBCollection dbCollection = db.getCollection(collection);
        BasicDBObject document = new BasicDBObject();

        document.put("Year", year);
        document.put("Registration", registration);
        document.put("Plate", plate);
        document.put("Trademark", trademark);
        document.put("Model", model);
        document.put("Mileage", mileage);

        dbCollection.insert(document);
    }
    
    public static void updateCars(MongoClient mongo, String dataBase, String collection, String data, String newData, String field) {
        DB db = mongo.getDB(dataBase);
        DBCollection dbCollection = db.getCollection(collection);
        BasicDBObject searchedName = new BasicDBObject();
        BasicDBObject updateData = new BasicDBObject();
        try {
            if (field.equals("Year")) {
                searchedName.append(field, data);
                updateData.append("$set", new BasicDBObject().append(field, newData));

            } else if (field.equals("Registration")) {
                searchedName.append(field, data);
                updateData.append("$set", new BasicDBObject().append(field, newData));

            } else if (field.equals("Plate")) {
                searchedName.append(field, data);
                updateData.append("$set", new BasicDBObject().append(field, newData));

            } else if (field.equals("Trademark")) {
                searchedName.append(field, data);
                updateData.append("$set", new BasicDBObject().append(field, newData));

            } else if (field.equals("Model")) {
                searchedName.append(field, data);
                updateData.append("$set", new BasicDBObject().append(field, newData));

            } else if (field.equals("Mileage")) {
                searchedName.append(field, data);
                updateData.append("$set", new BasicDBObject().append(field, newData));
            }
            dbCollection.updateMulti(searchedName, updateData);

        } catch (Exception ex) {
            System.out.println("DATA NOT FOUND");
        }
    }

    public static void deleteCars(MongoClient mongo, String dataBase, String collection, String plate) {
        try {
            DB db = mongo.getDB(dataBase);
            DBCollection dbCollection = db.getCollection(collection);
            dbCollection.remove(new BasicDBObject().append("Plate", plate));
        } catch (Exception ex) {
            System.out.println("DATA NOT FOUNT");
        }
    }

    public static void createUser(MongoClient mongo, String dataBase, String collection, String name, String lastName, String id, String user, String password) {
        DB db = mongo.getDB(dataBase);
        DBCollection dbCollection = db.getCollection(collection);
        BasicDBObject document = new BasicDBObject();

        document.put("Nombre", name);
        document.put("Apellido", lastName);
        document.put("Cedula", id);
        document.put("Usuario", user);
        document.put("Contrasena", password);

        dbCollection.insert(document);
    }

    public static void createCustumer(MongoClient mongo, String dataBase, String collection, String name, String lastName, String id, String phone, String mail) {
        DB db = mongo.getDB(dataBase);
        DBCollection dbCollection = db.getCollection(collection);
        BasicDBObject document = new BasicDBObject();

        document.put("Nombre", name);
        document.put("Apellido", lastName);
        document.put("Cedula", id);
        document.put("Telefono",phone );
        document.put("E-Mail",mail );

        dbCollection.insert(document);
    }
    
    public static void updateCustumer(MongoClient mongo, String dataBase, String collection, String data, String newData, String field) {
        DB db = mongo.getDB(dataBase);
        DBCollection dbCollection = db.getCollection(collection);
        BasicDBObject searchedName = new BasicDBObject();
        BasicDBObject updateData = new BasicDBObject();
        try {
            if (field.equals("Name")) {
                searchedName.append(field, data);
                updateData.append("$set", new BasicDBObject().append(field, newData));

            } else if (field.equals("LastName")) {
                searchedName.append(field, data);
                updateData.append("$set", new BasicDBObject().append(field, newData));

            } else if (field.equals("Cedula")) {
                searchedName.append(field, data);
                updateData.append("$set", new BasicDBObject().append(field, newData));

            } else if (field.equals("Telefono")) {
                searchedName.append(field, data);
                updateData.append("$set", new BasicDBObject().append(field, newData));

            } else if (field.equals("E-Mail")) {
                searchedName.append(field, data);
                updateData.append("$set", new BasicDBObject().append(field, newData));
            }
            dbCollection.updateMulti(searchedName, updateData);

        } catch (Exception ex) {
            System.out.println("DATA NOT FOUND");
        }
    }

    public static void deleteCustumer(MongoClient mongo, String dataBase, String collection, String ID) {
        try {
            DB db = mongo.getDB(dataBase);
            DBCollection dbCollection = db.getCollection(collection);
            dbCollection.remove(new BasicDBObject().append("ID", ID));
        } catch (Exception ex) {
            System.out.println("DATA NOT FOUNT");
        }
    }

    
    public static void createParts(MongoClient mongo, String dataBase, String collection, String code, String name, String trademark, String model, String price) {
        DB db = mongo.getDB(dataBase);
        DBCollection dbCollection = db.getCollection(collection);
        BasicDBObject document = new BasicDBObject();

        document.put("Codigo", code);
        document.put("Nombre", name);
        document.put("Marca", trademark);
        document.put("Modelo", model);
        document.put("Precio", price);

        dbCollection.insert(document);
    }
    
    public static void updateParts(MongoClient mongo, String dataBase, String collection, String data, String newData, String field) {
        DB db = mongo.getDB(dataBase);
        DBCollection dbCollection = db.getCollection(collection);
        BasicDBObject searchedName = new BasicDBObject();
        BasicDBObject updateData = new BasicDBObject();
        try {
            if (field.equals("Codigo")) {
                searchedName.append(field, data);
                updateData.append("$set", new BasicDBObject().append(field, newData));

            } else if (field.equals("Nombre")) {
                searchedName.append(field, data);
                updateData.append("$set", new BasicDBObject().append(field, newData));

            } else if (field.equals("Marca")) {
                searchedName.append(field, data);
                updateData.append("$set", new BasicDBObject().append(field, newData));

            } else if (field.equals("Modelo")) {
                searchedName.append(field, data);
                updateData.append("$set", new BasicDBObject().append(field, newData));

            } else if (field.equals("Precio")) {
                searchedName.append(field, data);
                updateData.append("$set", new BasicDBObject().append(field, newData));
            }
            dbCollection.updateMulti(searchedName, updateData);

        } catch (Exception ex) {
            System.out.println("DATA NOT FOUND");
        }
    }

    public static void deleteParts(MongoClient mongo, String dataBase, String collection, String ID) {
        try {
            DB db = mongo.getDB(dataBase);
            DBCollection dbCollection = db.getCollection(collection);
            dbCollection.remove(new BasicDBObject().append("ID", ID));
        } catch (Exception ex) {
            System.out.println("DATA NOT FOUNT");
        }
    }
}
