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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import oracle.jdbc.OracleTypes;

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
        
        
        String host="jdbc:oracle:thin:@localhost:1521:BDMAU";
        String uName="pro";
        String uPass="pro";
        Connection conn=DriverManager.getConnection(host, uName, uPass);
        
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
    
    public static int getCommunityIdCanton(int pValue) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packageCommunity.getIdCanton(?)}");
        stmt.registerOutParameter(1, java.sql.Types.INTEGER);
        stmt.setInt(2, pValue);
        stmt.execute();
        int result = stmt.getInt(1);
        return result;
        
        }
    
    //---------------------------------------------
    //*****procedimientos y funciones Country*****
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
    
    public static void updateCountryName(int pValue, String pName) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageCountry.updateCountryName(?, ?)}");
        
        stmt.setInt(1, pValue);
        stmt.setString(2, pName);
        stmt.execute();
        }
    
    public static void deleteCountry(int pValue) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageCountry.deleteCountry(?)}");
        
        stmt.setInt(1, pValue);
        stmt.execute();
        }
    
    //---------------------------------------------
    //*****procedimientos y funciones District*****
    //--------------------------------------------
   
    
    //---------------------------------------------
    //*****procedimientos y funciones Email*****
    //--------------------------------------------
    
    public static String getEmailAddress(int pValue) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packageEmail.getEmailAddress(?)}");
        stmt.registerOutParameter(1, java.sql.Types.VARCHAR);
        stmt.setInt(2, pValue);
        stmt.execute();
        String result = stmt.getString(1);
        return result;
        
        }
    
    public static void createEmail( String pAddress, int pValue) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageEmail.createEmail(?, ?)}");
        
        stmt.setString(1, pAddress);
        stmt.setInt(2, pValue);
        stmt.execute();
        }
    
    
    public static void updateEmailAddress( int pValue, String pAddress) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageEmail.updateEmailAddress(?, ?)}");
        
        stmt.setInt(1, pValue);
        stmt.setString(2, pAddress);
        stmt.execute();
        }
    
    public static void deleteEmail( int pValue) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageEmail.deleteEmail(?)}");
        
        stmt.setInt(1, pValue);
        stmt.execute();
        }
    
    //---------------------------------------------
    //*****procedimientos y funciones log_in*****   
    //--------------------------------------------
    public static String getLogInPassword(int pValue) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packageLogIn.getLogInPassword(?)}");
        stmt.registerOutParameter(1, java.sql.Types.VARCHAR);
        stmt.setInt(2, pValue);
        stmt.execute();
        String result = stmt.getString(1);
        return result;
        
        }
    
    public static int getLogInUserType(int pValue) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packageLogIn.getLogInUserType(?)}");
        stmt.registerOutParameter(1, java.sql.Types.INTEGER);
        stmt.setInt(2, pValue);
        stmt.execute();
        int result = stmt.getInt(1);
        return result;
        
        }
    
    public static void updateLogInPassword(int pValue, String pName) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageLogIn.updateLogInPassword(?, ?)}");
        stmt.setInt(1, pValue);
        stmt.setString(2, pName);
        
        stmt.execute();
        
        }
    
    public static void createLogIn(String pName, int pUserType) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageLogIn.createLogIn(?, ?)}");
        stmt.setString(1, pName);
        stmt.setInt(2, pUserType);
        
        stmt.execute();
        
        }
    
    public static void deleteLogIn(int pValue) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageLogIn.deleteLogIn(?)}");
        stmt.setInt(1, pValue);
        
        stmt.execute();
        
        }
    
    //---------------------------------------------
    //*****procedimientos y funciones parameter*****   
    //--------------------------------------------
    
    public static String getParameterName(int pValue) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packageParameter.getParameterName(?)}");
        stmt.registerOutParameter(1, java.sql.Types.VARCHAR);
        stmt.setInt(2, pValue);
        stmt.execute();
        String result = stmt.getString(1);
        return result;
    
    }
    
    public static int getParameterValue(int pValue) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packageParameter.getParameterValue(?)}");
        stmt.registerOutParameter(1, java.sql.Types.INTEGER);
        stmt.setInt(2, pValue);
        stmt.execute();
        int result = stmt.getInt(1);
        return result;
    
    }
    
    public static void updateParameterValue(int pIdParameter, int pValue) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageParameter.updateParameterValue(?, ?)}");
        stmt.setInt(1, pIdParameter);
        stmt.setInt(2, pValue);
        
        stmt.execute();
        
        }
    
    public static void updateParameterName(int pIdParameter, String pName) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageParameter.updateParameterName(?, ?)}");
        stmt.setInt(1, pIdParameter);
        stmt.setString(2, pName);
        
        stmt.execute();
        
        }
    
    public static void createParameter(String pName, int pValue) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageParameter.createParameter(?, ?)}");
        stmt.setString(1, pName);
        stmt.setInt(2, pValue);
        
        stmt.execute();
        
        }
    
    public static void deleteParameter(int pValue) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageParameter.deleteParameter(?)}");
        stmt.setInt(1, pValue);
        stmt.execute();
        
        }
    
    //---------------------------------------------
    //*****procedimientos y funciones Person*****
    //---------------------------------------------
    
    public static void createPerson(int pIdPerson, String pName, String pLastName, String pLastName2, String pDate, int pIdCommunity) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
        
        java.util.Date myDate = new java.util.Date(pDate);
        java.sql.Date sqlDate = new java.sql.Date(myDate.getTime());
                
        CallableStatement stmt=conn.prepareCall("{ call packagePerson.createPerson(?,?,?,?,?,?)}");
        stmt.setInt(1, pIdPerson);
        stmt.setString(2, pName);
        stmt.setString(3, pLastName);
        stmt.setString(4, pLastName2);
        stmt.setDate(5, sqlDate);
        stmt.setInt(6, pIdCommunity);
        
        
        stmt.execute();
        
        }
    
    public static void deletePerson(int pIdPerson) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
        CallableStatement stmt=conn.prepareCall("{ call packagePerson.deletePerson(?)}");
        stmt.setInt(1, pIdPerson);
        stmt.execute();
        
        }
    
    public static void updatePersonBirthDate(int pIdPerson, String pDate) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
        
        java.util.Date myDate = new java.util.Date(pDate);
        java.sql.Date sqlDate = new java.sql.Date(myDate.getTime());
        
        
        CallableStatement stmt=conn.prepareCall("{ call packagePerson.updatePersonBirthDate(?, ?)}");
        stmt.setInt(1, pIdPerson);
        stmt.setDate(2, sqlDate);
        stmt.execute();
        
        }
    
    public static void updatePersonName(int pIdPerson, String pName) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
 
        CallableStatement stmt=conn.prepareCall("{ call packagePerson.updatePersonName(?, ?)}");
        stmt.setInt(1, pIdPerson);
        stmt.setString(2, pName);
        stmt.execute();
        }
    
    public static void updatePersonFirstLastName(int pIdPerson, String pLastName) throws SQLException{
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
 
        CallableStatement stmt=conn.prepareCall("{ call packagePerson.updatePersonFirstLastName(?, ?)}");
        stmt.setInt(1, pIdPerson);
        stmt.setString(2, pLastName);
        stmt.execute();
        }
    
    
    
    public static void updatePersonSecondLastName(int pIdPerson, String pLastName) throws SQLException{
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
 
        CallableStatement stmt=conn.prepareCall("{ call packagePerson.updatePersonSecondLastName(?, ?)}");
        stmt.setInt(1, pIdPerson);
        stmt.setString(2, pLastName);
        stmt.execute();
        }
    
    public static java.sql.Date getPersonBirthdate(int pValue) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packagePerson.getPersonBirthdate(?)}");
        stmt.registerOutParameter(1, java.sql.Types.DATE);
        stmt.setInt(2, pValue);
        stmt.execute();
        java.sql.Date result = stmt.getDate(1);
        return result;
    
    }
    
    public static String getPersonFirstName(int pValue) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packagePerson.getPersonFirstName(?)}");
        stmt.registerOutParameter(1, java.sql.Types.VARCHAR);
        stmt.setInt(2, pValue);
        stmt.execute();
        String result = stmt.getString(1);
        return result;
    
    }
    
    public static String getPersonSecondLastName(int pValue) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packagePerson.getPersonSecondLastName(?)}");
        stmt.registerOutParameter(1, java.sql.Types.VARCHAR);
        stmt.setInt(2, pValue);
        stmt.execute();
        String result = stmt.getString(1);
        return result;
    
    }
    
    public static String getPersonFirstLastName(int pValue) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packagePerson.getPersonFirstLastName(?)}");
        stmt.registerOutParameter(1, java.sql.Types.VARCHAR);
        stmt.setInt(2, pValue);
        stmt.execute();
        String result = stmt.getString(1);
        return result;
    
    }
    
    
    
    public static int getPersonIdLogIn(int pValue) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packagePerson.getPersonIdLogIn(?)}");
        stmt.registerOutParameter(1, java.sql.Types.INTEGER);
        stmt.setInt(2, pValue);
        stmt.execute();
        int result = stmt.getInt(1);
        return result;
    
    }
    
    public static int getPersonIdCommunity(int pValue) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packagePerson.getPersonIdCommunity(?)}");
        stmt.registerOutParameter(1, java.sql.Types.INTEGER);
        stmt.setInt(2, pValue);
        stmt.execute();
        int result = stmt.getInt(1);
        return result;
    
    }
    
    //---------------------------------------------
    //*****procedimientos y funciones Person Photo*****
    //---------------------------------------------
    
    public static void createPersonPhoto(String pPhoto, int pValue) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packagePersonPhoto.createPersonPhoto(?, ?)}");
        stmt.setString(1, pPhoto);
        stmt.setInt(2, pValue);
        
        stmt.execute();
        
        }
    
    public static void updatePersonPhoto(int pValue, String pPhoto) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packagePersonPhoto.updatePersonPhoto(?, ?)}");
        stmt.setInt(1, pValue);
        stmt.setString(2, pPhoto);
        stmt.execute();
        }
    
    public static void deletePersonPhoto(int pValue) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packagePersonPhoto.delePerson(?)}");
        stmt.setInt(1, pValue);
        stmt.execute();
        }
    
    public static String getPersonPhotoContent(int pValue) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packagePersonPhoto.getPersonPhotoContent(?)}");
        stmt.registerOutParameter(1, java.sql.Types.VARCHAR);
        stmt.setInt(2, pValue);
        stmt.execute();
        String result = stmt.getString(1);
        return result;
    
    }
    
    //---------------------------------------------
    //*****procedimientos y funciones PersonXCategory*****
    //---------------------------------------------
    public static void createPersonXCategory(int pIdPerson, int pIdCategory) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packagePersonXCategory.createPersonxCategory(?, ?)}");
        stmt.setInt(1, pIdPerson);
        stmt.setInt(2, pIdCategory);
        
        stmt.execute();
        
        }
    
    public static void deletePersonXCategory(int pIdPerson, int pIdCategory) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packagePersonXCategory.deletePersonxCategory(?, ?)}");
        stmt.setInt(1, pIdPerson);
        stmt.setInt(2, pIdCategory);
        
        stmt.execute();
        
        }
    
    //---------------------------------------------
    //*****procedimientos y funciones Phone*****
    //---------------------------------------------
    public static void createPhone(String pPhone, int pIdPerson) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packagePhone.createPhone(?, ?)}");
        stmt.setString(1, pPhone);
        stmt.setInt(2, pIdPerson);
        
        stmt.execute();
        
        }
    
    public static void deletePhone(String pPhone) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packagePhone.deletePhone(?)}");
        stmt.setString(1, pPhone);
        
        stmt.execute();
        
        }
    
    public static void updatePhone(String pPhone, String pPhoneNew) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packagePhone.updatePhone(?, ?)}");
        stmt.setString(1, pPhone);
        stmt.setString(2, pPhoneNew);
        
        stmt.execute();
        
        }
    
    public static int getPhoneIdPerson(String pPhone) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packagePhone.getIdPerson(?)}");
        stmt.registerOutParameter(1, java.sql.Types.INTEGER);
        stmt.setString(2, pPhone);
        stmt.execute();
        int result = stmt.getInt(1);
        return result;
        
        }
    //---------------------------------------------
    //*****procedimientos y funciones Proposal*****
    //---------------------------------------------
    public static int getProposalBudget(int pIdProposal) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packageProposal.getBudget(?)}");
        stmt.registerOutParameter(1, java.sql.Types.INTEGER);
        stmt.setInt(2, pIdProposal);
        stmt.execute();
        int result = stmt.getInt(1);
        return result;
        
        }
    
    public static int getProposalIdPerson(int pIdProposal) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packageProposal.getIdPerson(?)}");
        stmt.registerOutParameter(1, java.sql.Types.INTEGER);
        stmt.setInt(2, pIdProposal);
        stmt.execute();
        int result = stmt.getInt(1);
        return result;
        
        }
    public static int getProposalIdCommunity(int pIdProposal) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packageProposal.getIdPerson(?)}");
        stmt.registerOutParameter(1, java.sql.Types.INTEGER);
        stmt.setInt(2, pIdProposal);
        stmt.execute();
        int result = stmt.getInt(1);
        return result;
        
        }
    
    public static String getProposalSummary(int pIdProposal) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packageProposal.getSummary(?)}");
        stmt.registerOutParameter(1, java.sql.Types.VARCHAR);
        stmt.setInt(2, pIdProposal);
        stmt.execute();
        String result = stmt.getString(1);
        return result;
        
        }
    
    public static String getProposalTitle(int pIdProposal) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packageProposal.getTitle(?)}");
        stmt.registerOutParameter(1, java.sql.Types.VARCHAR);
        stmt.setInt(2, pIdProposal);
        stmt.execute();
        String result = stmt.getString(1);
        return result;
        
        }
    
    
    
    public static void createProposal(String pTitle, int pBudget, String pSummary,int pIdPerson, int pCategory) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageProposal.createProposal(?,?,?,?,?)}");
        stmt.setString(1, pTitle);
        stmt.setInt(2, pBudget);
        stmt.setString(3, pSummary);
        stmt.setInt(4, pIdPerson);
        stmt.setInt(5, pCategory);
        stmt.execute();
        
        }
    
    public static void deleteProposal(int pIdProposal) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageProposal.deleteProposal(?)}");
        stmt.setInt(1, pIdProposal);
        
        stmt.execute();
        
        }
    
    public static void updateProposalTitle(int pIdProposal, String pTitle) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageProposal.updateTitle(?, ?)}");
        stmt.setInt(1, pIdProposal);
        stmt.setString(2, pTitle);
        
        stmt.execute();
        
        }
    
    //---------------------------------------------
    //*****procedimientos y funciones ProposalPhoto*****
    //---------------------------------------------
    
     public static void createProposalPhoto(String pPhoto, int pIdProposal) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageProposalPhoto.createProposalPhoto(?, ?)}");
        stmt.setString(1, pPhoto);
        stmt.setInt(2, pIdProposal);
        
        stmt.execute();
        
        }
    
    public static void updateProposalPhoto(int pValue, String pPhoto) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageProposalPhoto.updateContent(?, ?)}");
        stmt.setInt(1, pValue);
        stmt.setString(2, pPhoto);
        stmt.execute();
        }
    
    public static void deleteProsposalPhoto(int pValue) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageProposalPhoto.deleteProposalPhoto(?)}");
        stmt.setInt(1, pValue);
        stmt.execute();
        }
    
    public static String getProposalPhotoContent(int pValue) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packageProposalPhoto.getContent(?)}");
        stmt.registerOutParameter(1, java.sql.Types.VARCHAR);
        stmt.setInt(2, pValue);
        stmt.execute();
        String result = stmt.getString(1);
        return result;}
    
    //---------------------------------------------
    //*****procedimientos y funciones ProposalPhoto*****
    //---------------------------------------------
    
    public static void createProposalXCategory(int pIdProposal, int pIdCategory) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageProposalXCategory.createProposalxCategory(?, ?)}");
        stmt.setInt(1, pIdProposal);
        stmt.setInt(2, pIdCategory);
        
        stmt.execute();
        
        }
    
    public static void deleteProposalXCategory(int pIdProposal, int pIdCategory) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageProposalXCategory.deleteProposalxCategory(?, ?)}");
        stmt.setInt(1, pIdProposal);
        stmt.setInt(2, pIdCategory);
        
        stmt.execute();
        
        }
    
    //---------------------------------------------
    //*****procedimientos y funciones Province*****
    //---------------------------------------------
    public static int getProvinceIdCountry(int pValue) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packageProvince.getIdCountry(?)}");
        stmt.registerOutParameter(1, java.sql.Types.INTEGER);
        stmt.setInt(2, pValue);
        stmt.execute();
        int result = stmt.getInt(1);
        return result;
        
        }
    
    public static String getProvinceName(int pValue) throws SQLException{
        
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
        
        CallableStatement stmt=conn.prepareCall("{?= call packageProvince.getName(?)}");
        stmt.registerOutParameter(1, java.sql.Types.VARCHAR);
        stmt.setInt(2, pValue);
        stmt.execute();
        String result = stmt.getString(1);
        return result;
        
        }
    
    public static void createProvince(String pName, int pValue) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageProvince.createProvince(?,?)}");
        
        stmt.setString(1, pName);
        stmt.setInt(2, pValue);
        stmt.execute();
        }
    
    public static void updateProvinceName(int pValue, String pName) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageProvince.updateProvinceName(?,?)}");
        
        stmt.setInt(1, pValue);
        stmt.setString(2, pName);
        stmt.execute();
        }
    
    public static void deleteProvince(int pValue) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageProvince.deleteProvince(?)}");
        
        stmt.setInt(1, pValue);
        stmt.execute();
        }
    
    
    
    //---------------------------------------------
    //*****procedimientos y funciones Vote*****
    //---------------------------------------------
    public static void createVote(int pEmote, int pIdProposal, int pIdPerson) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageVote.createVote(?,?,?)}");
        
        stmt.setInt(1, pEmote);
        stmt.setInt(2, pIdProposal);
        stmt.setInt(3, pIdPerson);
        stmt.execute();
        }
    
    public static void updateVoteEmote(int pId, int pIdEmote) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageVote.updateEmote(?,?)}");
        
        stmt.setInt(1, pId);
        stmt.setInt(2, pIdEmote);
        stmt.execute();
        }
    
    public static void deleteVote(int pId) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{ call packageVote.deleteVote(?)}");
        
        stmt.setInt(1, pId);
        stmt.execute();
        }
    
    public static int getVoteEmote(int pId) throws SQLException{
        
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
        
        CallableStatement stmt=conn.prepareCall("{?= call packageVote.getEmote(?)}");
        stmt.registerOutParameter(1, java.sql.Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int result = stmt.getInt(1);
        return result;
        
        }
    
    public static int getVoteIdProposal(int pId) throws SQLException{
        
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
        
        CallableStatement stmt=conn.prepareCall("{?= call packageVote.getIdProposal(?)}");
        stmt.registerOutParameter(1, java.sql.Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int result = stmt.getInt(1);
        return result;
        
        }
    
    public static int getVoteIdPerson(int pId) throws SQLException{
        
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
        
        CallableStatement stmt=conn.prepareCall("{?= call packageVote.getIdPerson(?)}");
        stmt.registerOutParameter(1, java.sql.Types.INTEGER);
        stmt.setInt(2, pId);
        stmt.execute();
        int result = stmt.getInt(1);
        return result;
        
        }
    
    public static void getPersons() throws SQLException{
        
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
        
        CallableStatement stmt=conn.prepareCall("{?= call cursorPerson}");
        stmt.registerOutParameter(1, OracleTypes.CURSOR);
        
        stmt.executeQuery();
        ResultSet r = (ResultSet) stmt.getObject(1);
        
        while(r.next()){
            System.out.println(r.getString("NAME")+" "+r.getInt("ID_PERSON"));
        }
    }
    
    public static ArrayList<Integer> getProposalFeed(int pIdCommunity)throws SQLException{
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
        
        CallableStatement stmt=conn.prepareCall("{?= call getProposalFeed(?)}");
        stmt.registerOutParameter(1, OracleTypes.CURSOR);
        stmt.setInt(2, pIdCommunity);
        ArrayList<Integer> res=new ArrayList<Integer>();
        stmt.executeQuery();
        ResultSet r = (ResultSet) stmt.getObject(1);
        
        while(r.next()){
            res.add(r.getInt("ID_PROPOSAL"));
            //System.out.println(r.getString("id_proposal"));
        }
        return res;
        }
    
    public static ArrayList<Integer> getProposalProfile(int pIdPerson)throws SQLException{
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
        
        CallableStatement stmt=conn.prepareCall("{?= call getProposalProfile(?)}");
        stmt.registerOutParameter(1, OracleTypes.CURSOR);
        stmt.setInt(2, pIdPerson);
        ArrayList<Integer> res=new ArrayList<Integer>();
        stmt.executeQuery();
        ResultSet r = (ResultSet) stmt.getObject(1);
        
        while(r.next()){
            res.add(r.getInt("ID_PROPOSAL"));
            //System.out.println(r.getString("id_proposal"));
        }
        return res;
        }
    
        public static ArrayList<Integer> getProvincesId()throws SQLException{
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
        
        CallableStatement stmt=conn.prepareCall("{?= call getAllProvince}");
        stmt.registerOutParameter(1, OracleTypes.CURSOR);
        ArrayList<Integer> res=new ArrayList<Integer>();
        stmt.executeQuery();
        ResultSet r = (ResultSet) stmt.getObject(1);
        
        while(r.next()){
            res.add(r.getInt("ID_PROVINCE"));
            //System.out.println(r.getString("id_proposal"));
        }
        return res;
        }
        
        public static ArrayList<String> getProvincesName()throws SQLException{
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
        
        CallableStatement stmt=conn.prepareCall("{?= call getAllProvince}");
        stmt.registerOutParameter(1, OracleTypes.CURSOR);
        ArrayList<String> res=new ArrayList<String>();
        stmt.executeQuery();
        ResultSet r = (ResultSet) stmt.getObject(1);
        
        while(r.next()){
            res.add(r.getString("NAME"));
            //System.out.println(r.getString("id_proposal"));
        }
        return res;
        }
        
        public static ArrayList<String> getCantonsName()throws SQLException{
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
        
        CallableStatement stmt=conn.prepareCall("{?= call getAllCanton}");
        stmt.registerOutParameter(1, OracleTypes.CURSOR);
        ArrayList<String> res=new ArrayList<String>();
        stmt.executeQuery();
        ResultSet r = (ResultSet) stmt.getObject(1);
        
        while(r.next()){
            res.add(r.getString("NAME"));
            //System.out.println(r.getString("id_proposal"));
        }
        return res;
        }
        
        public static ArrayList<String> getCommunitysName()throws SQLException{
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
        
        CallableStatement stmt=conn.prepareCall("{?= call getAllCommunity}");
        stmt.registerOutParameter(1, OracleTypes.CURSOR);
        ArrayList<String> res=new ArrayList<String>();
        stmt.executeQuery();
        ResultSet r = (ResultSet) stmt.getObject(1);
        
        while(r.next()){
            res.add(r.getString("NAME"));
            //System.out.println(r.getString("id_proposal"));
        }
        return res;
        }
        
        public static ArrayList<String> getCountrysName()throws SQLException{
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
        
        CallableStatement stmt=conn.prepareCall("{?= call getAllCountry}");
        stmt.registerOutParameter(1, OracleTypes.CURSOR);
        ArrayList<String> res=new ArrayList<String>();
        stmt.executeQuery();
        ResultSet r = (ResultSet) stmt.getObject(1);
        
        while(r.next()){
            res.add(r.getString("NAME"));
            //System.out.println(r.getString("id_proposal"));
        }
        return res;
        }
        
        public static ArrayList<String> getCategorysName()throws SQLException{
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
        
        CallableStatement stmt=conn.prepareCall("{?= call getAllCategory}");
        stmt.registerOutParameter(1, OracleTypes.CURSOR);
        ArrayList<String> res=new ArrayList<String>();
        stmt.executeQuery();
        ResultSet r = (ResultSet) stmt.getObject(1);
        
        while(r.next()){
            res.add(r.getString("NAME"));
            //System.out.println(r.getString("id_proposal"));
        }
        return res;
        }

    public static ArrayList<Integer> getProposalFeed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static String getIdCanton(String name) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packageCanton.getIdCanton(?)}");
        stmt.registerOutParameter(1, java.sql.Types.INTEGER);
        stmt.setString(2, name);
        stmt.execute();
        String result = stmt.getString(1);
        return result;
        
        }
    
    public static int getIdCategory(String name) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packageCAtegory.getIdCategory(?)}");
        stmt.registerOutParameter(1, java.sql.Types.INTEGER);
        stmt.setString(2, name);
        stmt.execute();
        int result = stmt.getInt(1);
        return result;
        
        }
    
    public static int getIdCommunity(String name) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packageCommunity.getIdCommunity(?)}");
        stmt.registerOutParameter(1, java.sql.Types.INTEGER);
        stmt.setString(2, name);
        stmt.execute();
        int result = stmt.getInt(1);
        return result;
        
        }
    
    public static String getIdCountry(String name) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packageCountry.getIdCountry(?)}");
        stmt.registerOutParameter(1, java.sql.Types.INTEGER);
        stmt.setString(2, name);
        stmt.execute();
        String result = stmt.getString(1);
        return result;
        
        }
    
    public static String getIdProvince(String name) throws SQLException{
       
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packageProvince.getIdProvince(?)}");
        stmt.registerOutParameter(1, java.sql.Types.INTEGER);
        stmt.setString(2, name);
        stmt.execute();
        String result = stmt.getString(1);
        return result;
        
        }
    
        public static int getProposalIdCategory(int pValue) throws SQLException{
        
        ConnectDB dataConnection= ConnectDB.getInstance();
        Connection conn=dataConnection.getConnection();
                
        CallableStatement stmt=conn.prepareCall("{?= call packageProposalXCategory.getProposalIdCategory(?)}");
        stmt.registerOutParameter(1, java.sql.Types.INTEGER);
        stmt.setInt(2, pValue);
        stmt.execute();
        int result = stmt.getInt(1);
        return result;
        
        }
    
    }
    



        