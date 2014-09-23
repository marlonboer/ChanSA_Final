/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chansa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author monan
 */
public class Database {
    
    private final String DATABASE = "ChanSA";
    private final String HOST = "jdbc:oracle://localhost/" + DATABASE;
    private final String USER = "system";
    private final String PASSWORD = "root";
    private Connection connection;
    
    private static Database instance;
    
    
    public static Database getInstance(){
        if (instance == null){
            instance = new Database();
        }
        return instance;
    }
    
    public Connection getConnection() throws SQLException{
        if (connection == null){
            connection = DriverManager.getConnection(HOST,USER,PASSWORD);
        }
        return connection;
    }    
    
}
