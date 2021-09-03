package ec.edu.espe.mechanic.utils;

/**
 *
 * @author Sigma Programmers
 */
public abstract class SQLDBManager implements DBManager {

    public abstract boolean testConnection(String connection);
}
