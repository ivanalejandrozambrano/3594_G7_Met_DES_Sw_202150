package ec.edu.espe.mechanic.utils;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

/**
 *
 * @author Sigma Programmers
 */
public class Connection {

    public static MongoClient createConnection() {

        try {
            System.out.println("\nESTABLISHED CONNECTION");
            MongoClientURI uri = new MongoClientURI(
                    "mongodb+srv://jacortez3:012345678A@cluster0.bxl4p.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");

            MongoClient mongoClient = new MongoClient(uri);
            return mongoClient;
        } catch (Exception ex) {
            System.out.println("\nCONNECTION REFUSED");
            return null;
        }
    }
}
