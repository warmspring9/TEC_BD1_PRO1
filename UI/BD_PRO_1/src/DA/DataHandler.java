/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Mau
 */
public class DataHandler {
    /*public static ConnectDB dataConnection;
    public static Connection conn;
    
    DataHandler() throws SQLException{
        this.dataConnection= ConnectDB.getInstance();
        this.conn=dataConnection.getConnection();
    }*/
    
    //---------------------------------------------
    //*****procedimientos y funciones Canton*****
    //---------------------------------------------
    
    public static int getCantonIdProvince(int pValue) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packageCanton.getIdProvince(?)}");
        stmt.registerOutParameter(1, java.sql.Types.INTEGER);
        stmt.setInt(2, pValue);
        stmt.execute();
        int result = stmt.getInt(1);
        return result;
        
        }
    
    public static String getCantonName(int pValue) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packageCanton.getName(?)}");
        stmt.registerOutParameter(1, java.sql.Types.VARCHAR);
        stmt.setInt(2, pValue);
        stmt.execute();
        String result = stmt.getString(1);
        return result;
        
        }
    
    public static void createCanton(String pName, int pValue) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageCanton.createCanton(?,?)}");
        
        stmt.setString(1, pName);
        stmt.setInt(2, pValue);
        stmt.execute();
        }
    
    public static void updateCantonName(int pValue, String pName) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageCanton.updateCantonName(?,?)}");
        
        stmt.setInt(1, pValue);
        stmt.setString(2, pName);
        stmt.execute();
        }
    
    public static void deleteCanton(int pValue) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageCanton.deleteCanton(?)}");
        
        stmt.setInt(1, pValue);
        stmt.execute();
        }
    
    //---------------------------------------------
    //*****procedimientos y funciones Category*****
    //---------------------------------------------
    
    public static String getCategoryName(int pValue) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packageCategory.getName(?)}");
        stmt.registerOutParameter(1, java.sql.Types.VARCHAR);
        stmt.setInt(2, pValue);
        stmt.execute();
        String result = stmt.getString(1);
        return result;
        
        }
    
    public static void createCategory(String pName) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageCategory.createCategory(?)}");
        
        stmt.setString(1, pName);
        stmt.execute();
        }
    
    public static void updateCategoryName(int pValue, String pName) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageCategory.updateCategoryName(?,?)}");
        
        stmt.setInt(1, pValue);
        stmt.setString(2, pName);
        stmt.execute();
        }
    
    public static void deleteCategory(int pValue) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageCategory.deleteCategory(?)}");
        
        stmt.setInt(1, pValue);
        stmt.execute();
        }
    
    //---------------------------------------------
    //*****procedimientos y funciones Commentary*****
    
    public static String getCommentaryContent(int pValue) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packageCommentary.getContent(?)}");
        stmt.registerOutParameter(1, java.sql.Types.VARCHAR);
        stmt.setInt(2, pValue);
        stmt.execute();
        String result = stmt.getString(1);
        return result;
        
        }
    
    public static int getCommentaryIdPerson(int pValue) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packageCommentary.getIdPerson(?)}");
        stmt.registerOutParameter(1, java.sql.Types.INTEGER);
        stmt.setInt(2, pValue);
        stmt.execute();
        int result = stmt.getInt(1);
        return result;
        
        }
    
    public static int getCommentaryIdProposal(int pValue) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packageCommentary.getIdProposalx(?)}");
        stmt.registerOutParameter(1, java.sql.Types.INTEGER);
        stmt.setInt(2, pValue);
        stmt.execute();
        int result = stmt.getInt(1);
        return result;
        
        }
    /*
    public static date getCommentaryDate(int pValue) throws SQLException{
        
        
        }*/
    
     public static void createCommentary(String pContent, int pIdProposal, int pIdPerson) throws SQLException{
        //cambiar para crear date
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageCommentary.createCommentary(?, ?, ?)}");
        
        stmt.setString(1, pContent);
        stmt.setInt(2, pIdProposal);
        stmt.setInt(3, pIdPerson);
        stmt.execute();
        }
    
     public static void updateCommentaryContent( int pValue, String pContent) throws SQLException{
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageCommentary.updateCommentaryContent(?, ?)}");
        
        stmt.setInt(1, pValue);
        stmt.setString(2, pContent);
        stmt.execute();
        }
     
     public static void deleteCommentary( int pValue) throws SQLException{
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageCommentary.deleteCommentary(?)}");
        
        stmt.setInt(1, pValue);
        stmt.execute();
        }
    
     //---------------------------------------------
    //*****procedimientos y funciones Community*****
    //---------------------------------------------
    
    public static void createCommunity(String pName,int pValue) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageCommunity.createCommunity(?,?)}");
        
        stmt.setString(1, pName);
        stmt.setInt(2, pValue);
        stmt.execute();
        }
    
    public static void updateCommunityName(int pValue, String pName) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageCommunity.updateCommunityName(?,?)}");
        
        stmt.setInt(1, pValue);
        stmt.setString(2, pName);
        stmt.execute();
        }
    
    public static void deleteCommunity(int pValue) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageCommunity.deleteCommunity(?)}");
        
        stmt.setInt(1, pValue);
        stmt.execute();
        }
    
    public static String getCommunityName(int pValue) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packageCommunity.getName(?)}");
        stmt.registerOutParameter(1, java.sql.Types.VARCHAR);
        stmt.setInt(2, pValue);
        stmt.execute();
        String result = stmt.getString(1);
        return result;
        
        }
    
    public static int getCommunityIdDistrict(int pValue) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packageCommunity.getIdDistrict(?)}");
        stmt.registerOutParameter(1, java.sql.Types.INTEGER);
        stmt.setInt(2, pValue);
        stmt.execute();
        int result = stmt.getInt(1);
        return result;
        
        }
    
    //---------------------------------------------
    //*****procedimientos y funciones Community*****
    //---------------------------------------------
    
    public static String getCountryName(int pValue) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packageCountry.getCountryName(?)}");
        stmt.registerOutParameter(1, java.sql.Types.VARCHAR);
        stmt.setInt(2, pValue);
        stmt.execute();
        String result = stmt.getString(1);
        return result;
        
        }
    
    public static void createCountry(String pName) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageCountry.createCountry(?)}");
        
        stmt.setString(1, pName);
        stmt.execute();
        }
    
    }
    
        
    
    
    
    /*public static int createParameter(int pValue) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packageParameter.getParameterValue(?)}");
        stmt.registerOutParameter(1, java.sql.Types.INTEGER);
        stmt.setInt(2, pValue);
        stmt.execute();
        int result = stmt.getInt(1);
        return result;
        
        }*/
    

        