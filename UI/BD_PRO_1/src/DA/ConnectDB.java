/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Mau
 */
public class ConnectDB {
    
    private static ConnectDB instance;
    private static Connection connectionDB;
    private String host="jdbc:oracle:thin:@localhost:1521:BDMAU";
    private String uName="pro";
    private String uPass="pro";
    
    private ConnectDB() throws SQLException{
        try {
            ConnectDB.connectionDB=DriverManager.getConnection(host, uName, uPass);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }           
    }
    
    public Connection getConnection(){
        return connectionDB;
    }
    
    public static ConnectDB getInstance() throws SQLException {
        if (instance == null) {
            instance = new ConnectDB();
        } else if (instance.getConnection().isClosed()) {
            instance = new ConnectDB();
        }

        return instance;
    }
}
    
   
