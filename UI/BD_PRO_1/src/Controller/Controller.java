/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DA.DataHandler;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mau
 */
public class Controller {
    
    private int idPerson;
    private static Controller Instance=null;
    
    public static Controller getInstance(){
        if(Instance==null){
            Instance= new Controller();
        }
        return Instance;
    }
    
    public void setIdPerson(int idPerson){
        this.idPerson=idPerson;
    }
    
    public int getIdPerson(){
        return idPerson;
    }
    
    
    
    public static boolean correctLog(int idUser, String pass) throws SQLException{
        if(DataHandler.getLogInPassword(idUser).equals(pass)){
            return true;
        }
        else{
            return false;
        }
    }
        
   
    public static boolean isAdmin(int id) throws SQLException{
        if(DataHandler.getLogInUserType(id)==2){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    public static String getCommunityName(int id) throws SQLException{
        int idCommu=DataHandler.getPersonIdCommunity(id);
        return DataHandler.getCommunityName(idCommu);
    }
    
    public static ArrayList<String> getProvincesNames() throws SQLException{
        return DataHandler.getProvincesName();
    }
    
    public static ArrayList<String> getContrysNames() throws SQLException{
        return DataHandler.getCountrysName();
    }
    
    public static ArrayList<String> getCantonsNames() throws SQLException{
        return DataHandler.getCantonsName();
    }
    
    public static ArrayList<String> getCommunitysNames() throws SQLException{
        return DataHandler.getCommunitysName();
    }
    
    public static ArrayList<String> getCategorysNames() throws SQLException{
        return DataHandler.getCategorysName();
    }
    
    public  ArrayList<Integer> getProposalFeed() throws SQLException{
        int idCommu=DataHandler.getPersonIdCommunity(idPerson);
        return DataHandler.getProposalFeed(idCommu);
    }
    
    public  ArrayList<Integer> getProposalProfile() throws SQLException{
        return DataHandler.getProposalProfile(idPerson);
    }
    
    public static String getProposalTitle(int idProp) throws SQLException{
        return DataHandler.getProposalTitle(idProp);
    }
    
    public static String getProposalContent(int idProp) throws SQLException{
        return DataHandler.getProposalSummary(idProp);
    }
    
    public static int getProposalBudget(int idProp) throws SQLException{
        return DataHandler.getProposalBudget(idProp);
    }

    public int getProposalFeed(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public  int getPersonIdCommunity() throws SQLException{
        return DataHandler.getPersonIdCommunity(idPerson);
    }
    
    public String getCategoryName(int id) throws SQLException{
        return DataHandler.getCategoryName(id);
    }

    public int getProposalIdCategory(int id) throws SQLException{
        return DataHandler.getProposalIdCategory(id);
    }
    
    public int getIdCategory(String category) throws SQLException{
        return DataHandler.getIdCategory(category);
       }
    
    public void createProposal(String title, int budget, String content, String category) throws SQLException{
        DataHandler.createProposal(title, budget, content, idPerson, getIdCategory(category));
        
    }
    
    public int getCategoryID(String category) throws SQLException{
        return DataHandler.getIdCategory(category);
    }

    public String getPersonName(int id) throws SQLException{
        return DataHandler.getPersonFirstName(id);
    }
    
    public String getPersonFirstLastName(int id) throws SQLException{
        return DataHandler.getPersonFirstLastName(id);
    }
    
    public String getPersonSecondLastName(int id) throws SQLException{
        return DataHandler.getPersonSecondLastName(id);
    }
    
    public String getPersonEmail(int id) throws SQLException{
        return DataHandler.getEmailAddress(id);
    }
    
    public String getPersonPhone(int id) throws SQLException{
        return DataHandler.getTelephone(id);
    }
    
    public int getIdCommunity(String commu) throws SQLException{
        return DataHandler.getIdCommunity(commu);
    }
    public void updatePerson(String name, String lastName, String lastName2,String email, String phone) throws SQLException{
        DataHandler.updatePersonName(idPerson, name);
        DataHandler.updatePersonFirstLastName(idPerson, lastName);
        DataHandler.updatePersonSecondLastName(idPerson, lastName2);
        DataHandler.updateEmailAddress(idPerson, email);
        DataHandler.updatePhone(getPersonPhone(idPerson), phone);
        
    }
    
    public void createPerson(int id, String name,String lastName, String lastName2, String community, String pass, String phone, String email) throws SQLException{
        DataHandler.createPerson(id, name, lastName, lastName2, "1/1/97", getIdCommunity(community));
        DataHandler.createLogIn(id, pass, 3);
        DataHandler.createPhone(phone, id);
        DataHandler.createEmail(email, id);
    }
}

